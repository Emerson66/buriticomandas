package com.buritiscript.buriticomandas.endereco.model;

import com.buritiscript.buriticomandas.cidade.model.Cidade;
import com.buritiscript.buriticomandas.empresa.model.Empresa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "endereco")
public class Endereco {
    @NotBlank
    private String bairro;
    @NotBlank
    private String logradouro;
    @NotBlank
    private String numero;
    @NotBlank
    private String complemento;
    @NotBlank
    private String cep;
    @OneToOne(mappedBy = "endereco")
    private Empresa empresa;
    private Cidade cidade;
    @Deprecated
    public Endereco() {
    }
}
