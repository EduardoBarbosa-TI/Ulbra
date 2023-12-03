package com.example.tde_aula_18.repositories;

import com.example.tde_aula_18.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    @Modifying
    @Query("update Author u set u.name = ?1, u.age = ?2 where u.id = ?3")
    void update(String name, int age, Integer userId);
}
