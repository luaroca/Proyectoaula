/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.Zona;
import java.util.*;
import persistencia.IZona;
import persistencia.ListaZona;

/**
 *
 * @author franc
 */
public class LogicaZona {
    
    private IZona data;
    
    //Contructor
    public LogicaZona(IZona data) {
        this.data = new ListaZona();
    }
    
    //Methods
    public void agregarZona(Zona z) {
        this.data.agregarZona(z);
    }
    
    public void eliminarZona(int bloque) {
        this.data.eliminarZona(bloque);
    }
    
    public Zona consultarRegistro(int bloque){
        Zona z = this.data.consultarZona(bloque);
        return z;
    }
    
    public ArrayList<Zona> informarRegistro(){
        return this.data.informarZona();
    }
    
    
}
