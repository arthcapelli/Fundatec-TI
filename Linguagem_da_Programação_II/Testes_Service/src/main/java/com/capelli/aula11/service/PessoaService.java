package com.capelli.aula11.service;

import com.capelli.aula11.domain.Pessoa;
import com.capelli.aula11.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa findById(Long id) {
        Pessoa resultado = pessoaRepository.findById(id);

        if (resultado == null) {
            throw new RuntimeException("Pessoa não encontrada");
        }

        return resultado;
    }

    public Pessoa salvar(Pessoa pessoaParaSalvar) {
        if (pessoaParaSalvar.getNome() == null) {
            throw new RuntimeException("Pessoa deve conter nome");
        }
        Pessoa pessoaSalva = pessoaRepository.salvar(pessoaParaSalvar);
        return pessoaSalva;
    }

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }


}
