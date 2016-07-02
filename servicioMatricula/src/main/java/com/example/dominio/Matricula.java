package com.example.dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Matricula {
	@Id
	@SequenceGenerator(name = "Matricula_ID_GENERATOR", sequenceName = "Matricula_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Matricula_ID_GENERATOR")
	public Integer id;

	
	/*@OneToMany(mappedBy = "matricula")
	private List<Alumno> alumnos;*/
	@ManyToOne
	@JoinColumn(name = "Alumno_ID")
	public Alumno alumno;
	@ManyToOne
	@JoinColumn(name = "Curso_ID")
	public Curso curso;
	public Date fecha;
	public Double nota;
	public Integer semestre;
	
	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Curso getCurso() {
	return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
}
}
