package com.studies.demoProject.controller;

import com.studies.demoProject.model.Task;
import com.studies.demoProject.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        System.out.printlt(taskService.getAllTasks());
    }

    @GetMapping("/{id}")
    public Optional<Task> getTask(@PathVariable Long id) {
        System.out.println("hello world");
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTask(@PathVariable Long id) {
        return taskService.deleteTask(id);
    }

    @PutMapping("/{id}/complete")
    public Optional<Task> markAsCompleted(@PathVariable Long id) {
        return taskService.markAsCompleted(id);
    }
}
