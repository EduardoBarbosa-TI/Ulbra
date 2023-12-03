package com.example.tde_aula_18.services;

import com.example.tde_aula_18.dtos.AuthorDto;
import com.example.tde_aula_18.dtos.BookDto;
import com.example.tde_aula_18.entities.Author;
import com.example.tde_aula_18.exceptions.NotFoundAuthor;
import com.example.tde_aula_18.repositories.AuthorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;
    @Autowired
    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
    public String store(Author authorData){
        this.authorRepository.save(authorData);
        return "Autor adicionado com sucesso!";
    }
    public Optional<Author> getById(int authorId){
        Optional<Author> authorResult = this.authorRepository.findById(authorId);
        if(authorResult.isEmpty()) throw new NotFoundAuthor();
        return authorResult;
    }
    public List<AuthorDto> getAll(){
        List<Author> authorsResult = this.authorRepository.findAll();
        if(authorsResult.isEmpty()) throw new NotFoundAuthor();
        List<AuthorDto> listAuthorDto = new ArrayList();
        for(int i = 0; i < authorsResult.size();i++){
            AuthorDto authorDto = new AuthorDto(authorsResult.get(i).getName(),authorsResult.get(i).getAge());
            listAuthorDto.add(authorDto);
        }
        return listAuthorDto;
    }
    @Transactional
    public String update(Author authorData, int authorId){
        Optional<Author> author = this.authorRepository.findById(authorId);
        if(author.isEmpty()) throw new NotFoundAuthor();
        this.authorRepository.update(authorData.getName(),authorData.getAge(), authorId);
        return "Autor atualizado com sucesso!";
    }
    public String delete(int authorId){
        Optional<Author> author = this.authorRepository.findById(authorId);
        if(author.isEmpty()) throw new NotFoundAuthor();
        this.authorRepository.deleteById(authorId);
        return "Autor removido com sucesso";
    }
}
