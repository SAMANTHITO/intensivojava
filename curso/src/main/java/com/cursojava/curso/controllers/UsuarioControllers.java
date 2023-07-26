package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario =new Usuario();
        usuario.setId(456);
        usuario.setNombre("alfonso");
        usuario.setApellido("vera");
        usuario.setEmail("alfonso@gmail.com");
        usuario.setTelefono("333333333333");

        Usuario usuario2 =new Usuario();
        usuario2.setId(789);
        usuario2.setNombre("julia");
        usuario2.setApellido("vera");
        usuario2.setEmail("julia.vera@gmail.com");
        usuario2.setTelefono("4444444444444");

        Usuario usuario3 =new Usuario();
        usuario3.setId(345);
        usuario3.setNombre("juan");
        usuario3.setApellido("vera");
        usuario3.setEmail("juan.vera@gmail.com");
        usuario3.setTelefono("5555555555");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
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
