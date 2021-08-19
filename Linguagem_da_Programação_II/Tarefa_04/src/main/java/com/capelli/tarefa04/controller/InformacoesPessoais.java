package com.capelli.tarefa04.controller;

public class InformacoesPessoais {
    private String primeiro_nome;
    private String sobrenome;
    private String data_nascimento;

    public InformacoesPessoais(String primeiro_nome, String sobrenome, String data_nascimento) {
        this.primeiro_nome = primeiro_nome;
        this.sobrenome = sobrenome;
        this.data_nascimento = data_nascimento;
    }

    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
