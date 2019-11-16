package controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import models.IniciaJogo;
import models.Usuario;

import play.libs.WS;
import play.mvc.Controller;

public class Logins extends Controller{
 
	public static void login(){
		/*String url = "https://acounts.google.com/o/oauth2/v2/auth?"
				+ "client_id=900436149089-fs27mm4sad3n16bbvlqt0n43mo3lje4k.apps.googleusercontent.com"
				+ "&response_type=code&"
				+ "scope=openid%20email%20profile&"
				+ "redirect_uri=http://localhost:9000/Logins/perfil&state=&";
				render(url)
				*/
		render();
	}
	
	public static void autenticar(String login, String senha){
		Map param = new HashMap();
		param.put("login", login);
		param.put("senha", senha);
		
		play.libs.WS.HttpResponse res = WS.url("http://localhost:9000/autenticar").setParameters(param).post();
		if(res.success()){
			//flash.success("Usuário ou Senha OK!");
			Application.index();
						
		}else{
			
			flash.error("Usuário ou Senha Inválido!");
			Logins.login();
		}
	
					
	}
	
	
	public static void logout(){
		session.clear();
		System.out.println("logout");
		login();
	}
	
	public static void logoutAdministrador(){
		
		login();
	}
}
