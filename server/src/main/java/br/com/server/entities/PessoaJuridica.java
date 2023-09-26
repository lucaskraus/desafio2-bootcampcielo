package br.com.server.entities;
import jakarta.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class PessoaJuridica {

    @Id
    @Size(min = 14, max = 14, message = "O CNPJ deve ter 14 dígitos")
    @Pattern(regexp = "^\\d{14}$", message = "O CNPJ deve conter apenas números")
    private String cnpj;

    @NotBlank(message = "A razão social não pode estar em branco")
    @Size(max = 50, message = "A razão social deve ter no máximo 50 caracteres")
    private String razaoSocial;

    @Size(max = 4, message = "O MCC deve ter no máximo 4 caracteres")
    private String mcc;

    @Size(min = 11, max = 11, message = "O CPF do contato deve ter 11 dígitos")
    @Pattern(regexp = "^\\d{11}$", message = "O CPF do contato deve conter apenas números")
    private String cpfContato;

    @NotBlank(message = "O nome do contato não pode estar em branco")
    @Size(max = 50, message = "O nome do contato deve ter no máximo 50 caracteres")
    private String nomeContato;

    @Pattern(regexp = "^[a-zA-Z0-9_\\-\\.]+@[a-zA-Z0-9_\\-\\.]+\\.[a-zA-Z]{2,5}$", message = "O email do contato não é válido")
    private String emailContato;

}