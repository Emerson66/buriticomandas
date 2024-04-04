package com.buritiscript.buriticomandas.usuario.model;

import com.buritiscript.buriticomandas.contato.model.Contato;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "usuario")
public class Usuario {
    private Long id;
    private String nome;
    private String senha;
    private Contato contato;
    
}
