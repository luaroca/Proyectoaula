/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.Vehiculo;
import java.util.ArrayList;
import persistencia.IVehiculo;
import persistencia.ListaVehiculo;

/**
 *
 * @author franc
 */
public class LogicaListaVehiculo {
    
    private IVehiculo data;
    
    //constructor
    public LogicaListaVehiculo() {
        this.data = new ListaVehiculo();
    }
    
    //Methods
    public void ingresarVehiculo(Vehiculo v) {
        this.data.ingresarVehiculo(v);
    }
    
    public void eliminarVehiculo(String placa) {
        this.data.eliminarVehiculo(placa);
    }
    
    public void actualizarVehiculo(String placa) {
        this.data.actualizarVehiculo(placa);
    }
    
    public ArrayList<Vehiculo> informarVehiculo() {
        return this.data.informarVehiculo();
    }
}
