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

// Controlador que maneja la pila
public class ControladorPila {

    private PilaBicicletas pila;
    private VistaConsola vista;

    // Constructor
    public ControladorPila() {
        pila = new PilaBicicletas(5); // Capacidad fija
        vista = new VistaConsola();
    }

    // Iniciar programa
    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    if (pila.push(vista.capturarBicicleta())) {
                        vista.mostrarMensaje("Bicicleta insertada en la pila");
                    } else {
                        vista.mostrarMensaje("La pila esta llena");
                    }
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
                    vista.mostrarMensaje("Cantidad de bicicletas en la pila: " + pila.tamanio());
                    break;

                case 5:
                    vista.mostrarMensaje("Fin del programa PoliBiciPush");
                    break;

                default:
                    vista.mostrarMensaje("Opcion invalida");
            }

        } while (opcion != 5);
    }
}
