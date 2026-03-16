/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimatricesrecorrido;

/**
 *
 * @author Harol
 */
public class PoliMatricesRecorrido {

    public static void main(String[] args) {

        // Mensaje de bienvenida
        System.out.println("Bienvenido al programa de ejemplo de matrices.");
        System.out.println("Veremos matrices de diferentes tamanos.");
        System.out.println("--------------------------------------------");

        // MATRIZ 1x1
        int matriz1[][] = {{5}};

        System.out.println("\nRecorriendo la matriz 1x1:");

        for(int fila = 0; fila < matriz1.length; fila++){

            for(int columna = 0; columna < matriz1[fila].length; columna++){

                System.out.println("Valor en [" + fila + "][" + columna + "] = " + matriz1[fila][columna]);
            }
        }

        // MATRIZ 2x2
        int matriz2[][] = {
                {1,2},
                {3,4}
        };

        System.out.println("\nRecorriendo la matriz 2x2:");

        for(int fila = 0; fila < matriz2.length; fila++){

            for(int columna = 0; columna < matriz2[fila].length; columna++){

                System.out.println("Valor en [" + fila + "][" + columna + "] = " + matriz2[fila][columna]);
            }
        }

        // MATRIZ 3x3
        int matriz3[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("\nRecorriendo la matriz 3x3:");

        for(int fila = 0; fila < matriz3.length; fila++){

            for(int columna = 0; columna < matriz3[fila].length; columna++){

                System.out.println("Valor en [" + fila + "][" + columna + "] = " + matriz3[fila][columna]);
            }
        }

        // Mensaje final
        System.out.println("\nEl recorrido de las matrices ha terminado.");
        System.out.println("Gracias por usar el programa PoliMatricesRecorrido.");
        System.out.println("Hasta pronto.");

    }
}