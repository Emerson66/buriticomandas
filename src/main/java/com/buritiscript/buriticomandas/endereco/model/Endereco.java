package com.buritiscript.buriticomandas.endereco.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @NotBlank
    private String cidade;
    @NotBlank
    private String uf;
    @NotBlank
    private Long logradouro;
    @NotBlank
    private Long numero;

    @Deprecated
    public Endereco() {
    }
}
