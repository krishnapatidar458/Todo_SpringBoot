package com.backend.Todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;
    private Boolean isDone;

    public TodoItem(){}

    //constructor
    public TodoItem(String title, Boolean isDone) {
        this.title = title;
        this.isDone = isDone;
    }

    //getters
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Boolean getIsDone() {
        return isDone;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setIsDone(Boolean done) {
        isDone = done;
    }
}
