/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalTime;

/**
 *
 * @author franc
 */
public class Estudiante extends Persona {
    
   String semestre;
   String programa;

    public Estudiante(String id) {
        super(id);
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public void salida(LocalTime horaSalida) {
        super.salida(horaSalida); 
    }

    @Override
    public void entrada(LocalTime horaEntrada) {
        super.entrada(horaEntrada); 
    }   
}
