package com.br.capelli.Exerc3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class FuncionarioTest {
    @Test
    void deveRealizarAumento_test() {
        LocalDate dataAdmissao = LocalDate.of(2010, 11, 12);
        LocalDate nascimento = LocalDate.of(1994, 11, 12);

        Funcionario funcionario = new Funcionario("Arthur", "Masculino", nascimento, dataAdmissao, "6543123", 10, 40, 1000);
        funcionario.receberAumento(500);
        double salarioEsperado = 1500;
        double salarioAtual = funcionario.getSalario();

        Assertions.assertEquals(salarioEsperado, salarioAtual);
    }

    @Test
    void deveCalcularTotalBrutoAnual_test() {
        LocalDate dataAdmissao = LocalDate.of(2010, 11, 12);
        LocalDate nascimento = LocalDate.of(1994, 11, 12);

        Funcionario funcionario = new Funcionario("Arthur", "Masculino", nascimento, dataAdmissao, "6543123", 10, 40, 1000);
        double ganhoAnualEsperado = 12000;
        double ganhoAnual = funcionario.calculaSalario();

        Assertions.assertEquals(ganhoAnualEsperado, ganhoAnual);
    }
}
