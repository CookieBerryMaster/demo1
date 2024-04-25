package com.example.demo1.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    private Integer id;

    private String nombre;
}
