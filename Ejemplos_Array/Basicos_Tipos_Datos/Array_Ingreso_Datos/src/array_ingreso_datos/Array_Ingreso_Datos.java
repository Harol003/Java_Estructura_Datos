/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_ingreso_datos;

import java.util.Scanner;
/**
 *
 * @author Harol
 */
public class Array_Ingreso_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Politecnico Internacional
        // Este programa permite al usuario elegir un tipo de dato (int, float, char, String, boolean),
        // ingresar valores para ese tipo de dato, almacenarlos en un array, y luego mostrar esos valores.

        // Crear el objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Imprimir encabezado
        System.out.println("Politecnico Internacional");

        // Imprimir el menú para que el usuario elija el tipo de dato
        System.out.println("Seleccione el tipo de dato a ingresar:");
        System.out.println("1. int");
        System.out.println("2. float");
        System.out.println("3. char");
        System.out.println("4. String");
        System.out.println("5. boolean");

        int option = scanner.nextInt(); // Leer la opción elegida
        scanner.nextLine(); // Consumir el salto de línea

        // Variable para el tamaño del array
        int size;

        // Determinar la opción seleccionada
        switch (option) {
            case 1: // Tipo de dato int
                System.out.print("Ingrese el tamaño del array: ");
                size = scanner.nextInt();
                int[] intArray = new int[size];

                // Pedir al usuario que ingrese los valores
                System.out.println("Ingrese " + size + " valores enteros:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Valor " + (i + 1) + ": ");
                    intArray[i] = scanner.nextInt();
                }

                // Mostrar los valores ingresados
                System.out.println("Valores del array de int:");
                for (int i = 0; i < size; i++) {
                    System.out.println("Elemento en la posicion " + i + ": " + intArray[i]);
                }
                break;

            case 2: // Tipo de dato float
                System.out.print("Ingrese el tamaño del array: ");
                size = scanner.nextInt();
                float[] floatArray = new float[size];

                // Pedir al usuario que ingrese los valores
                System.out.println("Ingrese " + size + " valores float:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Valor " + (i + 1) + ": ");
                    floatArray[i] = scanner.nextFloat();
                }

                // Mostrar los valores ingresados
                System.out.println("Valores del array de float:");
                for (int i = 0; i < size; i++) {
                    System.out.println("Elemento en la posicion " + i + ": " + floatArray[i]);
                }
                break;

            case 3: // Tipo de dato char
                System.out.print("Ingrese el tamaño del array: ");
                size = scanner.nextInt();
                char[] charArray = new char[size];

                // Pedir al usuario que ingrese los valores
                System.out.println("Ingrese " + size + " valores char:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Valor " + (i + 1) + ": ");
                    charArray[i] = scanner.next().charAt(0);
                }

                // Mostrar los valores ingresados
                System.out.println("Valores del array de char:");
                for (int i = 0; i < size; i++) {
                    System.out.println("Elemento en la posicion " + i + ": " + charArray[i]);
                }
                break;

            case 4: // Tipo de dato String
                System.out.print("Ingrese el tamaño del array: ");
                size = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                String[] stringArray = new String[size];

                // Pedir al usuario que ingrese los valores
                System.out.println("Ingrese " + size + " valores String:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Valor " + (i + 1) + ": ");
                    stringArray[i] = scanner.nextLine();
                }

                // Mostrar los valores ingresados
                System.out.println("Valores del array de String:");
                for (int i = 0; i < size; i++) {
                    System.out.println("Elemento en la posicion " + i + ": " + stringArray[i]);
                }
                break;

            case 5: // Tipo de dato boolean
                System.out.print("Ingrese el tamaño del array: ");
                size = scanner.nextInt();
                boolean[] booleanArray = new boolean[size];

                // Pedir al usuario que ingrese los valores
                System.out.println("Ingrese " + size + " valores boolean (true/false):");
                for (int i = 0; i < size; i++) {
                    System.out.print("Valor " + (i + 1) + ": ");
                    booleanArray[i] = scanner.nextBoolean();
                }

                // Mostrar los valores ingresados
                System.out.println("Valores del array de boolean:");
                for (int i = 0; i < size; i++) {
                    System.out.println("Elemento en la posicion " + i + ": " + booleanArray[i]);
                }
                break;

            default:
                System.out.println("Opcion invalida.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
