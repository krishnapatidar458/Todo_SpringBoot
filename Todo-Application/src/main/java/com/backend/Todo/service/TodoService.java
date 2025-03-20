package com.backend.Todo.service;

import com.backend.Todo.model.TodoItem;
import com.backend.Todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<TodoItem> getAllTodos(){
        return todoRepository.findAll();
    }

    public Optional<TodoItem> getTodoById(Long Id){
        return todoRepository.findById(Id);
    }

    public TodoItem createTodo(TodoItem todo){
        return todoRepository.save(todo);
    }

    public Optional<TodoItem> updateTodo(TodoItem update,Long Id){
        return todoRepository.findById(Id)
                .map(exist -> {
                    exist.setTitle(update.getTitle());
                    exist.setIsDone(update.getIsDone());
                    return todoRepository.save(exist);
                });
    }

    public void deleteTodo(Long id){
        todoRepository.deleteById(id);
    }
}
