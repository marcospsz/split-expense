package com.split.expense.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nm_pessoa;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nm_pessoa;
    }

    public void setNome(String nome) {
        this.nm_pessoa = nome;
    }
}
