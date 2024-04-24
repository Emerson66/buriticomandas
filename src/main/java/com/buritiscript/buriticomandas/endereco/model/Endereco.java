package com.buritiscript.buriticomandas.endereco.model;

import com.buritiscript.buriticomandas.cidade.model.Cidade;
// import com.buritiscript.buriticomandas.cidade.model.Cidade;
import com.buritiscript.buriticomandas.empresa.model.Empresa;
import com.buritiscript.buriticomandas.usuario.model.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

    @OneToOne(mappedBy = "endereco")
    private Usuario usuario;

}
