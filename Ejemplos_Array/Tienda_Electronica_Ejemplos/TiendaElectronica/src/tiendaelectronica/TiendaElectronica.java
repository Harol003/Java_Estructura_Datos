/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaelectronica;

import java.util.Scanner;

public class TiendaElectronica {
    public static void main(String[] args) {
        // Crear el objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Imprimir encabezado
        System.out.println("Tienda de Electronica Politecnico Internacional");

        // Solicitar el nombre del usuario
        System.out.print("Por favor, ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        // Crear un array para almacenar los productos (maximo 3 productos)
        String[] productos = new String[3];

        // Variable para almacenar la opcion del menu
        int opcion;

        // Bucle principal del programa
        do {
            // Mostrar el menu de opciones
            System.out.println("\nBienvenido " + nombreUsuario + ", elija una opcion:");
            System.out.println("1. Agregar productos");
            System.out.println("2. Consultar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Modificar producto");
            System.out.println("5. Salir");

            // Leer la opcion del usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de linea

            switch (opcion) {
                case 1: // Agregar productos
                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i] == null) { // Verificar si el espacio en el array esta vacio
                            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
                            productos[i] = scanner.nextLine();
                        } else {
                            System.out.println("El producto " + (i + 1) + " ya esta lleno: " + productos[i]);
                        }
                    }
                    break;

                case 2: // Consultar productos
                    System.out.println("Productos en la tienda:");
                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i] != null) { // Mostrar solo los productos que no sean nulos
                            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
                        } else {
                            System.out.println("Producto " + (i + 1) + ": [vacio]");
                        }
                    }
                    break;

                case 3: // Eliminar producto
                    System.out.print("Ingrese el numero del producto a eliminar (1-3): ");
                    int eliminar = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de linea
                    if (eliminar >= 1 && eliminar <= 3 && productos[eliminar - 1] != null) {
                        productos[eliminar - 1] = null; // Eliminar el producto
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("Numero de producto invalido o ya vacio.");
                    }
                    break;

                case 4: // Modificar producto
                    System.out.print("Ingrese el numero del producto a modificar (1-3): ");
                    int modificar = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de linea
                    if (modificar >= 1 && modificar <= 3 && productos[modificar - 1] != null) {
                        System.out.print("Ingrese el nuevo nombre del producto " + modificar + ": ");
                        productos[modificar - 1] = scanner.nextLine(); // Modificar el producto
                        System.out.println("Producto modificado.");
                    } else {
                        System.out.println("Numero de producto invalido o vacio.");
                    }
                    break;

                case 5: // Salir
                    System.out.println("Gracias por usar este software, " + nombreUsuario + ".");
                    break;

                default:
                    System.out.println("Opcion invalida, por favor intente de nuevo.");
                    break;
            }
        } while (opcion != 5); // Repetir el menu hasta que el usuario elija salir

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
