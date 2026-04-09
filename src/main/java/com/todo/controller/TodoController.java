package com.todo.controller;

import com.todo.model.Todo;
import com.todo.service.TodoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService service = new TodoService();

    @GetMapping
    public List<Todo> getTodos() {
        return service.getAllTodos();
    }

    @PostMapping
    public String addTodo(@RequestBody Todo todo) {
        service.addTodo(todo);
        return "Todo added successfully";
    }
}
