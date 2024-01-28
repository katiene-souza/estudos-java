package com.soulcode.soullib.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soulcode.soullib.models.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {
    
}
