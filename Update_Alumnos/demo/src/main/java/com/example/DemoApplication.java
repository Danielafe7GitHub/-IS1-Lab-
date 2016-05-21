package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dominio.Alumno;
import com.example.repositorio.AlumnoRepositorio;

@EnableAutoConfiguration
@Controller
public class DemoApplication {

	AlumnoRepositorio repositorio = new AlumnoRepositorio();
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/alumnos")
	@ResponseBody
	public List<Alumno> alumnos() {
		String ordenar="nombre";
		// 0: ascendente  1: descendente		
		if (ordenar=="paterno")
				return repositorio.listar_paterno(0);
		
		else if (ordenar=="nombre")
			return repositorio.listar_nombre(0);
		
		else if (ordenar=="nota")
			return repositorio.listar_nota(0);
		else 
			return null;
	}
	
	
}
