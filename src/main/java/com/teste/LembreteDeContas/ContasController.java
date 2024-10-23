package com.teste.LembreteDeContas;

import com.teste.LembreteDeContas.*;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("/contas")
public class ContasController {

    private List<Contas> contas = new ArrayList<>();

    // Método para adicionar uma nova conta
    @PostMapping("/add")
    public String addConta(@RequestBody Contas conta) {
        contas.add(conta);
        return "Conta adicionada com sucesso!";
    }

    // Método para listar todas as contas
    @GetMapping("/listar")
    public List<Contas> listarContas() {
        return contas;
    }

    // Método para localizar por ID ou nome
    @GetMapping("/procurar")
    public Contas getMethodName(@RequestParam String nome) {
        final Contas[] contaEncontrada = {null};

        contas.forEach((conta) -> {
            if (conta.getConta().equalsIgnoreCase(nome)) {
                contaEncontrada[0] = conta;
            }
        });

        if (contaEncontrada[0] !=null) {
            return contaEncontrada[0];
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Conta não encontrada");
        }
    }
    
}
