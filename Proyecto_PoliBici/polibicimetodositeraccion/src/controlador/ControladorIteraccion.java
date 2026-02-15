/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Harol
 */


import modelo.ListaBicicletas;
import vista.VistaConsola;

// Controlador principal
public class ControladorIteraccion {

    private ListaBicicletas modelo;
    private VistaConsola vista;

    // Constructor
    public ControladorIteraccion() {
        modelo = new ListaBicicletas();
        vista = new VistaConsola();
    }

    // Iniciar programa
    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    modelo.recorrerConFor();
                    break;

                case 2:
                    modelo.recorrerConWhile();
                    break;

                case 3:
                    modelo.recorrerConDoWhile();
                    break;

                case 4:
                    modelo.recorrerConForEach();
                    break;

                case 5:
                    modelo.recorrerConIterator();
                    break;

                case 6:
                    vista.mostrarMensaje("Fin del programa PoliBici");
                    break;

                default:
                    vista.mostrarMensaje("Opcion invalida");
            }

        } while (opcion != 6);
    }
}
