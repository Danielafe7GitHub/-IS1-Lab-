package com.example.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.dominio.Matricula;

public interface MatriculaRepositorio extends CrudRepository<Matricula, Integer> {
	List<Matricula> findAll();
}






