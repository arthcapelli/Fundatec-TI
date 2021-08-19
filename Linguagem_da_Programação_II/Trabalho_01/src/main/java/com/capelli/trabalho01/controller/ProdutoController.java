package com.capelli.trabalho01.controller;

import com.capelli.trabalho01.dominio.ProdutoNotFoundException;
import com.capelli.trabalho01.dominio.repository.ProdutoRepository;
import com.capelli.trabalho01.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;


    @PostMapping()
    public ResponseEntity<ProdutoResponseId> salvar(@RequestBody ProdutoRequest request) {
        ProdutoResponseId response = service.salvarProduto(request);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<ProdutoResponseSemFornecedor>> produto(@RequestParam(value = "nome", required = false) String nome) {
        List<ProdutoResponseSemFornecedor> resultado = service.findByNome(nome);

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @GetMapping("{id}/estoque")
    public ResponseEntity<ProdutoResponseEstoque> produtoEstoque(@PathVariable String id) {
        ProdutoResponseEstoque response = null;

        try {
            response = service.findEstoque(id);
        } catch (ProdutoNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProdutoResponse> findId(@PathVariable String id) {
        ProdutoResponse response = null;

        try {
            response = service.findById(id);
        } catch (ProdutoNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("{id}/fornecedor")
    public ResponseEntity<FornecedorResponse> fornecedorNoProduto(@PathVariable String id,
                                                                  @RequestBody AdicionarFornecedorAoProdutoRequest request) {
        try {
            service.addFornecedor(id, request);
        } catch (ProdutoNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("{id}/fornecedor")
    public ResponseEntity<FornecedorResponse> fornecedorDoProduto(@PathVariable String id) {
        FornecedorResponse response = null;

        try {
            response = service.findFornecedor(id);
        } catch (ProdutoNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
