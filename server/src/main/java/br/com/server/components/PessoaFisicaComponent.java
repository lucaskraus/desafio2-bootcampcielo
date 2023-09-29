package br.com.server.components;

import br.com.server.entities.PessoaFisica;
import br.com.server.properties.PessoaFisicaRepository;
import org.springframework.stereotype.Component;

@Component
public class PessoaFisicaComponent {

    private final PessoaFisicaRepository pessoaFisicaRepository;

    public PessoaFisicaComponent(PessoaFisicaRepository pessoaFisicaRepository) {
        this.pessoaFisicaRepository = pessoaFisicaRepository;
    }

    public void cadastrarPessoaFisica(PessoaFisica pessoaFisica) {
        pessoaFisicaRepository.save(pessoaFisica);
    }
}
