package com.capelli.tarefa04.controller;

import com.capelli.tarefa04.dominio.PessoaNotFoundException;
import com.capelli.tarefa04.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pessoas")

public class PessoaController {
    private PessoaService service = new PessoaService();

    @PostMapping()
    public ResponseEntity<PessoaResponse> salvar(@RequestBody PessoaRequest request) {
        PessoaResponse response = service.salvarPessoa(request);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<PessoaResponse> findById(@PathVariable String id) {
        PessoaResponse resultado = null;

        try {
            resultado = service.findById(id);
        } catch (PessoaNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<PessoaResponse>> pessoa(@RequestParam(value = "primeiroNome", required = false) String nome,
                                                       @RequestParam(value = "sobrenome", required = false) String sobrenome,
                                                       @RequestParam(value = "email", required = false) String email,
                                                       @RequestParam(value = "telefone", required = false) String telefone) {
        List<PessoaResponse> resultado = service.findByNomeSobrenomeEmailTelefone(nome, sobrenome, email, telefone);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @PatchMapping("{id}/profissao")
    public ResponseEntity<PessoaResponse> modificarTrabalho(@PathVariable String id, @RequestBody PessoaRequest request) {
        try {
            service.modifyJob(id, request);

        } catch (PessoaNotFoundException exception) {
            ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<PessoaResponse> deletarPorId(@PathVariable String id) {
        try {
            service.deleteById(id);
        } catch (PessoaNotFoundException exception) {
            ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
