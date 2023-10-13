
package Main;


import java.time.*;

public class Parqueo {
    

    String placa;
    String documento;
    LocalTime horaEntrada;
    LocalTime horaSalida;
    boolean carnet;

    public Parqueo(String placa, String documento, LocalTime horaEntrada, LocalTime horaSalida, boolean carnet) {
        this.placa = placa;
        this.documento = documento;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.carnet = carnet;
    }
    
    
  public String getplaca(){
      return placa;
  }
    

  public String getdocumento(){
      return documento;
  }
    

  public LocalTime gethoraEntrada(){
      return horaEntrada;
  }    

  public LocalTime gethoraSalida(){
      return horaSalida;
  }  
  
  public boolean getcarnet(){
      return carnet;
  }
  
 public void setPlaca(String placa){
     this.placa=placa;
 }
    
 public void setdocumento(String documento){
     this.documento=documento;
 }
 
    
 public void sethoraEntrada(LocalTime horaEntrada){
     this.horaEntrada=horaEntrada;
 }
    
 public void sethoraSalida(LocalTime horaSalida){
     this.horaSalida=horaSalida;
 }    
    
  public void setcarnet(boolean carnet){
     this.carnet=carnet;
 }   
    
  public validarCarnet (){
      
  }
    
  public ingresarVehiculo(){
      
  }  
  
  public retirarVehiculo(){
      
      
  }
  
  public informeParqueo(){
      
  }
  
  
}
