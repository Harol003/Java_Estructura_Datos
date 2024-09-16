/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendabidimensional;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class TiendaBidimensional {
    public static void main(String[] args) {
        // Politécnico Internacional
        // Este programa usa un arreglo bidimensional para gestionar productos y precios.

        Scanner scanner = new Scanner(System.in);

        // Mostrar encabezado
        System.out.println("Tienda Electronica Politecnico Internacional");

        // Solicitar el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        // Declarar un arreglo bidimensional para 5 productos con sus precios
        String[][] productos = new String[5][2]; // [][0] para nombre, [][1] para precio

        // Bucle para ingresar productos y precios
        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i][0] = scanner.nextLine();
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            productos[i][1] = scanner.nextLine();
        }

        // Mostrar productos y precios
        System.out.println("Productos en la tienda:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i][0] + ", Precio: " + productos[i][1]);
        }

        // Mensaje de despedida
        System.out.println("Gracias por utilizar este software.");

        scanner.close();
    }
}
