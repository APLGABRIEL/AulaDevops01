package br.com.angelo.ordemservico.departamento.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DEPARTAMENTO")
    private Integer idDepartamento;
    @Column(name = "NOME_DEPARTAMENTO")
    private String nomeDepartamento;

    public Departamento() {
    }

    public Departamento(Integer idDepartamento, String nomeDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nomeDepartamento = nomeDepartamento;
    }
}
