package com.capelli.trabalho01.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class FornecedorResponseId {
    @JsonProperty("id")
    private String id;

    public FornecedorResponseId(UUID id) {
        this.id = id.toString();
    }

    public FornecedorResponseId() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
