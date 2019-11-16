package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Conta  extends Model{
	
	
	public int pontuacao;	
	
	public int tiroAgua;
	
	public int totBarcosAfundados;
	

	@Temporal(TemporalType.DATE)
	public Date dataJogo;
	
	@OneToOne(mappedBy = "conta")
	public Usuario usuario;

	
		
	public String toString(){
		return "\njogador.id"+id+"\njogador.pontuacao"+pontuacao+"\njogador.tiroAgua"+tiroAgua+"\njogador.totBarcosAfundados"+totBarcosAfundados;
	}
}
