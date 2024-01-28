package com.soulcode.soullib.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soulcode.soullib.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{
    
}
