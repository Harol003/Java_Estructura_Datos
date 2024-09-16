/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendadeobjetos;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class TiendaDeObjetos {
    public static void main(String[] args) {
        // Politécnico Internacional
        // Este programa usa un arreglo de objetos para gestionar productos con detalles.

        Scanner scanner = new Scanner(System.in);

        // Mostrar encabezado
        System.out.println("Tienda Electronica Politecnico Internacional");

        // Solicitar el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        // Crear una clase Producto para gestionar datos
        class Producto {
            String nombre;
            String precio;

            Producto(String nombre, String precio) {
                this.nombre = nombre;
                this.precio = precio;
            }
        }

        // Declarar un arreglo de objetos Producto para 5 productos
        Producto[] productos = new Producto[5];

        // Bucle para ingresar productos y precios
        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            String precio = scanner.nextLine();
            productos[i] = new Producto(nombre, precio);
        }

        // Mostrar productos y precios
        System.out.println("Productos en la tienda:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i].nombre + ", Precio: " + productos[i].precio);
        }

        // Mensaje de despedida
        System.out.println("Gracias por utilizar este software.");

        scanner.close();
    }
}
