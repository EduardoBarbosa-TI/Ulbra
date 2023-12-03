package com.example.tde_aula_18.exceptions;
public class NotFoundAuthor extends RuntimeException {
    public NotFoundAuthor(){
        super("Autor não encontrado!");
    }
}
