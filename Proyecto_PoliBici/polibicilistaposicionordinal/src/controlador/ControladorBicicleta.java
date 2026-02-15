/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Harol
 */


import modelo.Bicicleta;
import vista.VistaConsola;

// Controlador del sistema
public class ControladorBicicleta {

    // Arreglo como lista ordinal
    private Bicicleta[] bicicletas;
    private int contador;
    private VistaConsola vista;

    // Constructor
    public ControladorBicicleta() {
        bicicletas = new Bicicleta[10]; // Tamaño fijo
        contador = 0;
        vista = new VistaConsola();
    }

    // Iniciar programa
    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    if (contador < bicicletas.length) {
                        bicicletas[contador] = vista.capturarBicicleta();
                        vista.mostrarMensaje("Bicicleta registrada en la posicion " + contador);
                        contador++;
                    } else {
                        vista.mostrarMensaje("Lista llena");
                    }
                    break;

                case 2:
                    int posEliminar = vista.leerPosicion();
                    if (posEliminar >= 0 && posEliminar < contador) {
                        bicicletas[posEliminar] = null;
                        vista.mostrarMensaje("Bicicleta eliminada en la posicion " + posEliminar);
                    } else {
                        vista.mostrarMensaje("Posicion invalida");
                    }
                    break;

                case 3:
                    int posObtener = vista.leerPosicion();
                    if (posObtener >= 0 && posObtener < contador && bicicletas[posObtener] != null) {
                        vista.mostrarMensaje(bicicletas[posObtener].toString());
                    } else {
                        vista.mostrarMensaje("No existe bicicleta en esa posicion");
                    }
                    break;

                case 4:
                    String marca = vista.leerMarca();
                    boolean encontrada = false;

                    for (int i = 0; i < contador; i++) {
                        if (bicicletas[i] != null && bicicletas[i].getMarca().equalsIgnoreCase(marca)) {
                            vista.mostrarMensaje("Posicion " + i + " -> " + bicicletas[i]);
                            encontrada = true;
                        }
                    }

                    if (!encontrada) {
                        vista.mostrarMensaje("Marca no encontrada");
                    }
                    break;

                case 5:
                    vista.mostrarMensaje("Longitud logica de la lista: " + contador);
                    break;

                case 6:
                    vista.mostrarMensaje("Gracias por usar PoliBici");
                    break;

                default:
                    vista.mostrarMensaje("Opcion invalida");
            }

        } while (opcion != 6);
    }
}
