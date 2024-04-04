package com.buritiscript.buriticomandas.contato.model;

import com.buritiscript.buriticomandas.empresa.model.Empresa;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contato")
public class Contato {
    private String telefone;
    private String whatsapp;
    private String email;
    @OneToOne(mappedBy = "contato")
    private Empresa empresa;
}
