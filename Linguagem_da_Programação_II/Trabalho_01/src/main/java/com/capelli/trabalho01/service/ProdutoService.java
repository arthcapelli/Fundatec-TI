package com.capelli.trabalho01.service;

import com.capelli.trabalho01.controller.*;
import com.capelli.trabalho01.dominio.Fornecedor;
import com.capelli.trabalho01.dominio.Produto;
import com.capelli.trabalho01.dominio.repository.FornecedorRepository;
import com.capelli.trabalho01.dominio.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private FornecedorRepository fornecedorRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoService() {
    }

    public ProdutoResponseId salvarProduto(ProdutoRequest request) {
        Produto produtoParaSalvar = new Produto(request.getNome_produto(),
                request.getPreco_custo(),
                request.getValor_venda(),
                request.getEstoque());

        produtoRepository.salvar(produtoParaSalvar);

        return new ProdutoResponseId(produtoParaSalvar.getId());
    }


    public List<ProdutoResponseSemFornecedor> findByNome(String nome) {
        List<ProdutoResponseSemFornecedor> produtosList = new ArrayList<>();
        ProdutoResponseSemFornecedor resultado = null;

        for (Produto produtoLoop : produtoRepository.getProdutos()
        ) {
            if (produtoLoop.getNome_produto().contains(nome)) {
                resultado = new ProdutoResponseSemFornecedor(produtoLoop.getId().toString(), produtoLoop.getNome_produto(), produtoLoop.getPreco_custo(), produtoLoop.getValor_venda(), produtoLoop.getEstoque());
                produtosList.add(resultado);
            }
        }
        return produtosList;
    }

    public ProdutoResponseEstoque findEstoque(String id) {
        ProdutoResponseEstoque resultado = null;

        for (Produto produtoLoop : produtoRepository.getProdutos()
        ) {
            if (id.equals(produtoLoop.getId().toString())) {
                resultado = new ProdutoResponseEstoque(produtoLoop.getEstoque());
            }
        }

        return resultado;
    }

    public ProdutoResponse findById(String id) {
        ProdutoResponse resultado = null;

        for (Produto produtoLoop : produtoRepository.getProdutos()
        ) {
            if (id.equals(produtoLoop.getId().toString())) {
                resultado = new ProdutoResponse(produtoLoop.getId().toString(),
                        produtoLoop.getNome_produto(),
                        produtoLoop.getPreco_custo(),
                        produtoLoop.getValor_venda(),
                        produtoLoop.getEstoque());
            }
        }

        return resultado;
    }

    public void addFornecedor(String id, AdicionarFornecedorAoProdutoRequest request) {
        Fornecedor fornecedorParaAdicionar = null;

        for (Fornecedor fornecedorLoop : fornecedorRepository.getFornecedores()
        ) {
            if (fornecedorLoop.getId().toString().equals(request.getFornecedorIDRequest().getId())) {
                fornecedorParaAdicionar = fornecedorLoop;
            }
            for (Produto produtoLoop : produtoRepository.getProdutos()) {
                if (produtoLoop.getId().toString().equals(id)) {
                    produtoLoop.setFornecedor(fornecedorParaAdicionar);
                }
            }
        }
    }

    public FornecedorResponse findFornecedor(String id) {
        FornecedorResponse fornecedor = null;

        for (Produto produtoLoop : produtoRepository.getProdutos()
        ) {
            if (produtoLoop.getId().toString().equals(id)) {
                fornecedor = new FornecedorResponse(produtoLoop.getFornecedor().getCnpj(),
                        produtoLoop.getFornecedor().getRazao_social(),
                        produtoLoop.getFornecedor().getEmail(),
                        produtoLoop.getFornecedor().getTelefone());
            }
        }

        return fornecedor;
    }


}
