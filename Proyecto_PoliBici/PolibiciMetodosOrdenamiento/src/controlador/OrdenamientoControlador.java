/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Harol
 */


import modelo.OrdenamientoModelo;
import vista.OrdenamientoVista;

public class OrdenamientoControlador {

    private OrdenamientoModelo modelo;
    private OrdenamientoVista vista;

    public OrdenamientoControlador() {
        modelo = new OrdenamientoModelo();
        vista = new OrdenamientoVista();
    }

    // Metodo que controla el flujo del programa
    public void iniciar() {

        int[] datos = vista.pedirDatos();

        System.out.println("Antes de ordenar:");
        vista.mostrarDatos(datos);

        modelo.burbuja(datos);

        System.out.println("Despues de ordenar:");
        vista.mostrarDatos(datos);
    }
}

