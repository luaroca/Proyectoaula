/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.Registro;
import java.util.*;
import persistencia.*;

/**
 *
 * @author franc
 */
public class LogicaListaRegistro {
    
    private IRegistro data;

    public LogicaListaRegistro() {
        this.data = new ListaRegistro();
    }
    
    public void ingresarRegistro(Registro r) {
        this.data.agregarRegistro(r);
    }
    
    public void eliminarRegistro(String cedula) {
        this.data.eliminarRegistro(cedula);
    }
    
    public ArrayList<Registro> informarRegistro(){
        return this.data.informarRegistro();
    }
    
    public void actualizarRegistro(String cedula){
        this.data.actualizarRegistro(cedula);
    }
    
}
