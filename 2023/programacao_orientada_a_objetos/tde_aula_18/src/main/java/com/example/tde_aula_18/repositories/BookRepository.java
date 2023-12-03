package com.example.tde_aula_18.repositories;

import com.example.tde_aula_18.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Modifying
    @Query("update Book u set u.title = ?1 where u.id = ?2")
    void update(String title, Integer userId);
}
