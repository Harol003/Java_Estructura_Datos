/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimatriz3x3;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

// Clase principal del programa
public class Polimatriz3x3 {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos del teclado
        Scanner teclado = new Scanner(System.in);

        // Declarar una matriz de 3 filas y 3 columnas
        int matriz[][] = new int[3][3];

        // Variable para guardar la suma total de la matriz
        int sumaTotal = 0;

        System.out.println("PROGRAMA POLIMATRIZ 3x3");
        System.out.println("-----------------------");

        // Ciclo para recorrer las filas
        for (int fila = 0; fila < 3; fila++) {

            // Ciclo para recorrer las columnas
            for (int columna = 0; columna < 3; columna++) {

                // Pedir al usuario un valor para cada posicion
                System.out.print("Ingrese valor para la posicion [" + fila + "][" + columna + "]: ");

                // Guardar el valor en la matriz
                matriz[fila][columna] = teclado.nextInt();

                // Acumular el valor en la suma total
                sumaTotal = sumaTotal + matriz[fila][columna];
            }
        }

        System.out.println("\nMatriz ingresada:");

        // Mostrar la matriz en pantalla
        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 3; columna++) {

                // Imprimir cada valor de la matriz
                System.out.print(matriz[fila][columna] + "\t");
            }

            // Salto de linea despues de cada fila
            System.out.println();
        }

        // Mostrar la suma total de todos los valores
        System.out.println("\nLa suma total de la matriz es: " + sumaTotal);

        // Cerrar Scanner
        teclado.close();
    }
}