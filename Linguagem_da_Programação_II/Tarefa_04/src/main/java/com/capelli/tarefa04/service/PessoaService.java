package com.capelli.tarefa04.service;

import com.capelli.tarefa04.controller.*;
import com.capelli.tarefa04.dominio.Pessoa;
import com.capelli.tarefa04.dominio.PessoaNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PessoaService {
    private List<Pessoa> pessoas = new ArrayList<>();

    public PessoaService() {
    }

    public PessoaResponse salvarPessoa(PessoaRequest request) {
        Pessoa pessoaParaSalvar = new Pessoa(request.getPrimeiro_nome(), request.getSobrenome(), request.getData_nascimento(), request.getEmail(), request.getEmail_alternativo(), request.getTelefone(), request.getPosicao(), request.getArea_funcional(), request.getNome_empresa());
        pessoas.add(pessoaParaSalvar);

        return new PessoaResponse(pessoaParaSalvar.getId());
    }

    public PessoaResponse findById(String id) {
        UUID uuidFromUser = UUID.fromString(id);
        PessoaResponse resultado = null;

        for (Pessoa pessoaLoop : pessoas
        ) {
            if (pessoaLoop.getId().equals(uuidFromUser)) {
                InformacoesPessoais informacoesPessoais = new InformacoesPessoais(pessoaLoop.getPrimeiro_nome(), pessoaLoop.getSobrenome(), pessoaLoop.getData_nascimento());

                InformacoesContato email = new InformacoesContato(Tipo.EMAIL, pessoaLoop.getEmail());
                InformacoesContato emailAlternativo = new InformacoesContato(Tipo.EMAIL_ALTERNATIVO, pessoaLoop.getEmail_alternativo());
                InformacoesContato telefone = new InformacoesContato(Tipo.TELEFONE, pessoaLoop.getTelefone());
                List<InformacoesContato> contato = new ArrayList<>();
                contato.add(email);
                contato.add(emailAlternativo);
                contato.add(telefone);

                InformacoesProfissionais informacoesProfissionais = new InformacoesProfissionais(pessoaLoop.getPosicao(), pessoaLoop.getArea_funcional(), pessoaLoop.getNome_empresa(), pessoaLoop.isEmprego_atual());

                resultado = new PessoaResponse(pessoaLoop.getId().toString(), informacoesPessoais, contato, informacoesProfissionais);
            }
        }
        if (resultado == null) {
            throw new PessoaNotFoundException("A pessoa não foi encontrada");
        }
        return resultado;
    }

    public List<PessoaResponse> findByNomeSobrenomeEmailTelefone(String nome, String sobrenome, String email, String telefone) {
        List<PessoaResponse> pessoasList = new ArrayList<>();
        PessoaResponse resultado = null;

        for (Pessoa pessoaLoop : this.pessoas
        ) {
            if (pessoaLoop.getPrimeiro_nome().equals(nome) && pessoaLoop.getSobrenome().equals(sobrenome) && pessoaLoop.getEmail().equals(email) && pessoaLoop.getTelefone().equals(telefone)) {
                InformacoesPessoais informacoesPessoais = new InformacoesPessoais(pessoaLoop.getPrimeiro_nome(), pessoaLoop.getSobrenome(), pessoaLoop.getData_nascimento());

                InformacoesContato emailPessoa = new InformacoesContato(Tipo.EMAIL, pessoaLoop.getEmail());
                InformacoesContato emailAlternativo = new InformacoesContato(Tipo.EMAIL_ALTERNATIVO, pessoaLoop.getEmail_alternativo());
                InformacoesContato telefonePessoa = new InformacoesContato(Tipo.TELEFONE, pessoaLoop.getTelefone());
                List<InformacoesContato> contato = new ArrayList<>();
                contato.add(emailPessoa);
                contato.add(emailAlternativo);
                contato.add(telefonePessoa);

                InformacoesProfissionais informacoesProfissionais = new InformacoesProfissionais(pessoaLoop.getPosicao(), pessoaLoop.getArea_funcional(), pessoaLoop.getNome_empresa(), pessoaLoop.isEmprego_atual());

                resultado = new PessoaResponse(pessoaLoop.getId().toString(), informacoesPessoais, contato, informacoesProfissionais);
                pessoasList.add(resultado);
            }
        }
        return pessoasList;
    }

    public void modifyJob(String id, PessoaRequest request) {
        UUID uuidFromUser = UUID.fromString(id);
        boolean alterado = false;

        for (Pessoa pessoaLoop : pessoas
        ) {
            if (pessoaLoop.getId().equals(uuidFromUser)) {
                pessoaLoop.setPosicao(request.getPosicao());
                pessoaLoop.setArea_funcional(request.getArea_funcional());
                pessoaLoop.setNome_empresa(request.getNome_empresa());
                pessoaLoop.setEmprego_atual(request.isEmprego_atual());
                alterado = true;
            }
        }

        if (!alterado) {
            throw new PessoaNotFoundException("A pessoa não foi encontrada");
        }

    }

    public void deleteById(String id) {
        boolean removido = false;

        for (Pessoa pessoaLoop : pessoas
        ) {
            if (pessoaLoop.getId().toString().equals(id)) {
                this.pessoas.remove(pessoaLoop);
                removido = true;
                break;
            }
        }
        if (!removido) {
            throw new PessoaNotFoundException("Pessoa não foi encontrada!");
        }
    }
}

