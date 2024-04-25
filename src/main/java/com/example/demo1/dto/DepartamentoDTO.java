package com.example.demo1.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

import java.util.List;

//este no es un entity pero es un bean
@Data
public class DepartamentoDTO {
    private Integer id;
    private  String nombre;
    private List<MunicipioDTO> listMunicipioDTO;

}
