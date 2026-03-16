/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polibiciarray1d;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class PoliBiciArray1D {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Sistema de inventario de precios - POLIBICI");

        // Pedir cantidad de bicicletas
        System.out.print("Cuantas bicicletas desea registrar?: ");
        int cantidad = teclado.nextInt();

        // Crear array
        double precios[] = new double[cantidad];

        // Ingreso de datos
        for(int i = 0; i < precios.length; i++){

            System.out.print("Ingrese el precio de la bicicleta " + (i+1) + ": ");
            precios[i] = teclado.nextDouble();

        }

        // Mostrar datos
        System.out.println("\nInventario de precios:");

        double suma = 0;

        for(int i = 0; i < precios.length; i++){

            System.out.println("Bicicleta " + (i+1) + " precio: $" + precios[i]);
            suma = suma + precios[i];

        }

        // Mostrar total
        System.out.println("\nValor total del inventario: $" + suma);

        System.out.println("Gracias por usar PoliBiciArray1D");

    }
}