package br.com.server.components;

import br.com.server.entities.PessoaFisica;
import br.com.server.entities.PessoaJuridica;
import br.com.server.properties.PessoaFisicaRepository;
import br.com.server.properties.PessoaJuridicaRepository;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PessoaComponent {

    private final PessoaFisicaRepository pessoaFisicaRepository;
    private final PessoaJuridicaRepository pessoaJuridicaRepository;

    public PessoaComponent(PessoaFisicaRepository pessoaFisicaRepository, PessoaJuridicaRepository pessoaJuridicaRepository) {
        this.pessoaFisicaRepository = pessoaFisicaRepository;
        this.pessoaJuridicaRepository = pessoaJuridicaRepository;
    }
    
    public String salvarPessoaFisica(PessoaFisica pessoaFisica) {
        pessoaFisicaRepository.save(pessoaFisica);
        return "Pessoa física cadastrada com sucesso!";
    }
    
    public List<PessoaFisica> getAllPessoasFisicas() {
        return pessoaFisicaRepository.findAll();
    }
    
    public String salvarPessoaJuridica(PessoaJuridica pessoaJuridica) {
        pessoaJuridicaRepository.save(pessoaJuridica);
        return "Pessoa jurídica cadastrada com sucesso!";
    }
    
    public List<PessoaJuridica> getAllPessoasJuridicas() {
        return pessoaJuridicaRepository.findAll();
    }
}
