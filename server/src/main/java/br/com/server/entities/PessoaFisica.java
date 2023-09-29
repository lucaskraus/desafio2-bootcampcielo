package br.com.server.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pessoafisica")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 11, max = 11, message = "O CPF deve ter 11 dígitos")
	@Pattern(regexp = "^\\d{11}$", message = "O CPF deve conter apenas números")
	private String cpf;

	@Size(max = 4, message = "O MCC deve ter no máximo 4 caracteres")
	private String mcc;

	@Size(max = 50, message = "O nome deve ter no máximo 50 caracteres")
	private String nome;

	@Pattern(regexp = "^[a-zA-Z0-9_\\-\\.]+@[a-zA-Z0-9_\\-\\.]+\\.[a-zA-Z]{2,5}$", message = "O email não é válido")
	private String email;

}
