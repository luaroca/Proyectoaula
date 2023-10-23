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
public class Operativo extends Empleado{

    public Operativo() {
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
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
