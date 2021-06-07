package com.br.capelli.Exerc3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MedicoTest {
    @Test
    void deveCalcularOSalarioDoMedicoCom10CirurgiasOuMenos_test(){
        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        LocalDate admissao = LocalDate.of(2000, 11, 12);
        Medico medico = new Medico("Arthur", "Masculino", nascimento, admissao, "123456", 10, 40, 1000, "654321", false, 10);

        double salarioCalculado = medico.calculaSalario();
        double salarioEsperado = 120000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    void deveCalcularOSalarioDoMedicoComMaisDe10Cirurgias_test(){
        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        LocalDate admissao = LocalDate.of(2000, 11, 12);
        Medico medico = new Medico("Arthur", "Masculino", nascimento, admissao, "123456", 10, 40, 1000, "654321", false, 12);

        double salarioCalculado = medico.calculaSalario();
        double salarioEsperado = 180000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    void deveCalcularOSalarioDoMedicoCom10CirurgiasOuMenosComAumento_test(){
        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        LocalDate admissao = LocalDate.of(2000, 11, 12);
        Medico medico = new Medico("Arthur", "Masculino", nascimento, admissao, "123456", 10, 40, 1000, "654321", false, 10);
        medico.receberAumento(1000);
        double salarioCalculado = medico.calculaSalario();
        double salarioEsperado = 240000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    void deveCalcularOSalarioDoMedicoComMaisDe10CirurgiasComAumento_test(){
        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        LocalDate admissao = LocalDate.of(2000, 11, 12);
        Medico medico = new Medico("Arthur", "Masculino", nascimento, admissao, "123456", 10, 40, 1000, "654321", false, 12);
        medico.receberAumento(1000);
        double salarioCalculado = medico.calculaSalario();
        double salarioEsperado = 360000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }
}
