package com.example.springbootcourse.controller;

import com.example.springbootcourse.model.dto.TodoListDto;
import com.example.springbootcourse.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TodoListController {
    private final TodoService todoService;

    @PostMapping(
            value = "/saveTodo",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody TodoListDto saveTodoList(@RequestBody TodoListDto todoList) {
        return todoService.saveTodo(todoList);
    }

    @GetMapping("/todos")
    public @ResponseBody List<TodoListDto> getTodos() {
        return todoService.getTodos();
    }
}
