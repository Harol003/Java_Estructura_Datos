/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliarray1dimension;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

// Clase principal del programa
public class PoliArray1Dimension {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos del teclado
        Scanner teclado = new Scanner(System.in);

        // Declarar un arreglo de una sola dimension con 5 posiciones
        int arreglo[] = new int[5];

        // Variable para almacenar la suma total
        int sumaTotal = 0;

        System.out.println("PROGRAMA POLIARRAY UNA DIMENSION");
        System.out.println("--------------------------------");

        // Ciclo para llenar el arreglo
        for (int i = 0; i < arreglo.length; i++) {

            // Pedir al usuario un valor
            System.out.print("Ingrese valor para la posicion [" + i + "]: ");

            // Guardar el valor en el arreglo
            arreglo[i] = teclado.nextInt();

            // Acumular el valor en la suma
            sumaTotal = sumaTotal + arreglo[i];
        }

        System.out.println("\nValores almacenados en el arreglo:");

        // Ciclo para mostrar los valores del arreglo
        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("Posicion [" + i + "] = " + arreglo[i]);
        }

        // Mostrar la suma total
        System.out.println("\nLa suma total del arreglo es: " + sumaTotal);

        // Cerrar Scanner
        teclado.close();
    }
}