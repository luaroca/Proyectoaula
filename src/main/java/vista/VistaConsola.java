/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import logica.LogicaListaRegistro;


/**
 *
 * @author franc
 */
public class VistaConsola {
    
    private LogicaListaRegistro logica;

    public VistaConsola() {
        this.logica = new LogicaListaRegistro();
    }

    public void mostrarMenu() {
        System.out.println("");
        System.out.println("| ## SOFTWARE GESTION DE PARQUEOS ## |");
        System.out.println("--------------------------------------");
        System.out.println("1. Registrar parqueo");
        System.out.println("2. Eliminar parqueo");
        System.out.println("3. Informe parqueo");
        System.out.println("4. Actualizar parqueo");
        System.out.println("5. Salir\n");

    }

    public void ejecutarMenu() {
        int opcionSeleccionada;
        do {

            this.mostrarMenu();
            opcionSeleccionada = Entrada.leerInt("Seleccione una opcion");
            switch (opcionSeleccionada) {

                case 1:
                    this.agregarRegistro();
                    break;
                case 2:
                    this.eliminarRegistro();
                    break;
                case 3:
                    this.informarRegistro();
                    break;
                case 4:
                    this.actualizarRegistro();
                    break;
                case 5:
                    System.out.println("!! Aplicacion finalizada con exito ¡¡");
                    break;
                default:
                    System.out.println("!! Opcion no valida ¡¡\n");

            }

        } while (opcionSeleccionada != 5);

    }

    private void agregarRegistro() {
        

    }

    private void eliminarRegistro() {
        
    }

    
     private void informarRegistro() {
        
    }
     
    private void actualizarRegistro() {
        
    }
}