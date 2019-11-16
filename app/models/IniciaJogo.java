package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class IniciaJogo  extends Model{
	 public Date inicioJogo;
	 public Date finalJogo;
	 public int pontuacao = 0;
	 

}
