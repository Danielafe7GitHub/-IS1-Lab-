
package com.example.dominio;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Matricula {
	
	@Id public Integer id;
	public String nombre_alumno;
	public String nombre_curso;
	

	public Matricula() {
	}

	public Matricula(Integer id, String nombre_alumno,String nombre_curso ){
		this.id = id;		
		this.nombre_alumno = nombre_alumno;
		this.nombre_curso = nombre_curso;
		
	}
}
