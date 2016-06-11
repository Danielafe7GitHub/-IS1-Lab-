/*package com.example.controlador;

import com.example.dominio.Matricula;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class MatriculaControlador {

   @RequestMapping(value = "/matricula", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("matricula", "command", new Matricula());
   }
   
   @RequestMapping(value = "/addMatricula", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")Matricula matricula, 
   ModelMap model) {
      model.addAttribute("Codigo_Alumno", matricula.getCodigoAlumno());
      model.addAttribute("Codigo_Curso", matricula.getCodigoCurso());
      model.addAttribute("Nombre_Alumno", matricula.getNombreAlumno());
      model.addAttribute("Nombre_Curso", matricula.getCurso());
      model.addAttribute("Semestre", matricula.getSemestre());
      
      return "result";
   }
}*/