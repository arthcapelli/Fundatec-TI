package com.capelli.tarefa04.controller;

import com.capelli.tarefa04.dominio.Pessoa;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class PessoaResponse {
    @JsonProperty("id")
    private String id;
    @JsonProperty("informacoes_pessoais")
    private InformacoesPessoais informacoes_pessoais;
    @JsonProperty("informacoes_contato")
    private List<InformacoesContato> informacoes_contato;
    @JsonProperty("informacoes_profissionais")
    private InformacoesProfissionais informacoes_profissionais;

    public PessoaResponse(String id, InformacoesPessoais informacoes_pessoais, List<InformacoesContato> informacoes_contato, InformacoesProfissionais informacoes_profissionais) {
        this.id = id;
        this.informacoes_pessoais = informacoes_pessoais;
        this.informacoes_contato = informacoes_contato;
        this.informacoes_profissionais = informacoes_profissionais;
    }

    public PessoaResponse(UUID id) {
        this.id = id.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InformacoesPessoais getInformacoes_pessoais() {
        return informacoes_pessoais;
    }

    public void setInformacoes_pessoais(InformacoesPessoais informacoes_pessoais) {
        this.informacoes_pessoais = informacoes_pessoais;
    }

    public List<InformacoesContato> getInformacoes_contato() {
        return informacoes_contato;
    }

    public void setInformacoes_contato(List<InformacoesContato> informacoes_contato) {
        this.informacoes_contato = informacoes_contato;
    }

    public InformacoesProfissionais getInformacoes_profissionais() {
        return informacoes_profissionais;
    }

    public void setInformacoes_profissionais(InformacoesProfissionais informacoes_profissionais) {
        this.informacoes_profissionais = informacoes_profissionais;
    }
}
