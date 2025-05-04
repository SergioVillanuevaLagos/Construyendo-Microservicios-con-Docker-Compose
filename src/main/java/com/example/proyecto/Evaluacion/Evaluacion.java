package com.example.proyecto.Evaluacion;


import jakarta.persistence.*;


@Entity
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String rutEstudiante;
    private String semestre;
    private String asignatura;
    private double evaluacion;


    public Long getId() {
         return id; 
        }

    public String getRutEstudiante() {
         return rutEstudiante;
         }
         
    public String getSemestre() { 
        return semestre;
     }

    public String getAsignatura() {
         return asignatura;
         }

    public double getEvaluacion() { 
         return evaluacion; 
        }
    
    public void setRutEstudiante(String rutEstudiante) {
         this.rutEstudiante = rutEstudiante; 
        }

    public void setSemestre(String semestre) { 
        this.semestre = semestre;
     }

    public void setAsignatura(String asignatura) { 
        this.asignatura = asignatura;
     }


    public void setEvaluacion(double evaluacion) {
         this.evaluacion = evaluacion;
         }
         
}