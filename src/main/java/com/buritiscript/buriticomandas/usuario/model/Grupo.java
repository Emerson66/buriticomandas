package com.buritiscript.buriticomandas.usuario.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Grupo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "grupo_permissao",
        joinColumns = @JoinColumn(name = "permissao_id"),
        inverseJoinColumns = @JoinColumn(name = "permissao_id"))
    private Set<Permissao> permissoes = new HashSet<>(); 
    
    public void desassociarPermissao(Permissao permissao){
        permissoes.remove(permissao);
    }

    public void associarPermissao(Permissao permissao){
        permissoes.add(permissao);
    }
}
