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

public class BusquedaVista {

    private Scanner leer = new Scanner(System.in);

    // Metodo para pedir el arreglo
    public int[] pedirDatos() {

        System.out.print("Ingrese la cantidad de bicicletas: ");
        int n = leer.nextInt();

        int[] datos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el codigo de la bicicleta " + (i + 1) + ": ");
            datos[i] = leer.nextInt();
        }
        return datos;
    }

    // Metodo para pedir el valor a buscar
    public int pedirValor() {
        System.out.print("Ingrese el codigo a buscar: ");
        return leer.nextInt();
    }

    // Mostrar resultado
    public void mostrarResultado(int posicion) {

        if (posicion != -1) {
            System.out.println("Bicicleta encontrada en la posicion: " + posicion);
        } else {
            System.out.println("Bicicleta no encontrada");
        }
    }

    // Menu
    public int menu() {

        System.out.println("MENU DE BUSQUEDA");
        System.out.println("1. Busqueda secuencial");
        System.out.println("2. Busqueda binaria");
        System.out.print("Seleccione una opcion: ");

        return leer.nextInt();
    }
}
