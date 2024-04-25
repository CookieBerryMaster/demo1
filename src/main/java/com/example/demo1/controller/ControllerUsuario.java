package com.example.demo1.controller;

import com.example.demo1.modelo.Usuario;
import com.example.demo1.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class ControllerUsuario {
    @Autowired
    private IServiceUsuario serviceUsuario;
    @GetMapping("/all")
    public List<Usuario> getALL(){
        return serviceUsuario.getAll();
    }

    //metodo de htps
    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Usuario usuario){
        serviceUsuario.create(usuario);
        return ResponseEntity.ok("Usuario creado");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Usuario usuario){
        if(usuario.getId() == null){
            return ResponseEntity.badRequest().body("No existe el id");
        }
        serviceUsuario.create(usuario);
        return ResponseEntity.ok("Usuario actualizado");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        if(id == null){
            return ResponseEntity.badRequest().body("No existe el id");
        }
        serviceUsuario.delete(id);
        return ResponseEntity.ok("Usuario Borrado");
    }
}
