package com.capelli.trabalho01.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdicionarFornecedorAoProdutoRequest {
    @JsonProperty("fornecedor")
    private FornecedorIDRequest fornecedorIDRequest;

    public AdicionarFornecedorAoProdutoRequest(FornecedorIDRequest fornecedorIDRequest) {
        this.fornecedorIDRequest = fornecedorIDRequest;
    }

    public AdicionarFornecedorAoProdutoRequest() {
    }

    public FornecedorIDRequest getFornecedorIDRequest() {
        return fornecedorIDRequest;
    }

    public void setFornecedorIDRequest(FornecedorIDRequest fornecedorIDRequest) {
        this.fornecedorIDRequest = fornecedorIDRequest;
    }
}
