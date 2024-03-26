package com.example.springbootcourse.service;

import com.example.springbootcourse.model.dto.TodoListDto;
import com.example.springbootcourse.model.mapper.TodoListMapper;
import com.example.springbootcourse.repository.TodoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoListRepository todoListRepository;

    public TodoListDto saveTodo(TodoListDto todo) {
        return TodoListMapper.toDto(
                todoListRepository.save(TodoListMapper.toEntity(todo))
        );
    }

    public List<TodoListDto> getTodos() {
        return todoListRepository.findAll()
                .stream()
                .map(TodoListMapper::toDto)
                .toList();
    }
}
