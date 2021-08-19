package com.capelli.trabalho01.dominio.repository;

import com.capelli.trabalho01.dominio.Fornecedor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FornecedorRepository {
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void salvar(Fornecedor fornecedor) {
        this.fornecedores.add(fornecedor);
    }
}
