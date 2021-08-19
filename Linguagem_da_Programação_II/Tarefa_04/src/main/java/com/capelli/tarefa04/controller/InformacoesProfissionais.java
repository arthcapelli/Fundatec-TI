package com.capelli.tarefa04.controller;

public class InformacoesProfissionais {
    private String posicao;
    private String area_funcional;
    private String nome_empresa;
    private boolean emprego_atual;

    public InformacoesProfissionais(String posicao, String area_funcional, String nome_empresa, boolean emprego_atual) {
        this.posicao = posicao;
        this.area_funcional = area_funcional;
        this.nome_empresa = nome_empresa;
        this.emprego_atual = emprego_atual;
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
