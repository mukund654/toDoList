package com.app.todoApp.controller;


import org.springframework.stereotype.Controller;

import com.app.todoApp.services.TaskService;

@Controller
public class TaskController {

    private final TaskService ts;
    public TaskController(TaskService ts) {
        this.ts = ts;
    }
}
