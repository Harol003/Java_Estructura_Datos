/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimatriz4x4;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

// Clase principal del programa
public class Polimatriz4x4 {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos del teclado
        Scanner teclado = new Scanner(System.in);

        // Declarar una matriz de 4 filas y 4 columnas
        int matriz[][] = new int[4][4];

        // Variable para guardar la suma total
        int sumaTotal = 0;

        System.out.println("PROGRAMA POLIMATRIZ 4x4");
        System.out.println("-----------------------");

        // Ciclo para recorrer las filas de la matriz
        for (int fila = 0; fila < 4; fila++) {

            // Ciclo para recorrer las columnas
            for (int columna = 0; columna < 4; columna++) {

                // Pedir al usuario el valor para cada posicion
                System.out.print("Ingrese valor para la posicion [" + fila + "][" + columna + "]: ");

                // Guardar el valor en la matriz
                matriz[fila][columna] = teclado.nextInt();

                // Sumar el valor a la suma total
                sumaTotal = sumaTotal + matriz[fila][columna];
            }
        }

        System.out.println("\nMatriz ingresada:");

        // Mostrar la matriz completa
        for (int fila = 0; fila < 4; fila++) {

            for (int columna = 0; columna < 4; columna++) {

                // Imprimir cada valor con tabulacion
                System.out.print(matriz[fila][columna] + "\t");
            }

            // Salto de linea al terminar cada fila
            System.out.println();
        }

        // Mostrar la suma total
        System.out.println("\nLa suma total de la matriz es: " + sumaTotal);

        // Cerrar scanner
        teclado.close();
    }
}