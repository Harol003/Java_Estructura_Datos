/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliarray3dimensiones;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

// Clase principal del programa
public class PoliArray3Dimensiones {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos
        Scanner teclado = new Scanner(System.in);

        // Declarar array de tres dimensiones
        int arreglo[][][] = new int[2][2][2];

        // Variable para la suma total
        int sumaTotal = 0;

        System.out.println("PROGRAMA POLIARRAY TRES DIMENSIONES");
        System.out.println("-----------------------------------");

        // Recorrer la primera dimension (capas)
        for (int capa = 0; capa < arreglo.length; capa++) {

            // Recorrer filas
            for (int fila = 0; fila < arreglo[capa].length; fila++) {

                // Recorrer columnas
                for (int columna = 0; columna < arreglo[capa][fila].length; columna++) {

                    // Pedir valor al usuario
                    System.out.print("Ingrese valor para [" + capa + "][" + fila + "][" + columna + "]: ");

                    // Guardar valor
                    arreglo[capa][fila][columna] = teclado.nextInt();

                    // Sumar valor
                    sumaTotal = sumaTotal + arreglo[capa][fila][columna];
                }
            }
        }

        System.out.println("\nValores almacenados:");

        // Mostrar los valores del arreglo
        for (int capa = 0; capa < arreglo.length; capa++) {

            System.out.println("\nCapa " + capa + ":");

            for (int fila = 0; fila < arreglo[capa].length; fila++) {

                for (int columna = 0; columna < arreglo[capa][fila].length; columna++) {

                    System.out.print(arreglo[capa][fila][columna] + "\t");
                }

                System.out.println();
            }
        }

        // Mostrar suma total
        System.out.println("\nLa suma total es: " + sumaTotal);

        // Cerrar scanner
        teclado.close();
    }
}