package com.buritiscript.buriticomandas.empresa.model;


import org.hibernate.validator.constraints.br.CNPJ;

import com.buritiscript.buriticomandas.endereco.model.Endereco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long codigo;
    @NotBlank
    @NotNull
    private String nomeFantasia;
    @NotBlank
    @NotNull
    private String razaoSocial;
    private Long idContato;
    private Endereco endereco;
    @NotBlank
    @CNPJ
    private String cnpj;

    @Deprecated
    public Empresa() {
    }

    
}
