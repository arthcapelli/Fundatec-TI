package com.capelli.tarefa04.controller;

public class PessoaRequest {
    private String primeiro_nome;
    private String sobrenome;
    private String data_nascimento;
    private String email;
    private String email_alternativo;
    private String telefone;
    private String posicao;
    private String area_funcional;
    private String nome_empresa;
    private boolean emprego_atual;

    public PessoaRequest(String primeiro_nome, String sobrenome, String data_nascimento, String email, String email_alternativo, String telefone, String posicao, String area_funcional, String nome_empresa, boolean emprego_atual) {
        this.primeiro_nome = primeiro_nome;
        this.sobrenome = sobrenome;
        this.data_nascimento = data_nascimento;
        this.email = email;
        this.email_alternativo = email_alternativo;
        this.telefone = telefone;
        this.posicao = posicao;
        this.area_funcional = area_funcional;
        this.nome_empresa = nome_empresa;
        this.emprego_atual = emprego_atual;
    }

    public PessoaRequest() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail_alternativo() {
        return email_alternativo;
    }

    public void setEmail_alternativo(String email_alternativo) {
        this.email_alternativo = email_alternativo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getArea_funcional() {
        return area_funcional;
    }

    public void setArea_funcional(String area_funcional) {
        this.area_funcional = area_funcional;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public boolean isEmprego_atual() {
        return emprego_atual;
    }

    public void setEmprego_atual(boolean emprego_atual) {
        this.emprego_atual = emprego_atual;
    }
}
