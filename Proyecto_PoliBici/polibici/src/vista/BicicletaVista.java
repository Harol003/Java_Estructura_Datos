/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Harol
 */

import modelo.Bicicleta;
import java.util.List;

// Clase vista
// Se encarga unicamente de mostrar informacion por consola
public class BicicletaVista {

    // Mostrar menu principal
    public void mostrarMenu() {
        System.out.println("=== TIENDA POLIBICI ===");
        System.out.println("1. Registrar bicicleta");
        System.out.println("2. Mostrar bicicletas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    // Mostrar lista de bicicletas
    public void mostrarBicicletas(List<Bicicleta> bicicletas) {
        System.out.println("\n--- LISTA DE BICICLETAS ---");
        for (Bicicleta b : bicicletas) {
            System.out.println(
                "Codigo: " + b.getCodigo() +
                " | Marca: " + b.getMarca() +
                " | Tipo: " + b.getTipo() +
                " | Precio: $" + b.getPrecio()
            );
        }
    }

    // Mostrar mensajes generales
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
