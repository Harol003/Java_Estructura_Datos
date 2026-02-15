/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Harol
 */


import modelo.BusquedaModelo;
import vista.BusquedaVista;
import java.util.Arrays;

public class BusquedaControlador {

    private BusquedaModelo modelo;
    private BusquedaVista vista;

    public BusquedaControlador() {
        modelo = new BusquedaModelo();
        vista = new BusquedaVista();
    }

    public void iniciar() {

        int[] datos = vista.pedirDatos();
        int opcion = vista.menu();
        int valor = vista.pedirValor();
        int posicion;

        switch (opcion) {

            case 1:
                posicion = modelo.busquedaSecuencial(datos, valor);
                vista.mostrarResultado(posicion);
                break;

            case 2:
                // Ordenar antes de busqueda binaria
                Arrays.sort(datos);
                posicion = modelo.busquedaBinaria(datos, valor);
                vista.mostrarResultado(posicion);
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }
}
