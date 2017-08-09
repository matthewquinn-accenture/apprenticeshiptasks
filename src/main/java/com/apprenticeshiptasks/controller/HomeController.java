package com.apprenticeshiptasks.controller;

import com.apprenticeshiptasks.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private TasksRepository tasksRepository;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("taskslist", tasksRepository.findAll());
        return "home";
    }
}
