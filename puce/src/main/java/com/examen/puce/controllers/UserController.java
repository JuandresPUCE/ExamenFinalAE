package com.examen.puce.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.examen.puce.models.User;
import com.examen.puce.services.UserService;


/*Guardar Usuario revisado

Listar todos los Usuarios revisado

● Actualizar Usuario revisado

● Eliminar Usuario revisado

Listar Usuario por ID
 */

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    //select
    @GetMapping("/usuarios")
    public List<User> listarUsuarios(){
        return userService.listartodosUsuarios();
    }

    //select by id
    @GetMapping("/usuarios/{id}")
    public User listarUsuarioPorId(@PathVariable int id){
        return userService.listarUsuarioPorId(id);
    }

    //insert
    @PostMapping("/usuarios")
    public User guardarUsuario(@RequestBody User user){
        return userService.guardarUsuario(user);
    }
    //update
    @PutMapping("/usuarios/{id}")
    public User actualizarUsuario(@RequestBody User user, @PathVariable int id){
        userService.actualizarUsuario(user);
        User userExistente = userService.listarUsuarioPorId(id);
        return userExistente;
    }
    //delete by id 
    @DeleteMapping("/usuarios/{id}")
    public void eliminarUsuario(@PathVariable int id){
        userService.eliminarUsuario(id);
    }


    
}
