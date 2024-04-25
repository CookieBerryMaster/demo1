package com.example.demo1.controller;

import com.example.demo1.dto.DepartamentoDTO;
import com.example.demo1.modelo.Departamento;
import com.example.demo1.service.IServiceDepartamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class ControllerDepartamento {
    @Autowired
    IServiceDepartamento serviceDepartamento;

    @GetMapping("/all")
    public List<Departamento> getAll(){
        return serviceDepartamento.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody DepartamentoDTO departamentoDTO){

        serviceDepartamento.save(departamentoDTO);
        return ResponseEntity.ok("Departamento creado");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        if(id == null){
            return ResponseEntity.badRequest().body("No existe el id");
        }
        serviceDepartamento.delete(id);
        return ResponseEntity.ok("Departamento Borrado");
    }


    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody DepartamentoDTO departamentoDTO){
        if(departamentoDTO.getId() == null){
            return ResponseEntity.badRequest().body("No existe el id");
        }
        serviceDepartamento.save(departamentoDTO);
        return ResponseEntity.ok("departamento actualizado");
    }

}
