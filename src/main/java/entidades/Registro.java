/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author franc
 */


/**
NI IDEA PERO IGUAL VA ASI?DWIDIJISJIJAIJSAIJDSJIASJISAJDIS
*/
public class Registro {
    
    LocalTime horaEntrada;
    LocalTime horaSalida;
    LocalDate Fecha;

    public Registro(LocalTime horaEntrada, LocalTime horaSalida, LocalDate Fecha) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.Fecha = Fecha;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    
    public void ingresarRegistro(){
        
        
    }
    
    public void eliminarRegistro(){
     this.horaEntrada = null;
     this.horaSalida = null;
     this.Fecha = null;        
    }
    
    public void consultarRegistro(){
 
    System.out.println("Fecha: " + this.Fecha);
    System.out.println("Hora de entrada: " + this.horaEntrada);
    System.out.println("Hora de salida: " + this.horaSalida);
    }
    
    public void informarRegistro(){
        
    }
    
    
}
