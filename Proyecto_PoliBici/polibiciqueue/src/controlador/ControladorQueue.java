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

// Controlador de la cola FIFO
public class ControladorQueue {

    private ColaEnlazadaBicicletas cola;
    private VistaConsola vista;

    // Constructor
    public ControladorQueue() {
        cola = new ColaEnlazadaBicicletas();
        vista = new VistaConsola();
    }

    // Iniciar programa
    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    cola.enqueue(vista.capturarBicicleta());
                    vista.mostrarMensaje("Bicicleta agregada al final de la cola");
                    break;

                case 2:
                    Bicicleta retirada = cola.dequeue();
                    if (retirada != null) {
                        vista.mostrarMensaje("Bicicleta retirada del frente: " + retirada);
                    } else {
                        vista.mostrarMensaje("La cola esta vacia");
                    }
                    break;

                case 3:
                    Bicicleta frente = cola.peek();
                    if (frente != null) {
                        vista.mostrarMensaje("Bicicleta en el frente: " + frente);
                    } else {
                        vista.mostrarMensaje("La cola esta vacia");
                    }
                    break;

                case 4:
                    cola.mostrar();
                    break;

                case 5:
                    vista.mostrarMensaje("Fin del programa PoliBiciQueue");
                    break;

                default:
                    vista.mostrarMensaje("Opcion invalida");
            }

        } while (opcion != 5);
    }
}

