package com.example.demo1.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Municipio {
    @Id
    private Integer id;
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "departamento_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Departamento departamento;
}
