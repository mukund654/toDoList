package com.app.todoApp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import com.app.todoApp.TodoAppApplication;
import com.app.todoApp.models.Task;
import com.app.todoApp.services.TaskService;

@Controller
// @RequestMapping("/tasks")
public class TaskController {

   // private final TodoAppApplication todoAppApplication;

    private final TaskService ts;

    public TaskController(TaskService ts) {
        this.ts = ts;
        //this.todoAppApplication = todoAppApplication;
    }

    // the tasks we returning as a string is a thymeleaf template and we are passing
    // tasks to it
    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = ts.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping
    public String createTasks(@RequestParam String title) {
        ts.createTasks(title);

        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTasks(@PathVariable Long id) {

        ts.deleteTasks(id);
        return "redirect:/";
    }

    @PostMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id) {

        ts.toggleTasks(id);
        return "redirect:/";
    }

}
