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

// Clase encargada de la interaccion con el usuario
public class VistaConsola {

    private Scanner sc = new Scanner(System.in);

    // Mostrar menu
    public int mostrarMenu() {
        System.out.println("\n--- TIENDA POLIBICI ---");
        System.out.println("1. Insertar bicicleta");
        System.out.println("2. Eliminar bicicleta");
        System.out.println("3. Obtener bicicleta por posicion");
        System.out.println("4. Buscar bicicleta por codigo");
        System.out.println("5. Mostrar cantidad de bicicletas");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
        return sc.nextInt();
    }

    // Capturar datos de bicicleta
    public Bicicleta capturarBicicleta() {
        System.out.print("Codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        return new Bicicleta(codigo, marca, precio);
    }

    // Leer codigo
    public int leerCodigo() {
        System.out.print("Ingrese el codigo: ");
        return sc.nextInt();
    }

    // Leer posicion
    public int leerPosicion() {
        System.out.print("Ingrese la posicion: ");
        return sc.nextInt();
    }

    // Mostrar mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
