/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author LUIS MANUEL
 */
public class Vehiculo {
    
    String tipo;
    String placa;
    String documento;
    
    
    
    public class Vehiculo (){
        
    }

    public Vehiculo(String tipo, String placa, String documento) {
        this.tipo = tipo;
        this.placa = placa;
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getDocumento() {
        return documento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
    
    
    
    
}
