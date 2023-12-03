package com.example.tde_aula_18.exceptions;

public class NotFoundBook extends RuntimeException{
    public NotFoundBook(){
        super("Livro não encontrado!");
    }
}
