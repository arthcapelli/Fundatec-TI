package com.br.capelli.Exerc3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PacienteTest {
    @Test
    void deveCalcularOTempoDeInternacao_test() {
        LocalDate dataInternacao = LocalDate.of(2011, 5, 10);
        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        Paciente paciente = new Paciente("Arthur", "Masculino", nascimento, dataInternacao);

        int tempoDeInternacaoEsperado = 10;
        int tempoDeInternacaoAtual = paciente.calcularTempoDeInternacao();

        Assertions.assertEquals(tempoDeInternacaoEsperado, tempoDeInternacaoAtual);
    }
}
