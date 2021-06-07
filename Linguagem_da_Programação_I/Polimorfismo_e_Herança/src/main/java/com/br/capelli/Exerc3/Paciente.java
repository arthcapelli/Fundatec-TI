package com.br.capelli.Exerc3;

import java.time.LocalDate;
import java.time.Period;

public class Paciente extends Pessoa {
    private LocalDate dataInternacao;

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public Paciente(String nome, String sexo, LocalDate dataDeNascimento, LocalDate dataInternacao) {
        super(nome, sexo, dataDeNascimento);
        this.dataInternacao = dataInternacao;
    }

    public int calcularTempoDeInternacao() {
        return Period.between(dataInternacao, LocalDate.now()).getYears();
    }
}
