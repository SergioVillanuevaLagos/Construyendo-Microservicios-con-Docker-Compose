package com.example.proyecto.Evaluacion;


import com.example.proyecto.Estudiante.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluaciones")
public class EvaluacionController {
    
    @Autowired
    private EvaluacionRepository evaluacionRepo;
    
    @Autowired
    private EstudianteRepository estudianteRepo;

    @PostMapping
    public ResponseEntity<?> crearEvaluacion(@RequestBody Evaluacion evaluacion) {

        if(evaluacion.getEvaluacion() < 1 || evaluacion.getEvaluacion() > 7) {
            return ResponseEntity.badRequest().body("La nota debe estar entre 1 y 7");
        }else{

        if (!estudianteRepo.existsById(evaluacion.getRutEstudiante())) {
            return ResponseEntity.badRequest().body("El estudiante no existe");
        }
       }
        return ResponseEntity.ok(evaluacionRepo.save(evaluacion));
    }

    @GetMapping
    public List<Evaluacion> obtenerTodas() {
        return evaluacionRepo.findAll();
    }

    @GetMapping("/{rut}")
    public ResponseEntity<Estudiante> obtenerPorRut(@PathVariable String rut) {
        return estudianteRepo.findById(rut)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}