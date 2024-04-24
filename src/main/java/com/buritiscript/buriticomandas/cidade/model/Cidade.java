package com.buritiscript.buriticomandas.cidade.model;

import java.util.Set;

import com.buritiscript.buriticomandas.endereco.model.Endereco;
import com.buritiscript.buriticomandas.estado.model.Estado;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "cidade")
public class Cidade {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotBlank
  @NotNull
  private String nome;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "estado_id")
  private Estado estado;

  @OneToMany(mappedBy = "cidade")
  private Set<Endereco> enderecos;

}
