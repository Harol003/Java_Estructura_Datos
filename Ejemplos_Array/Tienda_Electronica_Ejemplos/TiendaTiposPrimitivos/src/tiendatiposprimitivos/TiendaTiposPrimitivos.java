/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendatiposprimitivos;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class TiendaTiposPrimitivos {
    public static void main(String[] args) {
        // Politécnico Internacional
        // Este programa usa un arreglo de tipos primitivos para gestionar stock de productos.

        Scanner scanner = new Scanner(System.in);

        // Mostrar encabezado
        System.out.println("Tienda Electronica Politecnico Internacional");

        // Solicitar el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        // Declarar un arreglo de enteros para representar la cantidad en stock
        int[] stock = new int[5];

        // Bucle para ingresar la cantidad en stock
        for (int i = 0; i < stock.length; i++) {
            System.out.print("Ingrese la cantidad en stock del producto " + (i + 1) + ": ");
            stock[i] = scanner.nextInt();
        }

        // Mostrar cantidades en stock
        System.out.println("Cantidad en stock de productos:");
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + stock[i] + " unidades");
        }

        // Mensaje de despedida
        System.out.println("Gracias por utilizar este software.");

        scanner.close();
    }
}

