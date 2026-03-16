/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimatriz2x2;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

// Clase principal del programa
public class Polimatriz2x2 {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos del teclado
        Scanner teclado = new Scanner(System.in);

        // Declarar una matriz de 2 filas y 2 columnas
        int matriz[][] = new int[2][2];

        // Variable para guardar la suma total de los valores
        int sumaTotal = 0;

        System.out.println("PROGRAMA POLIMATRIZ 2x2");
        System.out.println("----------------------");

        // Ciclo para recorrer las filas de la matriz
        for (int fila = 0; fila < 2; fila++) {

            // Ciclo para recorrer las columnas de la matriz
            for (int columna = 0; columna < 2; columna++) {

                // Pedir al usuario el valor para cada posicion de la matriz
                System.out.print("Ingrese valor para la posicion [" + fila + "][" + columna + "]: ");

                // Guardar el valor ingresado en la matriz
                matriz[fila][columna] = teclado.nextInt();

                // Sumar el valor a la suma total
                sumaTotal = sumaTotal + matriz[fila][columna];
            }
        }

        System.out.println("\nMatriz ingresada:");

        // Mostrar la matriz en pantalla
        for (int fila = 0; fila < 2; fila++) {

            for (int columna = 0; columna < 2; columna++) {

                // Imprimir cada valor con espacio
                System.out.print(matriz[fila][columna] + " ");
            }

            // Salto de linea al terminar cada fila
            System.out.println();
        }

        // Mostrar la suma total de los valores
        System.out.println("\nLa suma total de la matriz es: " + sumaTotal);

        // Cerrar Scanner
        teclado.close();
    }
}