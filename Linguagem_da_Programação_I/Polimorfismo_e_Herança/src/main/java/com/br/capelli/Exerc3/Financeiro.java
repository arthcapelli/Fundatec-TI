package com.br.capelli.Exerc3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Financeiro {
    private List<Funcionario> funcionarios;


    public Financeiro(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Map<Funcionario, Double> pagarFuncionarios() {
        List<Funcionario> funcionariosParaPagar = this.funcionarios;
        Map<Funcionario, Double> pagamentoRealizado = new HashMap<>();

        for (Funcionario funcionario : funcionariosParaPagar
        ) {
            double salario = funcionario.calculaSalario();
            if (funcionario instanceof Medico && ((Medico) funcionario).getCRM().equals("boss")) {
                salario = salario + 1000;
            } else if (funcionario instanceof Gerente && ((Gerente) funcionario).getCRA().equals("boss")) {
                salario = salario + 2000;
            }
            pagamentoRealizado.put(funcionario, salario);
        }
        return pagamentoRealizado;
    }


}
