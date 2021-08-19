package com.capelli.aula11.repository;

import com.capelli.aula11.domain.Pessoa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository {
    Pessoa salvar(Pessoa pessoa);

    Pessoa findById(Long id);

    List<Pessoa> findAll();
}
