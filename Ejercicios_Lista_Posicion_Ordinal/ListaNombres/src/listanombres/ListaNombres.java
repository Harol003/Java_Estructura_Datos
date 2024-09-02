/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listanombres;

/**
 *
 * @author Harol
 */
import java.util.ArrayList; // Importa la clase ArrayList para manejar listas
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class ListaNombres {
    public static void main(String[] args) {
        System.out.println("Politecnico Internacional - Lista de Nombres"); // Muestra el titulo del programa

        ArrayList<String> nombres = new ArrayList<>();  // Crea una lista para almacenar nombres
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        // Solicita al usuario que ingrese 3 nombres
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": "); // Solicita al usuario que ingrese un nombre
            String nombre = scanner.nextLine(); // Lee el nombre ingresado por el usuario
            nombres.add(nombre);  // Agrega el nombre a la lista
        }

        // Muestra todos los nombres con su posicion ordinal
        System.out.println("\nNombres ingresados:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i));  // Muestra cada nombre con su posicion
        }
    }
}
