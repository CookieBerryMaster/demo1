package com.example.demo1.service;

import com.example.demo1.modelo.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service//capa de negocio, es un servicio
public interface IServiceUsuario {

    public List<Usuario> getAll();

    //dto???
    public void create(Usuario usuario);

    public void delete(Integer id);

}
