package com.groupeisi.GestionTache.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class TaskDto {

    private Long id;

    @NotNull(message = "La description ne doit pas être null")
    private String description;

    private Date dueDate;

    private boolean completed;

}
