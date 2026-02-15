/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Harol
 */


import modelo.*;
import vista.*;

// Controlador de la pila LIFO
public class ControladorLIFO {

    private PilaEnlazadaBicicletas pila;
    private VistaConsola vista;

    // Constructor
    public ControladorLIFO() {
        pila = new PilaEnlazadaBicicletas();
        vista = new VistaConsola();
    }

    // Iniciar programa
    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    pila.push(vista.capturarBicicleta());
                    vista.mostrarMensaje("Bicicleta insertada en el tope (LIFO)");
                    break;

                case 2:
                    Bicicleta retirada = pila.pop();
                    if (retirada != null) {
                        vista.mostrarMensaje("Bicicleta retirada: " + retirada);
                    } else {
                        vista.mostrarMensaje("La pila esta vacia");
                    }
                    break;

                case 3:
                    Bicicleta tope = pila.peek();
                    if (tope != null) {
                        vista.mostrarMensaje("Bicicleta en el tope: " + tope);
                    } else {
                        vista.mostrarMensaje("La pila esta vacia");
                    }
                    break;

                case 4:
                    pila.mostrar();
                    break;

                case 5:
                    vista.mostrarMensaje("Fin del programa PoliBiciLIFO");
                    break;

                default:
                    vista.mostrarMensaje("Opcion invalida");
            }

        } while (opcion != 5);
    }
}

