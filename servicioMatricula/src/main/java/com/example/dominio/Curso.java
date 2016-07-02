package com.example.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso {

	@Id
	public String codigo;
	public String nombre;
	public Integer creditos;
	
	//public List<Curso> prerequisitos;

	public Curso() {
	}

	public Curso(String codigo,String nombre,Integer creditos) {
		this.codigo=codigo;
		this.nombre = nombre;
		this.creditos = creditos;
		
	}
}
