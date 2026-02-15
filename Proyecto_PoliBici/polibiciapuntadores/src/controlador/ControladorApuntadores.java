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

// Controlador del sistema
public class ControladorApuntadores {

    private ListaEnlazadaBicicletas lista;
    private VistaConsola vista;

    // Constructor
    public ControladorApuntadores() {
        lista = new ListaEnlazadaBicicletas();
        vista = new VistaConsola();
    }

    // Iniciar programa
    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    lista.insertar(vista.capturarBicicleta());
                    vista.mostrarMensaje("Bicicleta insertada usando apuntadores");
                    break;

                case 2:
                    if (lista.eliminar(vista.leerMarca())) {
                        vista.mostrarMensaje("Bicicleta eliminada");
                    } else {
                        vista.mostrarMensaje("Bicicleta no encontrada");
                    }
                    break;

                case 3:
                    Bicicleta b = lista.buscar(vista.leerMarca());
                    if (b != null) {
                        vista.mostrarMensaje(b.toString());
                    } else {
                        vista.mostrarMensaje("Bicicleta no encontrada");
                    }
                    break;

                case 4:
                    lista.mostrar();
                    break;

                case 5:
                    vista.mostrarMensaje("Fin del programa PoliBiciApuntadores");
                    break;

                default:
                    vista.mostrarMensaje("Opcion invalida");
            }

        } while (opcion != 5);
    }
}

