/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;


import entidades.Zona;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public interface IZona {
    
    public void agregarZona(Zona z);
    public void eliminarZona(int bloque);
    public Zona actualizarZona(int bloque);
    public ArrayList<Zona> informarZona();
}
