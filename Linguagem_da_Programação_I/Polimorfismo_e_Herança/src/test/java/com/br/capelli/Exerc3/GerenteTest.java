package com.br.capelli.Exerc3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GerenteTest {
    @Test
    void deveCalcularOSalarioDoGerente_test(){
        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        LocalDate admissao = LocalDate.of(2000, 11, 12);
        Gerente gerente = new Gerente("Arthur", "Masculino", nascimento, admissao, "123456", 10, 40, 1000, "654321");

        double salarioCalculado = gerente.calculaSalario();
        double salarioEsperado = 12000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    void deveCalcularOSalarioDoGerenteComAumento_test(){
        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        LocalDate admissao = LocalDate.of(2000, 11, 12);
        Gerente gerente = new Gerente("Arthur", "Masculino", nascimento, admissao, "123456", 10, 40, 500, "654321");
        gerente.receberAumento(500);

        double salarioCalculado = gerente.calculaSalario();
        double salarioEsperado = 12000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }
}
