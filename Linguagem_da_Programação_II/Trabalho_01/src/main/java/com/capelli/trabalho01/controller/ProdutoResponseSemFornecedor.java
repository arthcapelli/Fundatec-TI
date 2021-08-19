package com.capelli.trabalho01.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class ProdutoResponseSemFornecedor {
    @JsonProperty("id")
    private String id;
    @JsonProperty("nome_produto")
    private String nome_produto;
    @JsonProperty("preco_custo")
    private double preco_custo;
    @JsonProperty("valor_venda")
    private double valor_venda;
    @JsonProperty("estoque")
    private int estoque;

    public ProdutoResponseSemFornecedor(String id, String nome_produto, double preco_custo, double valor_venda, int estoque) {
        this.id = id;
        this.nome_produto = nome_produto;
        this.preco_custo = preco_custo;
        this.valor_venda = valor_venda;
        this.estoque = estoque;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
