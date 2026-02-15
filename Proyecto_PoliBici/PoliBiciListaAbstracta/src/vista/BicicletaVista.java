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

// Vista encargada de mostrar informacion
public class BicicletaVista {

    // Mostrar menu
    public void mostrarMenu() {
        System.out.println("\n=== POLIBICI - LISTA ABSTRACTA ===");
        System.out.println("1. Insertar bicicleta");
        System.out.println("2. Eliminar bicicleta por posicion");
        System.out.println("3. Obtener bicicleta por posicion");
        System.out.println("4. Buscar bicicleta por codigo");
        System.out.println("5. Mostrar cantidad de bicicletas");
        System.out.println("6. Mostrar todas las bicicletas");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    // Mostrar una bicicleta
    public void mostrarBicicleta(Bicicleta b) {
        System.out.println(
            "Codigo: " + b.getCodigo() +
            " | Marca: " + b.getMarca() +
            " | Tipo: " + b.getTipo() +
            " | Precio: $" + b.getPrecio()
        );
    }

    // Mostrar lista completa
    public void mostrarLista(List<Bicicleta> lista) {
        System.out.println("\n--- LISTA DE BICICLETAS ---");
        for (Bicicleta b : lista) {
            mostrarBicicleta(b);
        }
    }

    // Mostrar mensajes
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
