package br.com.server.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

public class PessoaFisicaDTO {
    
    private String cpf;
    private String mcc;
    private String nome;
    private String email;

}
