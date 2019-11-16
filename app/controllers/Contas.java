package controllers;

import java.util.List;

import models.Conta;
import models.Usuario;
import play.mvc.Controller;

public class Contas extends Controller{
	
	public static void pontuacao(){
		render();
	}

	public static void DetalhesConta(Conta conta){
		long id = new Long (session.get("idUsuarioLogado"));
		Usuario usuario = Usuario.findById(id);
		Conta con = Conta.findById(id);
		
		conta = usuario.conta;
		List<Conta> cont =Conta.findAll();
		
		render(conta,usuario,con,cont);
	}
	
	/*public static void listarConta(Conta id){
		List<Conta> contas = Conta.findAll();
		render(contas);
	}*/
	
	public static void listarConta(Conta id){
		Usuario usuario = Usuario.findById(id);
		render(usuario);
	}
	
}

