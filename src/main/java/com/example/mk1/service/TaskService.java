package com.example.mk1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mk1.entity.Tasks;
import com.example.mk1.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Tasks> getAllTasks() {
        return taskRepository.findAll();
    }

    public  Tasks saveTask(Tasks task) {
        return taskRepository.save(task);
    }

    public Optional<Tasks> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Tasks updateTask(Tasks task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
