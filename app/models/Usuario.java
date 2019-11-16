package models;

import javax.persistence.Entity;


import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

import javax.persistence.TemporalType;

import play.data.validation.Email;
import play.data.validation.Required;
import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Usuario extends Model{
	@Required
	public String nome;
	
	@Required
	@Email
	public String email;
	
	@Required
	public String senha;
	
	//public Blob foto;
	
		
	@OneToOne
	@JoinColumn(name = "conta_id")
	public Conta conta;


	public boolean isUnico() {
		Usuario u = Usuario.find("email", email).first();
		if(u == null || u.id == id){
			return true;
		}
		return false;
	}
}
