/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Zona {
        
    int bloque;
    int capacidad;

    public Zona(int bloque, int capacidad) {
        this.bloque = bloque;
        this.capacidad = capacidad;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void ingresarZona(int bloque, int puesto,boolean disponible){
        
    }
    
    public void eliminarZona(int bloque){
        
        
    }
    
    public void consultarZona(int bloque){
        
    }
    
        public ArrayList<String> informarZona() {
        ArrayList<String> zonas = null;
        return zonas;
    }
    
}

