package com.todo.service;

import com.todo.model.Todo;
import com.todo.repository.TodoRepository;

import java.util.List;

public class TodoService {

    private TodoRepository repository = new TodoRepository();

    public List<Todo> getAllTodos() {
        return repository.findAll();
    }

    public void addTodo(Todo todo) {
        repository.save(todo);
    }
}
