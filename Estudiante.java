/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

/**
 *
 * @author LUIS MANUEL
 */
public class Estudiante {
    double nota1;
    double nota2;
    double nota3;
    double nf;

    public Estudiante() {
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }



    public double getNf() {
        return nf;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }



    public void setNf(double nf) {
        this.nf = nf;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }


    
    public double calcularDefinitiva(){
        nf=(nota1+nota2+nota3)/3;
        
        return nf;
    }
    
        
}
