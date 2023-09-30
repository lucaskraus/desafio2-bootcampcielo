package br.com.server.entities;

import jakarta.persistence.Column;
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
@Table(name = "pessoajuridica")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridica {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(name = "cnpj")
    @Size(min = 14, max = 14, message = "O CNPJ deve ter 14 dígitos")
    @Pattern(regexp = "^\\d{14}$", message = "O CNPJ deve conter apenas números")
    private String cnpj;
    
    @Column(name = "razaosocial")
    @Size(max = 50, message = "A razão social deve ter no máximo 50 caracteres")
    private String razaoSocial;
    
    @Column(name = "mcc")
    @Size(max = 4, message = "O MCC deve ter no máximo 4 caracteres")
    private String mcc;
    
    @Column(name = "cpfcontato")
    @Size(min = 11, max = 11, message = "O CPF do contato deve ter 11 dígitos")
    @Pattern(regexp = "^\\d{11}$", message = "O CPF do contato deve conter apenas números")
    private String cpfContato;
    
    @Column(name = "nomecontato")
    @Size(max = 50, message = "O nome do contato deve ter no máximo 50 caracteres")
    private String nomeContato;
    
    @Column(name = "emailcontato")
    @Pattern(regexp = "^[a-zA-Z0-9_\\-\\.]+@[a-zA-Z0-9_\\-\\.]+\\.[a-zA-Z]{2,5}$", message = "O email do contato não é válido")
    private String emailContato;
    
}