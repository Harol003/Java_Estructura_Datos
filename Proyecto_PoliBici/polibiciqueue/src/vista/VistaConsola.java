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
        System.out.println("\n--- POLIBICI QUEUE (FIFO) ---");
        System.out.println("1. Enqueue (insertar bicicleta)");
        System.out.println("2. Dequeue (retirar bicicleta)");
        System.out.println("3. Peek (ver frente)");
        System.out.println("4. Mostrar cola");
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

    // Mostrar mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

