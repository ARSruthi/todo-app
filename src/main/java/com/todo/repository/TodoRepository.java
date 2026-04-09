package com.todo.repository;

import com.todo.model.Todo;
import java.util.ArrayList;
import java.util.List;

public class TodoRepository {

    private List<Todo> todoList = new ArrayList<>();

    public List<Todo> findAll() {
        return todoList;
    }

    public void save(Todo todo) {
        todoList.add(todo);
    }
}
