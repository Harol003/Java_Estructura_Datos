/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listanumeros;

/**
 *
 * @author Harol
 */
import java.util.ArrayList; // Importa la clase ArrayList para manejar listas
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class ListaNumeros {
    public static void main(String[] args) {
        System.out.println("Politecnico Internacional - Consulta de Numeros"); // Muestra el titulo del programa

        ArrayList<Integer> numeros = new ArrayList<>();  // Crea una lista para almacenar numeros
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        // Solicita al usuario que ingrese 5 numeros
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": "); // Solicita al usuario que ingrese un numero
            int numero = scanner.nextInt(); // Lee el numero ingresado por el usuario
            numeros.add(numero);  // Agrega el numero a la lista
        }

        // Solicita al usuario que consulte un numero en una posicion especifica
        System.out.print("Ingrese la posicion del numero a consultar (1-5): "); // Solicita la posicion del numero a consultar
        int posicion = scanner.nextInt(); // Lee la posicion ingresada por el usuario

        // Muestra el numero en la posicion especificada
        if (posicion >= 1 && posicion <= numeros.size()) {
            System.out.println("Numero en la posicion " + posicion + ": " + numeros.get(posicion - 1)); // Muestra el numero en la posicion
        } else {
            System.out.println("Posicion no valida."); // Muestra un mensaje de error si la posicion es invalida
        }
    }
}
