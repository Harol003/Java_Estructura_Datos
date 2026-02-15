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
import modelo.Bicicleta;

// Vista por consola
public class VistaConsola {

    private Scanner sc = new Scanner(System.in);

    // Mostrar menu
    public int mostrarMenu() {
        System.out.println("\n--- POLIBICI APUNTADORES ---");
        System.out.println("1. Insertar bicicleta");
        System.out.println("2. Eliminar bicicleta por marca");
        System.out.println("3. Buscar bicicleta");
        System.out.println("4. Mostrar bicicletas");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        return sc.nextInt();
    }

    // Capturar bicicleta
    public Bicicleta capturarBicicleta() {
        sc.nextLine();
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        return new Bicicleta(marca, precio);
    }

    // Leer marca
    public String leerMarca() {
        sc.nextLine();
        System.out.print("Ingrese la marca: ");
        return sc.nextLine();
    }

    // Mostrar mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
