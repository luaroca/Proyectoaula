
package entidades;

import java.time.LocalTime;

/**
 *
 * @author franc
 */
public class Empleado extends Persona {
    
    String cargo;


   
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    @Override
    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Override
    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    @Override
    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
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
