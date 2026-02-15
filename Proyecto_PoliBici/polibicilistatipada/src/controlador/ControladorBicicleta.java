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

// Clase que controla la logica del sistema
public class ControladorBicicleta {

    private ListaBicicletas modelo;
    private VistaConsola vista;

    // Constructor
    public ControladorBicicleta() {
        modelo = new ListaBicicletas();
        vista = new VistaConsola();
    }

    // Metodo que ejecuta el programa
    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    modelo.insertar(vista.capturarBicicleta());
                    vista.mostrarMensaje("Bicicleta registrada correctamente");
                    break;

                case 2:
                    if (modelo.eliminar(vista.leerCodigo())) {
                        vista.mostrarMensaje("Bicicleta eliminada");
                    } else {
                        vista.mostrarMensaje("Bicicleta no encontrada");
                    }
                    break;

                case 3:
                    Bicicleta b = modelo.obtener(vista.leerPosicion());
                    if (b != null) {
                        vista.mostrarMensaje(b.toString());
                    } else {
                        vista.mostrarMensaje("Posicion invalida");
                    }
                    break;

                case 4:
                    Bicicleta buscada = modelo.buscar(vista.leerCodigo());
                    if (buscada != null) {
                        vista.mostrarMensaje(buscada.toString());
                    } else {
                        vista.mostrarMensaje("Bicicleta no encontrada");
                    }
                    break;

                case 5:
                    vista.mostrarMensaje("Total bicicletas: " + modelo.longitud());
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
