package com.example.todo_app.todo;

import jakarta.validation.constraints.NotBlank;

public class CreateTodoDTO {
    @NotBlank
    private String title;

    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
