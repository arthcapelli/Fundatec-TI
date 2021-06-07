package com.br.capelli.Exerc3;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    protected String nome;
    protected String sexo;
    protected LocalDate dataDeNascimento;

    public Pessoa(String nome, String sexo, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getIdade() {
        return dataDeNascimento;
    }

    public int calculaIdade() {
        LocalDate atualidade = LocalDate.now();
        return Period.between(dataDeNascimento, atualidade).getYears();
    }
}
