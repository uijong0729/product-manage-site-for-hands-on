package com.app.todo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity(name = "todo")
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @Column(name = "user_id", length = 50, nullable = false, unique = true)
    String userId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    
    @Column(name = "title")
    String title;
    
    @Column(name = "completed")
    boolean completed;
}
