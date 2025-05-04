package com.example.proyecto.Estudiante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    
    @Autowired
    private EstudianteRepository repository;

    @PostMapping
  
    public ResponseEntity<Estudiante> crearEstudiante(@RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(repository.save(estudiante));
    }

    @GetMapping

    public List<Estudiante> obtenerTodos() {
        return repository.findAll();
    }

    @GetMapping("/{rut}")
    public ResponseEntity<Estudiante> obtenerPorRut(@PathVariable String rut) {
        return repository.findById(rut)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}