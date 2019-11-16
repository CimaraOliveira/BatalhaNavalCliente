package controllers;

import java.util.List;

import models.Usuario;

import play.mvc.Controller;

public class Administradores extends Controller{
    public static void administrador(){
    	render();
    }
    
    public static void listar(){
    	List<Usuario>usuarios = Usuario.findAll();
    }
    
    public static void remover(Long id){
    	Usuario usuario = Usuario.findById(id);
    	usuario.delete();
    	flash.success("Usuário removido com sucesso!");
    }
}