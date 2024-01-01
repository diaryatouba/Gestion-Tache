package com.groupeisi.GestionTache.Repository;

import com.groupeisi.GestionTache.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByDescription(String description);


    List<Task> findByDueDate(Date dueDate);

    List<Task> findByCompleted(boolean completed);


}

