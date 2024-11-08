package com.demodj.demo_examen.Controller;

import com.demodj.demo_examen.Models.Estudiante;

import com.demodj.demo_examen.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    // Listar todos los estudiantes
    @GetMapping("/listar")
    public String listAllEstudiantes(Model model) {
        model.addAttribute("title", "Lista de Estudiantes");
        model.addAttribute("listaEstudiantes", estudianteService.getAllEstudiantes());
        return "pages/lista-estudiante";
    }

    // Formulario para agregar un nuevo estudiante
    @GetMapping("/nuevo")
    public String addEstudiante(Model model) {
        Estudiante estudiante = new Estudiante();
        model.addAttribute("title", "Agregar Estudiante");
        model.addAttribute("estudiante", estudiante);
        return "pages/form-Estudiante";
    }

    // Guardar un nuevo estudiante
    @PostMapping("/save")
    public String saveEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
        estudianteService.addEstudiante(estudiante);
        return "redirect:/estudiante/listar";
    }

    // Formulario para actualizar un estudiante
    @GetMapping("/actualizar/{id}")
    public String showUpdateEstudiante(@PathVariable(value = "id") Long id, Model model) {
        Estudiante estudiante = estudianteService.getEstudianteById(id);
        model.addAttribute("title", "Actualizar Estudiante");
        model.addAttribute("estudiante", estudiante);
        return "pages/form-EstudianteActualizar";
    }

    // Guardar los cambios de actualización de un estudiante
    @PostMapping("/update")
    public String updateEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
        estudianteService.updateEstudiante(estudiante);
        return "redirect:/estudiante/listar";
    }

    // Eliminar un estudiante por su ID
    @GetMapping("/delete/{id}")
    public String deleteEstudiante(@PathVariable(value = "id") Long id) {
        estudianteService.deleteEstudiante(id);
        return "redirect:/estudiante/listar";
    }
}
