package controllers;

import java.util.Date;

import models.Usuario;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import play.libs.WS;
import play.mvc.Controller;

public class Jogadores extends Controller{

	public static void salvarUsuario(String nome, String email, String senha){
		Gson gson = new Gson();
		play.libs.WS.HttpResponse res = WS.url("http://localhost:9000").setParameter("nome", nome).get();
		JsonElement type = res.getJson();	
		Usuario usuario = gson.fromJson(type, Usuario.class);
		
		String idUsuario = session.get("usuario");
		
	
	}
}
