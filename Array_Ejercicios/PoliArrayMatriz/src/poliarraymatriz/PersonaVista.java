/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliarraymatriz;

import java.util.Scanner;

// Clase vista que interactua con el usuario
public class PersonaVista {

    private Scanner teclado;

    public PersonaVista() {
        teclado = new Scanner(System.in);
    }

    // Metodo para pedir un dato al usuario
    public String pedirDato(String mensaje) {
        System.out.print(mensaje);
        return teclado.nextLine();
    }

    // Metodo para mostrar mensajes
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Metodo para mostrar el menu
    public int mostrarMenu() {
        System.out.println("\n=== MENU PoliArrayMatriz ===");
        System.out.println("1. Registrar persona");
        System.out.println("2. Modificar persona");
        System.out.println("3. Eliminar persona");
        System.out.println("4. Buscar persona");
        System.out.println("5. Mostrar toda la matriz");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = Integer.parseInt(teclado.nextLine());
        return opcion;
    }

    // Metodo para mostrar una persona
    public void mostrarPersona(String[] persona) {
        if (persona != null) {
            System.out.println("\nDatos de la persona:");
            System.out.println("Documento: " + persona[0]);
            System.out.println("Nombre: " + persona[1]);
            System.out.println("Apellido: " + persona[2]);
            System.out.println("Edad: " + persona[3]);
            System.out.println("Telefono: " + persona[4]);
            System.out.println("Correo: " + persona[5]);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    // Metodo para mostrar toda la matriz
    public void mostrarMatriz(String[][] matriz) {
        System.out.println("\n=== CONTENIDO DE LA MATRIZ ===");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null) {
                    System.out.print(matriz[i][j] + " | ");
                } else {
                    System.out.print("vacio | ");
                }
            }
            System.out.println();
        }
    }
}
