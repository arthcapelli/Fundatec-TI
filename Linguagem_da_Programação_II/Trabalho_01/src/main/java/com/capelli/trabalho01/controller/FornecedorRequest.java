package com.capelli.trabalho01.controller;

import com.capelli.trabalho01.dominio.Fornecedor;

public class FornecedorRequest {
    private String id;
    private String cnpj;
    private String razao_social;
    private String email;
    private String telefone;


    public FornecedorRequest(String cnpj, String razao_social, String email, String telefone) {
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.email = email;
        this.telefone = telefone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FornecedorRequest() {
    }

    public FornecedorRequest(String id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
