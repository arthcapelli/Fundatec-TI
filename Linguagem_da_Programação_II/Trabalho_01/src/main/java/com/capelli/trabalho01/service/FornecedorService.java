package com.capelli.trabalho01.service;

import com.capelli.trabalho01.controller.FornecedorRequest;
import com.capelli.trabalho01.controller.FornecedorResponse;
import com.capelli.trabalho01.controller.FornecedorResponseId;
import com.capelli.trabalho01.dominio.Fornecedor;
import com.capelli.trabalho01.dominio.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public FornecedorService() {
    }

    public FornecedorResponseId salvarFornecedor(FornecedorRequest request) {
        Fornecedor fornecedorParaSalvar = new Fornecedor(request.getCnpj(),
                request.getRazao_social(),
                request.getEmail(),
                request.getTelefone());
        fornecedorRepository.salvar(fornecedorParaSalvar);

        return new FornecedorResponseId(fornecedorParaSalvar.getId());
    }
}
