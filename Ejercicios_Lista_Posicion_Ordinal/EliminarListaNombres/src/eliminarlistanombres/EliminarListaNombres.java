/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eliminarlistanombres;

/**
 *
 * @author Harol
 */
import java.util.ArrayList; // Importa la clase ArrayList para manejar listas
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class EliminarListaNombres {
    public static void main(String[] args) {
        System.out.println("Politecnico Internacional - Eliminacion de Nombres"); // Muestra el titulo del programa

        ArrayList<String> nombres = new ArrayList<>();  // Crea una lista para almacenar nombres
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        // Solicita al usuario que ingrese 5 nombres
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": "); // Solicita al usuario que ingrese un nombre
            String nombre = scanner.nextLine(); // Lee el nombre ingresado por el usuario
            nombres.add(nombre);  // Agrega el nombre a la lista
        }

        // Solicita al usuario que elimine un nombre en una posicion especifica
        System.out.print("Ingrese la posicion del nombre a eliminar (1-5): "); // Solicita la posicion del nombre a eliminar
        int posicion = scanner.nextInt(); // Lee la posicion ingresada por el usuario

        // Verifica si la posicion es valida
        if (posicion >= 1 && posicion <= nombres.size()) {
            nombres.remove(posicion - 1);  // Elimina el nombre de la lista
            System.out.println("Nombre eliminado."); // Muestra un mensaje de confirmacion
        } else {
            System.out.println("Posicion no valida."); // Muestra un mensaje de error si la posicion es invalida
        }

        // Muestra todos los nombres restantes con su posicion ordinal
        System.out.println("\nNombres actuales:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i));  // Muestra cada nombre con su posicion
        }
    }
}
