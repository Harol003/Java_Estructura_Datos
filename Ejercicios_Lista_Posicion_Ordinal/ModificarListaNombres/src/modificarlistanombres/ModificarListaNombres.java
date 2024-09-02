/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modificarlistanombres;

/**
 *
 * @author Harol
 */
import java.util.ArrayList; // Importa la clase ArrayList para manejar listas
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class ModificarListaNombres {
    public static void main(String[] args) {
        System.out.println("Politecnico Internacional - Modificacion de Nombres"); // Muestra el titulo del programa

        ArrayList<String> nombres = new ArrayList<>();  // Crea una lista para almacenar nombres
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        // Solicita al usuario que ingrese 4 nombres
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": "); // Solicita al usuario que ingrese un nombre
            String nombre = scanner.nextLine(); // Lee el nombre ingresado por el usuario
            nombres.add(nombre);  // Agrega el nombre a la lista
        }

        // Solicita al usuario que modifique un nombre en una posicion especifica
        System.out.print("Ingrese la posicion del nombre a modificar (1-4): "); // Solicita la posicion del nombre a modificar
        int posicion = scanner.nextInt(); // Lee la posicion ingresada por el usuario
        scanner.nextLine();  // Consume el salto de linea

        // Verifica si la posicion es valida
        if (posicion >= 1 && posicion <= nombres.size()) {
            System.out.print("Ingrese el nuevo nombre: "); // Solicita el nuevo nombre
            String nuevoNombre = scanner.nextLine(); // Lee el nuevo nombre ingresado por el usuario
            nombres.set(posicion - 1, nuevoNombre);  // Modifica el nombre en la lista
            System.out.println("Nombre modificado."); // Muestra un mensaje de confirmacion
        } else {
            System.out.println("Posicion no valida."); // Muestra un mensaje de error si la posicion es invalida
        }

        // Muestra todos los nombres con su posicion ordinal
        System.out.println("\nNombres actuales:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i));  // Muestra cada nombre con su posicion
        }
    }
}

