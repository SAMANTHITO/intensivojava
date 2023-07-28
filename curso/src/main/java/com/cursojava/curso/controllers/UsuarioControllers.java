package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioControllers {

    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario =new Usuario();
        usuario.setId(id);
        usuario.setNombre("alfonso");
        usuario.setApellido("vera");
        usuario.setEmail("alfonso@gmail.com");
        usuario.setTelefono("121212121212");
        return usuario;
    }
    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void RegistrarUsuario(@RequestBody Usuario usuario){
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }
    @RequestMapping(value = "api/usuario34")
    public Usuario buscar(){
        Usuario usuario =new Usuario();
        usuario.setNombre("alfonso");
        usuario.setApellido("vera");
        usuario.setEmail("alfonso@gmail.com");
        usuario.setTelefono("121212121212");
        return usuario;
    }
    @RequestMapping(value = "api/usuario56")
    public Usuario editar(){
        Usuario usuario =new Usuario();
        usuario.setNombre("alfonso");
        usuario.setApellido("vera");
        usuario.setEmail("alfonso@gmail.com");
        usuario.setTelefono("121212121212");
        return usuario;
    }
}
