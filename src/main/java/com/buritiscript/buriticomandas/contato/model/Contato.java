package com.buritiscript.buriticomandas.contato.model;

import com.buritiscript.buriticomandas.empresa.model.Empresa;
import com.buritiscript.buriticomandas.usuario.model.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "contato")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String telefone;
    private String whatsapp;
    private String email;

    @OneToOne(mappedBy = "contato")
    private Empresa empresa;

    @OneToOne(mappedBy = "contato")
    private Usuario usuario;

}
