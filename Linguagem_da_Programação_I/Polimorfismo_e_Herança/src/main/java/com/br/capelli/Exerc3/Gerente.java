package com.br.capelli.Exerc3;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    private String CRA;

    public String getCRA() {
        return CRA;
    }

    public Gerente(String nome, String sexo, LocalDate dataDeNascimento, LocalDate dataAdmissao, String matricula, double valorHora, int horasTrabalhadas, double salario, String CRA) {
        super(nome, sexo, dataDeNascimento, dataAdmissao, matricula, valorHora, horasTrabalhadas, salario);
        this.CRA = CRA;
    }

    public double calculaSalario() {
        return super.calculaSalario();
    }

}
