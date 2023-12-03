package com.example.tde_aula_18.services;

import com.example.tde_aula_18.dtos.BookDto;
import com.example.tde_aula_18.entities.Book;
import com.example.tde_aula_18.exceptions.NotFoundBook;
import com.example.tde_aula_18.repositories.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public String store(Book bookData){
        this.bookRepository.save(bookData);
        return "Livro adicionado com sucesso!";
    }
    public Optional<Book> getById(int bookId){
        Optional<Book> bookResult = this.bookRepository.findById(bookId);
        if(bookResult.isEmpty()) throw new NotFoundBook();
        return bookResult;
    }
    public List<BookDto> getAll(){
        List<Book> booksResult = this.bookRepository.findAll();
        if(booksResult.isEmpty()) throw new NotFoundBook();
        List<BookDto> listBookDto = new ArrayList();
        for(int i = 0; i < booksResult.size();i++){
            BookDto bookDto = new BookDto(booksResult.get(i).getTitle(),booksResult.get(i).getAuthor());
            listBookDto.add(bookDto);
        }
        return listBookDto;
    }
    @Transactional
    public String update(Book bookData, int bookId){
        Optional<Book> bookResult = this.bookRepository.findById(bookId);
        if(bookResult.isEmpty()) throw new NotFoundBook();
        this.bookRepository.update(bookData.getTitle(),bookId);
        return "Livro atualizado com sucesso!";
    }
    public String delete(int bookId){
        Optional<Book> bookResult = this.bookRepository.findById(bookId);
        if(bookResult.isEmpty()) throw new NotFoundBook();
        this.bookRepository.deleteById(bookId);
        return "Livro removido com sucesso!";
    }
}
