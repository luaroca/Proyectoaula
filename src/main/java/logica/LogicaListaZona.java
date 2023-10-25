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
public class LogicaListaZona {
    
    private IZona data;
    
    //Contructor
    public LogicaListaZona() {
        this.data = new ListaZona();
    }
    
    //Methods
    public void agregarZona(Zona z) {
        this.data.agregarZona(z);
    }
    
    public void eliminarZona(int bloque) {
        this.data.eliminarZona(bloque);
    }
    
    public void actualizarRegistro(int bloque){
        this.data.actualizarZona(bloque);
    }
    
    public ArrayList<Zona> informarRegistro(){
        return this.data.informarZona();
    }
    
    
}
