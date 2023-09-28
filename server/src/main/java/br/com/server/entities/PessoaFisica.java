package br.com.server.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class PessoaFisica {

    @Id
    @Size(min = 11, max = 11, message = "O CPF deve ter 11 dígitos")
    @Pattern(regexp = "^\\d{11}$", message = "O CPF deve conter apenas números")
    private String cpf;

    @Size(max = 4, message = "O MCC deve ter no máximo 4 caracteres")
    private String mcc;

    @NotBlank(message = "O nome não pode estar em branco")
    @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres")
    private String nome;

    @Pattern(regexp = "^[a-zA-Z0-9_\\-\\.]+@[a-zA-Z0-9_\\-\\.]+\\.[a-zA-Z]{2,5}$", message = "O email não é válido")
    private String email;

}
