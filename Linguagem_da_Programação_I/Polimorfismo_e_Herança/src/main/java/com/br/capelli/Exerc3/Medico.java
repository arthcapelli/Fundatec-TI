package com.br.capelli.Exerc3;

import java.time.LocalDate;

public class Medico extends Funcionario {
    private String CRM;
    private boolean operando;
    private int nroCirurgias;

    public String getCRM() {
        return CRM;
    }

    public boolean isOperando() {
        return operando;
    }

    public int getNroCirurgias() {
        return nroCirurgias;
    }

    public Medico(String nome, String sexo, LocalDate dataDeNascimento, LocalDate dataAdmissao, String matricula, double valorHora, int horasTrabalhadas, double salario, String CRM, boolean operando, int nroCirurgias) {
        super(nome, sexo, dataDeNascimento, dataAdmissao, matricula, valorHora, horasTrabalhadas, salario);
        this.CRM = CRM;
        this.operando = operando;
        this.nroCirurgias = nroCirurgias;
    }

    public void operar() {
        this.operando = true;
    }

    @Override
    public double calculaSalario() {
        int cirurgias = this.nroCirurgias;
        double salario = this.getSalario();
        double calculoSalario;

        if (cirurgias > 10) {
            calculoSalario = salario * cirurgias;
            return (calculoSalario + (calculoSalario * 0.25)) * 12;
        } else {
            return (salario * cirurgias) * 12;
        }
    }
}
