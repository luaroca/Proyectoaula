/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.Persona;
import java.util.ArrayList;
import persistencia.IPersona;
import persistencia.ListaPersona;

/**
 *
 * @author franc
 */
public class LogicaPersona {
    
    private IPersona data;
    
    //Constructor
    public LogicaPersona(IPersona data) {
        this.data = new ListaPersona();
    }
    
    
    //Methods
    public void agregarPersona(Persona p){
        this.data.agregarPersona(p);
    }
    
    public void eliminarPersona(String cedula) {
        this.data.eliminarPersona(cedula);
    }
    
    public Persona consultarPersona(String cedula) {
        Persona p = this.data.consultarPersona(cedula);
        return p;
    }
    
    public ArrayList<Persona> informarPersona(){
        return this.data.informarPersona();
    }
}