package com.example.tde_aula_18.controllers;

import com.example.tde_aula_18.dtos.AuthorDto;
import com.example.tde_aula_18.entities.Author;
import com.example.tde_aula_18.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private AuthorService authorService;
    @Autowired
    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }
   @PostMapping
    public String store(@RequestBody Author authorData){
        return this.authorService.store(authorData);
    }
    @GetMapping()
    public List<AuthorDto> getAll(){
        return this.authorService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Author> getById(@PathVariable int id){
        return this.authorService.getById(id);
    }
    @PutMapping("/{id}")
    public String update(@RequestBody Author authorData,@PathVariable int id){
        return this.authorService.update(authorData,id);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return this.authorService.delete(id);
    }
}
