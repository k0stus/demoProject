package com.studies.demoProject.service;

import com.studies.demoProject.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Optional<Task> getTaskById(Long id) {
        return tasks.stream().filter(t -> t.getId().equals(id)).findFirst();
    }

    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }

    public boolean deleteTask(Long id) {
        return tasks.removeIf(t -> t.getId().equals(id));
    }

    public Optional<Task> markAsCompleted(Long id) {
        Optional<Task> task = getTaskById(id);
        task.ifPresent(t -> t.setCompleted(true));
        return task;
    }
}