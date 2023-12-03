package com.example.tde_aula_18.dtos;

import com.example.tde_aula_18.entities.Author;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthorDto {
    private String name;
    private int age;

    public Author transformAuthorDto(){
        return new Author(name,age);
    }
}
