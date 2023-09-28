package br.com.server.components;

import br.com.server.entities.PessoaFisica;
import br.com.server.properties.PessoaFisicaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PessoaFisicaComponent {

    private final PessoaFisicaRepository pessoaFisicaRepository;

    @Autowired
    public PessoaFisicaComponent(PessoaFisicaRepository pessoaFisicaRepository) {
        this.pessoaFisicaRepository = pessoaFisicaRepository;
    }

    @Valid
    public void salvarPessoaFisica(PessoaFisica pessoaFisica) {
        pessoaFisicaRepository.save(pessoaFisica);
    }
}
