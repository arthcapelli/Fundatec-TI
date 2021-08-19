package com.capelli.trabalho01.controller;

public class FornecedorIDRequest {
    private String id;

    public FornecedorIDRequest(String id) {
        this.id = id;
    }

    public FornecedorIDRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
