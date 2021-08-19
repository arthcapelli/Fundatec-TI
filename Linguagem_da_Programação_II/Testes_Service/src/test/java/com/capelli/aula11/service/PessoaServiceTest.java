package com.capelli.aula11.service;

import com.capelli.aula11.domain.Pessoa;
import com.capelli.aula11.repository.PessoaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PessoaServiceTest {

    @Mock
    private PessoaRepository pessoaRepository;

    @InjectMocks
    private PessoaService pessoaService;

    @Test
    void salvar() {
        //Arrange
        Pessoa pessoa = new Pessoa(null, "Arthur");
        Pessoa pessoaRetorno = new Pessoa(1L, "Arthur");
        Mockito.when(pessoaRepository.salvar(pessoa))
                .thenReturn(pessoaRetorno);

        //Act
        Pessoa resultado = pessoaService.salvar(pessoa);

        //Assert
        Assertions.assertEquals(pessoaRetorno, resultado);
    }

    @Test
    void salvarValidationErrorTest() {
        Pessoa pessoa = new Pessoa();

        Assertions.assertThrows(RuntimeException.class, () -> pessoaService.salvar(pessoa), "Pessoa deve conter nome");
    }

    @Test
    void findByIdSuccessTest() {
        Pessoa minhaPessoa = new Pessoa(1L, "Arthur");
        Mockito.when(pessoaRepository.findById(1L))
                .thenReturn(minhaPessoa);

        Pessoa resultado = pessoaService.findById(1L);

        Assertions.assertEquals(minhaPessoa, resultado);
    }

    @Test
    void findAllTest() {
        List<Pessoa> pessoaList = new ArrayList<>();
        Pessoa pessoa = new Pessoa(1L, "Arthur");
        pessoaList.add(pessoa);

        Mockito.when(pessoaRepository.findAll())
                .thenReturn(pessoaList);

        List<Pessoa> resultado = pessoaService.findAll();

        Assertions.assertEquals(pessoaList, resultado);
    }
}