package com.example.tde_aula_18.controllers;

import com.example.tde_aula_18.dtos.BookDto;
import com.example.tde_aula_18.entities.Book;
import com.example.tde_aula_18.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @PostMapping
    public String store(@RequestBody Book bookData){
        return this.bookService.store(bookData);
    }
    @GetMapping()
    public List<BookDto> getAll(){
        return this.bookService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Book> getById(@PathVariable int id){
        return this.bookService.getById(id);
    }
    @PutMapping("/{id}")
    public String update(@RequestBody Book bookData, @PathVariable int id){
        return this.bookService.update(bookData,id);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int bookId){
        return this.bookService.delete(bookId);
    }
}
