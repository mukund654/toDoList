package com.app.todoApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.todoApp.Repository.TaskRepository;
import com.app.todoApp.models.Task;


@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllTasks'");
        // we will gets the tasks from data base using repository


        return taskRepository.findAll();
        // this returns list of all tasks
        


    }

    public void createTasks(String title) {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createTasks'");

        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTasks(Long id) {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deleteTasks'");

        taskRepository.deleteById(id);
         
    }

    public void toggleTasks(Long id) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'toggleTasks'");

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task ID"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }

}
