package com.example.demo1.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
public class MunicipioDTO {
    private Integer id;
    private String nombre;
}
