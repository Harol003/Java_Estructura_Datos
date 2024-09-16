/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaunidimensional;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class TiendaUnidimensional {
    public static void main(String[] args) {
        // Politécnico Internacional
        // Este programa usa un arreglo unidimensional para gestionar productos.

        Scanner scanner = new Scanner(System.in);

        // Mostrar encabezado
        System.out.println("Tienda Electronica Politecnico Internacional");

        // Solicitar el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        // Declarar un arreglo unidimensional para 5 productos
        String[] productos = new String[5];

        // Bucle para ingresar productos
        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i] = scanner.nextLine();
        }

        // Mostrar productos
        System.out.println("Productos en la tienda:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }

        // Mensaje de despedida
        System.out.println("Gracias por utilizar este software.");

        scanner.close();
    }
}
