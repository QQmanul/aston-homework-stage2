package ru.aston.homework4.dto.response;

import java.time.LocalDateTime;
import java.util.Map;

public record ErrorDTO(
        int status,
        String message,
        LocalDateTime timestamp,
        Map<String, String> errors
) {
    public ErrorDTO(int status, String message) {
        this(status, message, LocalDateTime.now(), null);
    }

    public ErrorDTO(int status, String message, Map<String, String> errors) {
        this(status, message, LocalDateTime.now(), errors);
    }
}