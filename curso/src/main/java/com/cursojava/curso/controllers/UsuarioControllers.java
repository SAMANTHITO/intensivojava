package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControllers {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario =new Usuario();
        usuario.setId(id);
        usuario.setNombre("alfonso");
        usuario.setApellido("vera");
        usuario.setEmail("alfonso@gmail.com");
        usuario.setTelefono("121212121212");
        return usuario;
    }
    @RequestMapping(value = "usuario12")
    public Usuario eliminar(){
        Usuario usuario =new Usuario();
        usuario.setNombre("alfonso");
        usuario.setApellido("vera");
        usuario.setEmail("alfonso@gmail.com");
        usuario.setTelefono("121212121212");
        return usuario;
    }
    @RequestMapping(value = "usuario34")
    public Usuario buscar(){
        Usuario usuario =new Usuario();
        usuario.setNombre("alfonso");
        usuario.setApellido("vera");
        usuario.setEmail("alfonso@gmail.com");
        usuario.setTelefono("121212121212");
        return usuario;
    }
    @RequestMapping(value = "usuario56")
    public Usuario editar(){
        Usuario usuario =new Usuario();
        usuario.setNombre("alfonso");
        usuario.setApellido("vera");
        usuario.setEmail("alfonso@gmail.com");
        usuario.setTelefono("121212121212");
        return usuario;
    }
}
