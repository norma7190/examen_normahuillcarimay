package com.demodj.demo_examen.service.Impl;

import com.demodj.demo_examen.Repository.EstudianteRepository;

import com.demodj.demo_examen.Models.Estudiante;

import com.demodj.demo_examen.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;


    @Autowired
    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;

    }

    @Override
    public List<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    @Override
    public void addEstudiante(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante getEstudianteById(Long id) {
        Optional<Estudiante>estudiante=estudianteRepository.findById(id);
        if (estudiante.isPresent()){
            return estudiante.get();
        }else{
            throw new RuntimeException("NO HAY ESTUDIANTE"+id);

    }




    }

    @Override
    public void deleteEstudiante(Long id) {
        estudianteRepository.deleteById(id);

    }

    @Override
    public void updateEstudiante(Estudiante estudiante) {
        estudianteRepository.save(estudiante);

    }
}