package com.example.springbootcourse.model.dto;

import java.util.List;

public record TodoListDto(
        String name,
        List<String> events
) {
}
