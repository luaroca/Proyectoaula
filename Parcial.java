/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial;

/**
 *
 * @author LUIS MANUEL
 */
public class Parcial {

    public static void main(String[] args) {
        
      Estudiante pi = new Estudiante();
        
        pi.setNota1(2.0);
        pi.setNota2(4.0);        
        pi.setNota3(2.0);     
        
        System.out.println("Su definitiva es: " +pi.calcularDefinitiva());
        
    }

   
   }
