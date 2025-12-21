package ru.aston.homework4.dto.request;

import jakarta.validation.constraints.*;

public record UserCreateDTO(
        @NotBlank(message = "Имя обязательно")
        @Size(min = 2, max = 50, message = "Имя должно быть от 2 до 50 символов")
        String name,

        @NotBlank(message = "Email обязателен")
        @Email(message = "Некорректный формат email")
        String email,

        @Min(value = 0, message = "Возраст не может быть отрицательным")
        @Max(value = 150, message = "Введите корректный возраст")
        Integer age
) {}