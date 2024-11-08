package com.demodj.demo_examen.Repository;

import com.demodj.demo_examen.Models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
