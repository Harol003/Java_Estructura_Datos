/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polibiciventas3d;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class PoliBiciVentas3D {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Sistema de ventas POLIBICI");

        int sucursales = 2;
        int meses = 2;
        int tiposBici = 2;

        // Crear array tridimensional
        int ventas[][][] = new int[sucursales][meses][tiposBici];

        // Ingreso de datos
        for(int s = 0; s < sucursales; s++){

            System.out.println("\nSucursal " + (s+1));

            for(int m = 0; m < meses; m++){

                System.out.println("Mes " + (m+1));

                for(int t = 0; t < tiposBici; t++){

                    System.out.print("Ventas del tipo de bicicleta " + (t+1) + ": ");
                    ventas[s][m][t] = teclado.nextInt();

                }

            }

        }

        // Mostrar datos
        System.out.println("\nReporte de ventas:");

        for(int s = 0; s < sucursales; s++){

            System.out.println("\nSucursal " + (s+1));

            for(int m = 0; m < meses; m++){

                System.out.print("Mes " + (m+1) + ": ");

                for(int t = 0; t < tiposBici; t++){

                    System.out.print(ventas[s][m][t] + " ");

                }

                System.out.println();

            }

        }

        System.out.println("\nGracias por usar el sistema de ventas POLIBICI.");

    }
}