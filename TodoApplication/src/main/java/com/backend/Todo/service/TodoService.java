package com.backend.Todo.service;


import com.backend.Todo.model.TodoItem;

import java.util.List;
import java.util.Optional;

public interface TodoService{
    List<TodoItem> getAllTodos();
    Optional<TodoItem> getTodoById(Long id);
    TodoItem createTodo(TodoItem todo);
    Optional<TodoItem> updateTodo(TodoItem update,Long id);
    void deleteTodo(Long id);
}
