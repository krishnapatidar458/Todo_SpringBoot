package com.backend.Todo.controller;

import com.backend.Todo.model.TodoItem;
import com.backend.Todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class TodoController{

    @Autowired
    public TodoService todoService;

    @GetMapping("/all")
    public List<TodoItem> getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping("/{Id}")
    public Optional<TodoItem> getTodoById(@PathVariable Long Id){
        return todoService.getTodoById(Id);
    }

    @PostMapping("/create")
    public TodoItem createTodo(@RequestBody TodoItem todo){
         return todoService.createTodo(todo);
    }

    @PutMapping("/{Id}")
    public Optional<TodoItem> updateTodo(@RequestBody TodoItem todo,@PathVariable Long Id){
        return todoService.updateTodo(todo,Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteTodo(@PathVariable Long Id){
        todoService.deleteTodo(Id);
    }
}
