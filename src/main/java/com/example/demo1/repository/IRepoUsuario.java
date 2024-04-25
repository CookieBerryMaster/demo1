package com.example.demo1.repository;

import com.example.demo1.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//<T, ID> T representa el tipo de modelo o el entity
//id el tipo de identificador de la llave del entity
@Repository
public interface IRepoUsuario extends JpaRepository<Usuario, Integer>{

}
