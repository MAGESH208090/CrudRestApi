package com.example.mk1.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class HomeController {



    @GetMapping("/home")
    public String getAllTasks(Model model) {
        return "addtodo"; // this is the name of your JSP file (e.g., tasks.jsp)
    }
}