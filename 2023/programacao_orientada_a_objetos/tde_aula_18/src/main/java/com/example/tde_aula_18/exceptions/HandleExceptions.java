package com.example.tde_aula_18.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleExceptions {
    @ExceptionHandler(NotFoundAuthor.class)
    public ResponseEntity<String> handleNotFoundException(NotFoundAuthor exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
    @ExceptionHandler(NotFoundBook.class)
    public ResponseEntity<String> handleNotFoundException(NotFoundBook exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
}
