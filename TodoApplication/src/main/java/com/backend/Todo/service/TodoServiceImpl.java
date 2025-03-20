package com.backend.Todo.service;

import com.backend.Todo.model.TodoItem;
import com.backend.Todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService{

    private final TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<TodoItem> getAllTodos(){
        return todoRepository.findAll();
    }

    @Override
    public Optional<TodoItem> getTodoById(Long id){
        return todoRepository.findById(id);
    }

    @Override
    public TodoItem createTodo(TodoItem todo){
        return todoRepository.save(todo);
    }

    @Override
    @Transactional
    public Optional<TodoItem> updateTodo(TodoItem update, Long id){
        return todoRepository.findById(id).map(exist -> {
            exist.setTitle(update.getTitle());
            exist.setIsDone(update.getIsDone());
            return todoRepository.save(update);
        });
    }

    @Override
    public void deleteTodo(Long id){
        todoRepository.deleteById(id);
    }
}
