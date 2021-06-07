package com.br.capelli.Exerc3;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private LocalDate dataAdmissao;
    private String matricula;
    private double valorHora;
    private int horasTrabalhadas;
    private double salario;

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario(String nome, String sexo, LocalDate dataDeNascimento, LocalDate dataAdmissao, String matricula, double valorHora, int horasTrabalhadas, double salario) {
        super(nome, sexo, dataDeNascimento);
        this.dataAdmissao = dataAdmissao;
        this.matricula = matricula;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salario = salario;
    }

    public void receberAumento(double aumento) {
        this.salario += aumento;

    }

    public double calculaSalario() {
        return this.salario * 12;
    }

}
