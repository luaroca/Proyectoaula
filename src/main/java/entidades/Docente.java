/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalTime;

/**
 *
 * @author LUIS MANUEL
 */
public class Docente extends Empleado {
    
    String facultad;

    public Docente(String facultad) {
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public void entrada(LocalTime horaEntrada) {
        super.entrada(horaEntrada); 
        
    }

    @Override
    public void salida(LocalTime horaSalida) {
        super.salida(horaSalida); 
    }
    
    
    
}
