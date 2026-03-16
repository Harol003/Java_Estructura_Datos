/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasmatriz2d;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class NotasMatriz2D {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Sistema de registro de notas");

        int estudiantes = 3;
        int notas = 3;

        // Crear matriz
        double matrizNotas[][] = new double[estudiantes][notas];

        // Ingreso de notas
        for(int fila = 0; fila < estudiantes; fila++){

            System.out.println("\nEstudiante " + (fila+1));

            for(int columna = 0; columna < notas; columna++){

                System.out.print("Ingrese nota " + (columna+1) + ": ");
                matrizNotas[fila][columna] = teclado.nextDouble();

            }

        }

        // Mostrar matriz
        System.out.println("\nTabla de notas:");

        for(int fila = 0; fila < estudiantes; fila++){

            for(int columna = 0; columna < notas; columna++){

                System.out.print(matrizNotas[fila][columna] + "   ");

            }

            System.out.println();

        }

        System.out.println("\nFin del programa de notas.");

    }
}