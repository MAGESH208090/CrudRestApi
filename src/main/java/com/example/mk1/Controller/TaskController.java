package com.example.mk1.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.mk1.entity.Task;
import com.example.mk1.service.TaskService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // REST API
    @GetMapping("/api/get")
    public ResponseEntity <List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PostMapping("/api/post")
    @ResponseBody
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @PutMapping("/api/put/{id}")
    @ResponseBody
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        Optional<Task> optionalTask = taskService.getTaskById(id);
    
        if (optionalTask.isPresent()) {
            Task existingTask = optionalTask.get();
            existingTask.setName(updatedTask.getName());
            existingTask.setDate(updatedTask.getDate());
            existingTask.setCompleted(updatedTask.isCompleted());
        
            Task savedTask = taskService.updateTask(existingTask);
            return ResponseEntity.ok(savedTask);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/api/delete/{id}")
    @ResponseBody
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task with id " + id + " has been deleted successfully.";
    }
}