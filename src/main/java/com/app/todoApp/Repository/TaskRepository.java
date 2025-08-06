package com.app.todoApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.todoApp.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
