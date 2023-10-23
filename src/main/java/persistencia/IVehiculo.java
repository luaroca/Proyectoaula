/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public interface IVehiculo {
    
    public void ingresarVehiculo(Vehiculo r);
    public void eliminarVehiculo(String placa);
    public Vehiculo consultarVehiculo(String placa);
    public ArrayList<Vehiculo> informarVehiculo();
    
}
