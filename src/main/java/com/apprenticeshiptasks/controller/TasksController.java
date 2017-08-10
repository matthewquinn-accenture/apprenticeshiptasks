package com.apprenticeshiptasks.controller;

import com.apprenticeshiptasks.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TasksController {

    @Autowired
    private TasksRepository tasksRepository;

    @RequestMapping("/task/{id}")
    public String task(@PathVariable long id, Model model) {
        model.addAttribute("task", tasksRepository.findOne(id));
        return "task";
    }

    @RequestMapping("/task/delete/{id}")
    public String deleteTask(@PathVariable long id){
        tasksRepository.delete(id);
        return "redirect:/";
    }

}
