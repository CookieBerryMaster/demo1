package com.example.demo1.controller;

import com.example.demo1.modelo.Usuario;
import com.example.demo1.service.IServiceUsuario;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//para decir que es un microservicio
@RestController
//es opcional pero ni tanto
//solicitud para este path
@RequestMapping("/welcome")
public class Welcome {

    @Autowired
   // @Qualifier()
    private IServiceUsuario serviceUsuario;

    //response entity mensaje de respuesta adjunto
    //con el status del codigo http

    @GetMapping("/greeting")//solicitar path?
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok("hola");
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> goodbye(){
        return new ResponseEntity<>("Gracias", HttpStatus.OK);
    }

    /*@GetMapping("/usuario")
    public List<Usuario> getAll(){
        return serviceUsuario.getAll();
    }*/
}
