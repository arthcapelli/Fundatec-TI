package com.br.capelli.Exerc3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class FinanceiroTest {
    @Test
    void deveCalcularPagamentoMedico() {

        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        LocalDate admissao = LocalDate.of(2000, 11, 12);
        Medico medico = new Medico("Arthur", "Masculino", nascimento, admissao, "123456", 12, 40, 1000, "654321", false, 10);
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(medico);
        Financeiro financeiro = new Financeiro(funcionarios);
        Map<Funcionario, Double> pagamentoRealizado = financeiro.pagarFuncionarios();

        Map<Funcionario, Double> pagamentoEsperado = new HashMap<>();
        pagamentoEsperado.put(medico, 120000.0);


        Assertions.assertEquals(pagamentoEsperado, pagamentoRealizado);
    }

    @Test
    void deveCalcularBoss() {

        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        LocalDate admissao = LocalDate.of(2000, 11, 12);
        Medico medico = new Medico("Arthur", "Masculino", nascimento, admissao, "123456", 12, 40, 1000, "boss", false, 10);
        Gerente gerente = new Gerente("Arthur", "Masculino", nascimento, admissao, "123456", 12, 40, 1000, "boss");
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(medico);
        funcionarios.add(gerente);
        Financeiro financeiro = new Financeiro(funcionarios);
        Map<Funcionario, Double> pagamentoRealizado = financeiro.pagarFuncionarios();

        Map<Funcionario, Double> pagamentoEsperado = new HashMap<>();
        pagamentoEsperado.put(medico, 121000.0);
        pagamentoEsperado.put(gerente, 14000.0);


        Assertions.assertEquals(pagamentoEsperado, pagamentoRealizado);
    }

}
