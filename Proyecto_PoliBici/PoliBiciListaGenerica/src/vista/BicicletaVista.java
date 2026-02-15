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

// Vista encargada solo de la presentacion
public class BicicletaVista {

    public void mostrarMenu() {
        System.out.println("\n=== POLIBICI - LISTA GENERICA ===");
        System.out.println("1. Insertar bicicleta");
        System.out.println("2. Eliminar bicicleta por posicion");
        System.out.println("3. Obtener bicicleta por posicion");
        System.out.println("4. Buscar bicicleta por codigo");
        System.out.println("5. Mostrar cantidad de bicicletas");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public void mostrarBicicleta(Bicicleta b) {
        System.out.println(
            "Codigo: " + b.getCodigo() +
            " | Marca: " + b.getMarca() +
            " | Tipo: " + b.getTipo() +
            " | Precio: $" + b.getPrecio()
        );
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
