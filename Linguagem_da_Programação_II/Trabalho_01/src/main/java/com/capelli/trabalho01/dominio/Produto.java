package com.capelli.trabalho01.dominio;

import java.util.UUID;

public class Produto {
    private UUID id = UUID.randomUUID();
    private String nome_produto;
    private double preco_custo;
    private double valor_venda;
    private int estoque;
    private Fornecedor fornecedor;

    public Produto(String nome_produto, double preco_custo, double valor_venda, int estoque, Fornecedor fornecedor) {
        this.nome_produto = nome_produto;
        this.preco_custo = preco_custo;
        this.valor_venda = valor_venda;
        this.estoque = estoque;
        this.fornecedor = fornecedor;
    }

    public Produto(String nome_produto, double preco_custo, double valor_venda, int estoque) {
        this.nome_produto = nome_produto;
        this.preco_custo = preco_custo;
        this.valor_venda = valor_venda;
        this.estoque = estoque;
    }

    public UUID getId() {
        return id;
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
