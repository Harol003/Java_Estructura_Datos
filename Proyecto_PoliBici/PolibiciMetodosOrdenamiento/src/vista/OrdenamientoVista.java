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

public class OrdenamientoVista {

    private Scanner leer = new Scanner(System.in);

    // Metodo para pedir los datos
    public int[] pedirDatos() {

        System.out.print("Ingrese la cantidad de numeros: ");
        int n = leer.nextInt();

        int[] datos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            datos[i] = leer.nextInt();
        }

        return datos;
    }

    // Metodo para mostrar los datos
    public void mostrarDatos(int[] datos) {

        System.out.println("Datos:");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }
}
