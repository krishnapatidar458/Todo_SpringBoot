package com.backend.Todo.controller;

import com.backend.Todo.model.TodoItem;
import com.backend.Todo.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController{


    private final TodoServiceImpl todoService;

    @Autowired
    public TodoController(TodoServiceImpl todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<List<TodoItem>> getAllTodos(){
        return ResponseEntity.ok(todoService.getAllTodos());
    }

    @GetMapping("/{Id}")
    public ResponseEntity<TodoItem> getTodoById(@PathVariable Long Id){
        return todoService.getTodoById(Id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TodoItem> createTodo(@RequestBody TodoItem todo){
         return new ResponseEntity<>(todoService.createTodo(todo),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoItem> updateTodo(@RequestBody TodoItem todo, @PathVariable Long id){
        return todoService.updateTodo(todo,id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long Id){
        todoService.deleteTodo(Id);
        return ResponseEntity.noContent().build();
    }
}
