package ru.aston.homework4.dto.response;

import java.time.LocalDateTime;

public record UserDTO
        (
        Long id,
        String name,
        String email,
        Integer age,
        LocalDateTime createdAt
) {}
