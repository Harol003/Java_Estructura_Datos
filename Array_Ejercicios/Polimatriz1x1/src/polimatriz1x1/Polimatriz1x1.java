/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimatriz1x1;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

// Clase principal del programa
public class Polimatriz1x1 {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos del teclado
        Scanner teclado = new Scanner(System.in);

        // Declarar matriz de 1 fila y 1 columna
        int matriz[][] = new int[1][1];

        // Variable para la suma
        int sumaTotal = 0;

        System.out.println("PROGRAMA POLIMATRIZ 1x1");
        System.out.println("-----------------------");

        // Recorrer la unica posicion de la matriz
        for (int fila = 0; fila < 1; fila++) {

            for (int columna = 0; columna < 1; columna++) {

                // Pedir valor al usuario
                System.out.print("Ingrese valor para la posicion [" + fila + "][" + columna + "]: ");

                // Guardar el valor en la matriz
                matriz[fila][columna] = teclado.nextInt();

                // Sumar el valor
                sumaTotal = sumaTotal + matriz[fila][columna];
            }
        }

        System.out.println("\nMatriz ingresada:");

        // Mostrar la matriz
        for (int fila = 0; fila < 1; fila++) {

            for (int columna = 0; columna < 1; columna++) {

                System.out.print(matriz[fila][columna]);
            }

            System.out.println();
        }

        // Mostrar suma
        System.out.println("\nLa suma total de la matriz es: " + sumaTotal);

        // Cerrar scanner
        teclado.close();
    }
}