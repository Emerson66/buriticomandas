package com.buritiscript.buriticomandas.estado.model;

import java.util.Set;

import com.buritiscript.buriticomandas.cidade.model.Cidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "estado")
public class Estado {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String sigla;
  @OneToMany(mappedBy = "estado")
  private Set<Cidade> cidades;
}
