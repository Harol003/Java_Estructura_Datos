/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Harol
 */


import java.util.Scanner;

public class ArrayVista {

    private Scanner leer = new Scanner(System.in);

    // Mostrar menu
    public int menu() {

        System.out.println("MENU ARRAYS POLIBICI");
        System.out.println("1. Array 1 dimension");
        System.out.println("2. Array 2 dimensiones");
        System.out.println("3. Array 3 dimensiones");
        System.out.println("4. Array 4 dimensiones");
        System.out.print("Seleccione una opcion: ");

        return leer.nextInt();
    }

    // Mostrar array 1D
    public void mostrar1D(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    // Mostrar array 2D
    public void mostrar2D(int[][] datos) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Mostrar array 3D
    public void mostrar3D(int[][][] datos) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                for (int k = 0; k < datos[i][j].length; k++) {
                    System.out.print(datos[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("---");
        }
    }

    // Mostrar array 4D
    public void mostrar4D(int[][][][] datos) {
        for (int a = 0; a < datos.length; a++) {
            for (int b = 0; b < datos[a].length; b++) {
                for (int c = 0; c < datos[a][b].length; c++) {
                    for (int d = 0; d < datos[a][b][c].length; d++) {
                        System.out.print(datos[a][b][c][d] + " ");
                    }
                    System.out.println();
                }
                System.out.println("---");
            }
            System.out.println("======");
        }
    }
}
