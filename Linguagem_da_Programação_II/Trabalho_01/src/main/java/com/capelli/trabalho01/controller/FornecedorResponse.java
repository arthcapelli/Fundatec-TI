package com.capelli.trabalho01.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class FornecedorResponse {
    @JsonProperty("cnpj")
    private String cnpj;
    @JsonProperty("razao_social")
    private String razao_social;
    @JsonProperty("email")
    private String email;
    @JsonProperty("telefone")
    private String telefone;


    public FornecedorResponse(String cnpj, String razao_social, String email, String telefone) {
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.email = email;
        this.telefone = telefone;
    }

    public FornecedorResponse() {
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
