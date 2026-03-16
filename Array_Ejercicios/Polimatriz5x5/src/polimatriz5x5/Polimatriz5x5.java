/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimatriz5x5;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

// Clase principal del programa
public class Polimatriz5x5 {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos del teclado
        Scanner teclado = new Scanner(System.in);

        // Declarar una matriz de 5 filas y 5 columnas
        int matriz[][] = new int[5][5];

        // Variable para guardar la suma total
        int sumaTotal = 0;

        System.out.println("PROGRAMA POLIMATRIZ 5x5");
        System.out.println("-----------------------");

        // Recorrer las filas de la matriz
        for (int fila = 0; fila < 5; fila++) {

            // Recorrer las columnas
            for (int columna = 0; columna < 5; columna++) {

                // Pedir valor al usuario
                System.out.print("Ingrese valor para la posicion [" + fila + "][" + columna + "]: ");

                // Guardar el valor en la matriz
                matriz[fila][columna] = teclado.nextInt();

                // Sumar el valor a la suma total
                sumaTotal = sumaTotal + matriz[fila][columna];
            }
        }

        System.out.println("\nMatriz ingresada:");

        // Mostrar la matriz en pantalla
        for (int fila = 0; fila < 5; fila++) {

            for (int columna = 0; columna < 5; columna++) {

                // Mostrar cada valor con tabulacion
                System.out.print(matriz[fila][columna] + "\t");
            }

            // Salto de linea al terminar cada fila
            System.out.println();
        }

        // Mostrar la suma total de la matriz
        System.out.println("\nLa suma total de la matriz es: " + sumaTotal);

        // Cerrar scanner
        teclado.close();
    }
}