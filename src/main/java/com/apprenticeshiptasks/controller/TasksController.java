package com.apprenticeshiptasks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TasksController {

    @RequestMapping("/task")
    public String task(Model model) {
        model.addAttribute("task", "apple");
        return "task";
    }

}
