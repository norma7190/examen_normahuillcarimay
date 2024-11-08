/*package com.demodj.demo_examen.service.Impl;



import com.demodj.demo_examen.Repository.CursoRepository;
import com.demodj.demo_examen.Models.Curso;
import com.demodj.demo_examen.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;

    @Autowired
    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public void addCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public Curso getCursoById(Long id) {
        Optional<Curso> curso = cursoRepository.findById(id);
        if (curso.isPresent()) {
            return curso.get();
        } else {
            throw new RuntimeException("Curso no encontrado con ID: " + id);
        }
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public void updateCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public void assignCursoToEstudiante(Long cursoId, Long estudianteId) {
        // Aquí puedes implementar la lógica para asignar un curso a un estudiante.
        // Este ejemplo asume que la relación entre curso y estudiante está configurada correctamente.
        // Podrías tener un método en el repositorio para hacer esto, o manejarlo en el servicio.

        // Ejemplo de implementación de la lógica para asignar un curso a un estudiante:
        Optional<Curso> curso = cursoRepository.findById(cursoId);
        if (curso.isPresent()) {
            // Encuentra el estudiante por ID y asigna el curso
            // Estudiante estudiante = estudianteService.getEstudianteById(estudianteId);
            // estudiante.addCurso(curso.get()); // Si tienes una relación bidireccional
            // estudianteRepository.save(estudiante);
        } else {
            throw new RuntimeException("Curso no encontrado con ID: " + cursoId);
        }
    }
}

*/
