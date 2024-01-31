package com.examen.puce.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.puce.models.User;
import com.examen.puce.repositories.UserRepository;

/* Guardar Usuario

Listar todos los Usuarios

Actualizar Usuario

Eliminar Usuario

Listar Usuario por ID */

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //select 
    public List<User> listartodosUsuarios(){
        return userRepository.findAll();
    }

    //select by id
    public User listarUsuarioPorId(int id){
        return userRepository.findById(id).orElseThrow();
    }
    //insert
    public User guardarUsuario(User user){
        return userRepository.save(user);
    }
    //update
    public User actualizarUsuario(User user){
        return userRepository.save(user);
    }
    //delete
    public void eliminarUsuario(int id){
        userRepository.deleteById(id);
    }
}
