package com.example.springbootcourse.model.mapper;

import com.example.springbootcourse.model.dto.TodoListDto;
import com.example.springbootcourse.model.entity.TodoList;

import java.util.HashSet;
import java.util.stream.Collectors;

public class TodoListMapper {

    public static TodoListDto toDto(TodoList todoList) {
        return new TodoListDto(
                todoList.getName(),
                todoList.getEvents()
                        .stream()
                        .map(EventMapper::toDto)
                        .toList()
        );
    }


    public static TodoList toEntity(TodoListDto todoListDto) {
        var entity = new TodoList();
        entity.setName(todoListDto.name());
        entity.setEvents(
                todoListDto.events()
                        .stream()
                        .map(EventMapper::toEntity)
                        .collect(Collectors.toCollection(HashSet::new))
        );
        return entity;
    }
}
