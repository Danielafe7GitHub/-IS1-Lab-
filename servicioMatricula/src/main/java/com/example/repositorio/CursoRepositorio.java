package com.example.repositorio;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.dominio.Curso;

public interface CursoRepositorio extends CrudRepository<Curso, String> {
	List<Curso> findAll();
	/*Listar Todo los Cursos*/
	Curso[] data = {
			new Curso("Cod1", "Ing Software", 4),
			new Curso("Cod2", "Analisis",1234),
			new Curso("Cod3", "Ingles", 12345),
		};
		
		public default List<Curso> listarCursos() {
			return Arrays.asList(data);
		}
		
	/*Buscar por su Codigo*/
	@Query("SELECT c FROM Curso c WHERE c.codigo = :codigo")
	Curso findByCodigo(String codigo);
	
	/*Buscar por su Nombre*/
	@Query("SELECT c FROM Curso c WHERE c.nombre = :nombre")
	Curso buscarPorNombre(String nombre);
		
	
	
	
	
	
}

