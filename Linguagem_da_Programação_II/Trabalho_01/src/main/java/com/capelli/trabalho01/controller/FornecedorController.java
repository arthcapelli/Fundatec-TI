package com.capelli.trabalho01.controller;

import com.capelli.trabalho01.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fornecedor")
public class FornecedorController {
    @Autowired
    private FornecedorService service;

    @PostMapping()
    public ResponseEntity<FornecedorResponseId> salvar(@RequestBody FornecedorRequest request) {
        FornecedorResponseId response = service.salvarFornecedor(request);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
