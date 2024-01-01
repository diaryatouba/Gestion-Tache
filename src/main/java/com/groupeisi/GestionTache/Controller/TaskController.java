package com.groupeisi.GestionTache.Controller;

import com.groupeisi.GestionTache.Entity.Task;
import com.groupeisi.GestionTache.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// TaskController.java
@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public String listTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "task/list";
    }

    @GetMapping("/add")
    public String showAddTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "task/add";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute("task") Task task) {
        taskService.addTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
}

