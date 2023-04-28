package com.app.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class TodoController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("hello");
    }

}