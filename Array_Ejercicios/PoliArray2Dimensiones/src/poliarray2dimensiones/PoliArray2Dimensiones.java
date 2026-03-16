/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliarray2dimensiones;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

// Clase principal del programa
public class PoliArray2Dimensiones {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos del teclado
        Scanner teclado = new Scanner(System.in);

        // Declarar una matriz de 3 filas y 3 columnas
        int matriz[][] = new int[3][3];

        // Variable para almacenar la suma total
        int sumaTotal = 0;

        System.out.println("PROGRAMA POLIARRAY DOS DIMENSIONES");
        System.out.println("----------------------------------");

        // Ciclo para llenar la matriz
        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                // Pedir valor al usuario
                System.out.print("Ingrese valor para [" + fila + "][" + columna + "]: ");

                // Guardar valor en la matriz
                matriz[fila][columna] = teclado.nextInt();

                // Sumar el valor
                sumaTotal = sumaTotal + matriz[fila][columna];
            }
        }

        System.out.println("\nMatriz ingresada:");

        // Mostrar la matriz
        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print(matriz[fila][columna] + "\t");
            }

            System.out.println();
        }

        // Mostrar la suma total
        System.out.println("\nLa suma total de la matriz es: " + sumaTotal);

        // Cerrar Scanner
        teclado.close();
    }
}