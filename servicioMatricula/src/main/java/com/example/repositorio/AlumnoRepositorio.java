package com.example.repositorio;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.dominio.Alumno;
import com.example.dominio.Curso;

public interface AlumnoRepositorio extends CrudRepository<Alumno, Integer> {
	List<Alumno> findAll();
	Alumno[] data = {
			new Alumno(1,"Juan", "Perez","Perez", 123),
			new Alumno(2,"Maria", "Castro","Perez",1234),
			new Alumno(3,"Jose", "Ruiz","Perez", 12345),
		};
		
		public default List<Alumno> listar() {
			return Arrays.asList(data);
		}
		
	/*Buscar un alumno por su apellido paterno.*/
		@Query("SELECT a FROM Alumno a WHERE a.apellidoPaterno = :apellidoPaterno")
		Alumno findByApellidoPAterno(String apellidoPaterno);
		
	/*Listar los alumnos matriculados en un deteminado curso y semestre con sus respectivas notas.*/
	    
	    @Query(" SELECT a FROM Alumno a JOIN a.cursoAlumno c WHERE c.nombre = :curso")
	    Alumno listarCursoYMatricula(String nombre);
	    
	    
	   
			
		
}





