package com.example.proyecto.Estudiante;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Estudiante {
    @Id
    private String rut;
    private String nombreCompleto;
    private int edad;
    private String curso;



    public String getCurso() {
        return curso;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getRut() {
        return rut;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }

    
}
