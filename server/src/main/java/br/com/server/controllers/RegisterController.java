package br.com.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.server.entities.PessoaFisica;
import br.com.server.entities.PessoaJuridica;
import br.com.server.properties.PessoaFisicaRepository;
import br.com.server.properties.PessoaJuridicaRepository;


@RestController
@RequestMapping("/cielo")
public class RegisterController {
	
    private final PessoaFisicaRepository pessoaFisicaRepository;
    private final PessoaJuridicaRepository pessoaJuridicaRepository;

    @Autowired
    public RegisterController(PessoaFisicaRepository pessoaFisicaRepository, PessoaJuridicaRepository pessoaJuridicaRepository) {
        this.pessoaFisicaRepository = pessoaFisicaRepository;
        this.pessoaJuridicaRepository = pessoaJuridicaRepository;
    }

    @PostMapping(path = "/cadastro/pessoafisica", consumes = "application/json")
    public ResponseEntity<String> cadastrarPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
        pessoaFisicaRepository.save(pessoaFisica);
        System.out.println(pessoaFisica);
        return ResponseEntity.status(HttpStatus.CREATED).body("Pessoa física cadastrada com sucesso!");
    }

    @PostMapping("/pessoajuridica")
    public ResponseEntity<String> cadastrarPessoaJuridica(@RequestBody PessoaJuridica pessoaJuridica) {
        pessoaJuridicaRepository.save(pessoaJuridica);
        return ResponseEntity.status(HttpStatus.CREATED).body("Pessoa jurídica cadastrada com sucesso!");
    }
}
