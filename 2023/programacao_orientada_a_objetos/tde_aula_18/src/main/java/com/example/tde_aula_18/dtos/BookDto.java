package com.example.tde_aula_18.dtos;

import com.example.tde_aula_18.entities.Author;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDto {
    private String title;
    private Author author;
}
