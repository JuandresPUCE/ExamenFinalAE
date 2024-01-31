package com.examen.puce.repositories;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.examen.puce.models.User;
import java.util.*;


/*Guardar Usuario

● Listar todos los Usuarios

● Actualizar Usuario

● Eliminar Usuario

● Listar Usuario por ID
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    
    
}
