package br.com.server.models.enun;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisicaDTO {
    private String cpf;
    private String mcc;
    private String nome;
    private String email;
}
