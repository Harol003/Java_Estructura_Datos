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

// Clase que maneja la interaccion con el usuario
public class VistaConsola {

    private Scanner sc = new Scanner(System.in);

    // Mostrar menu
    public int mostrarMenu() {
        System.out.println("\n--- POLIBICI LISTA POSICION ORDINAL ---");
        System.out.println("1. Insertar bicicleta");
        System.out.println("2. Eliminar bicicleta por posicion");
        System.out.println("3. Obtener bicicleta por posicion");
        System.out.println("4. Buscar bicicleta por marca");
        System.out.println("5. Mostrar longitud");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
        return sc.nextInt();
    }

    // Capturar datos de bicicleta
    public Bicicleta capturarBicicleta() {
        sc.nextLine();
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        return new Bicicleta(marca, precio);
    }

    // Leer posicion
    public int leerPosicion() {
        System.out.print("Ingrese la posicion: ");
        return sc.nextInt();
    }

    // Leer marca
    public String leerMarca() {
        sc.nextLine();
        System.out.print("Ingrese la marca a buscar: ");
        return sc.nextLine();
    }

    // Mostrar mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
