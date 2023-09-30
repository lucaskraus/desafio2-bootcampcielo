package br.com.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.server.components.PessoaComponent;
import br.com.server.entities.PessoaFisica;
import br.com.server.entities.PessoaJuridica;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/cielo")
public class RegisterController {
	
    
	@Autowired
    private PessoaComponent component;

	@PostMapping(path = "/cadastro/pessoafisica", consumes = "application/json")
	public ResponseEntity<String> cadastrarPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
	    String mensagem = component.salvarPessoaFisica(pessoaFisica);
	    System.out.println(pessoaFisica);
	    return ResponseEntity.status(HttpStatus.OK).body(mensagem);
	}
	
	@PostMapping(path = "/cadastro/pessoajuridica", consumes = "application/json")
	public ResponseEntity<String> cadastrarPessoaJuridica(@RequestBody PessoaJuridica pessoaJuridica) {
		String mensagem = component.salvarPessoaJuridica(pessoaJuridica);
	    System.out.println(pessoaJuridica);
	    return ResponseEntity.status(HttpStatus.OK).body(mensagem);
	}
	
	@GetMapping("/fila/pessoafisica")
    public ResponseEntity<List<PessoaFisica>> getAllPessoasFisicas() {
        List<PessoaFisica> pessoasFisicas = component.getAllPessoasFisicas();
        return ResponseEntity.status(HttpStatus.OK).body(pessoasFisicas);
    }
	
	@GetMapping("/fila/pessoajuridica")
    public ResponseEntity<List<PessoaJuridica>> getAllPessoasJuridicas() {
        List<PessoaJuridica> pessoasJuridicas = component.getAllPessoasJuridicas();
        return ResponseEntity.status(HttpStatus.OK).body(pessoasJuridicas);
    }

}
