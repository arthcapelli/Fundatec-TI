package com.br.capelli.Exerc3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void deveImprimirONomeESexo_test() {
        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        Pessoa pessoa = new Pessoa("Arthur", "Masculino", nascimento);
        String impressaoEsperada = "O nome é: Arthur, o sexo é Masculino";
        String impressaoAtual = "O nome é: " + pessoa.getNome() + ", o sexo é " + pessoa.getSexo();

        Assertions.assertEquals(impressaoEsperada, impressaoAtual);
    }

    @Test
    void deveCalcularIdade_test() {
        LocalDate nascimento = LocalDate.of(1994, 11, 12);
        Pessoa pessoa = new Pessoa("Arthur", "Masculino", nascimento);
        int idade = pessoa.calculaIdade();
        int idadeEsperada = 26;

        Assertions.assertEquals(idadeEsperada, idade);
    }
}
