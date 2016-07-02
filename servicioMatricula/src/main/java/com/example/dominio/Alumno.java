package com.example.dominio;



import java.util.List;
import javax.persistence.JoinColumn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Alumno {
	@Id
	/*@SequenceGenerator(name = "Alumno_ID_GENERATOR", sequenceName = "Alumno_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Alumno_ID_GENERATOR")*/
	public Integer id;
	public String nombres;
	public String apellidoPaterno;
	public String apellidoMaterno;
	public Integer dni;
	
	@ManyToMany
    @JoinTable(name = "AlumnoIntermediaCurso",
    joinColumns = @JoinColumn(name = "Alumno_ID", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "Curso_ID", referencedColumnName = "codigo"))
	private List<Curso> cursoAlumno;
	//@ManyToOne
	//@JoinColumn(name = "Matricula_ID")/*Relacion Muchos a Uno, en Muchos va como clave Foranea la Clave Primaria de UNO(Album)	
	//public Matricula matricula;
	public Alumno() {
	}

	public Alumno(Integer id,String nombres, String apellidoPaterno,String apellidoMaterno, Integer dni) {
		this.id=id;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.dni = dni;
	}
}
