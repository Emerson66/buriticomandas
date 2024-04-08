package com.buritiscript.buriticomandas.cidade.model;

import com.buritiscript.buriticomandas.estado.model.Estado;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "cidade")
public class Cidade {
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "estado_id", nullable = false)
private Estado estado;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@NotBlank
@NonNull
private String nome;
}
