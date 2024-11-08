/*package com.demodj.demo_examen.Controller;


import com.demodj.demo_examen.Models.Curso;
import com.demodj.demo_examen.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    // Listar todos los cursos
    @GetMapping("/listar")
    public String listAllCursos(Model model) {
        model.addAttribute("title", "Lista de Cursos");
        model.addAttribute("listaCursos", cursoService.getAllCursos());
        return "pages/lista-curso";
    }

    // Formulario para agregar un nuevo curso
    @GetMapping("/nuevo")
    public String addCurso(Model model) {
        Curso curso = new Curso();
        model.addAttribute("title", "Agregar Curso");
        model.addAttribute("curso", curso);
        return "pages/form-Curso";
    }

    // Guardar un nuevo curso
    @PostMapping("/save")
    public String saveCurso(@ModelAttribute("curso") Curso curso) {
        cursoService.addCurso(curso);
        return "redirect:/curso/listar";
    }

    // Formulario para actualizar un curso
    @GetMapping("/actualizar/{id}")
    public String showUpdateCurso(@PathVariable(value = "id") Long id, Model model) {
        Curso curso = cursoService.getCursoById(id);
        model.addAttribute("title", "Actualizar Curso");
        model.addAttribute("curso", curso);
        return "pages/form-CursoActualizar";
    }

    // Guardar los cambios de actualización de un curso
    @PostMapping("/update")
    public String updateCurso(@ModelAttribute("curso") Curso curso) {
        cursoService.updateCurso(curso);
        return "redirect:/curso/listar";
    }

    // Eliminar un curso por su ID
    @GetMapping("/delete/{id}")
    public String deleteCurso(@PathVariable(value = "id") Long id) {
        cursoService.deleteCurso(id);
        return "redirect:/curso/listar";
    }
}
*/