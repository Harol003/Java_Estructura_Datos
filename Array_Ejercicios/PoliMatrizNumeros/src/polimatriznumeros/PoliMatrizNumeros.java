/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimatriznumeros;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

// Programa: PoliMatrizNumeros
// Descripcion: ejemplo basico de una matriz con enteros en Java

public class PoliMatrizNumeros {
    public static void main(String[] args) {

        // Objeto para leer datos del teclado
        Scanner teclado = new Scanner(System.in);

        // Declaracion de la matriz de enteros de 3 filas por 3 columnas
        int[][] matriz = new int[3][3];

        // Variable para controlar el menu
        int opcion = 0;

        // Variables auxiliares
        int fila, columna, numeroBuscado, nuevoNumero;
        boolean encontrado;

        // Ciclo principal del programa
        do {
            System.out.println("\n===== MENU PoliMatrizNumeros =====");
            System.out.println("1. Ingresar numeros en la matriz");
            System.out.println("2. Modificar un numero");
            System.out.println("3. Eliminar un numero");
            System.out.println("4. Buscar un numero");
            System.out.println("5. Mostrar toda la matriz");
            System.out.println("6. Salir");
            System.out.print("Digite una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    // Llenar toda la matriz con datos ingresados por el usuario
                    System.out.println("\n--- INGRESAR NUMEROS ---");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print("Ingrese un numero para la posicion [" + i + "][" + j + "]: ");
                            matriz[i][j] = teclado.nextInt();
                        }
                    }
                    System.out.println("Numeros registrados correctamente.");
                    break;

                case 2:
                    // Modificar un numero en una posicion especifica
                    System.out.println("\n--- MODIFICAR NUMERO ---");
                    System.out.print("Ingrese la fila: ");
                    fila = teclado.nextInt();
                    System.out.print("Ingrese la columna: ");
                    columna = teclado.nextInt();

                    // Validar que la posicion exista
                    if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {
                        System.out.print("Ingrese el nuevo numero: ");
                        nuevoNumero = teclado.nextInt();
                        matriz[fila][columna] = nuevoNumero;
                        System.out.println("Numero modificado correctamente.");
                    } else {
                        System.out.println("Posicion invalida.");
                    }
                    break;

                case 3:
                    // Eliminar un numero cambiandolo por 0
                    System.out.println("\n--- ELIMINAR NUMERO ---");
                    System.out.print("Ingrese la fila: ");
                    fila = teclado.nextInt();
                    System.out.print("Ingrese la columna: ");
                    columna = teclado.nextInt();

                    // Validar que la posicion exista
                    if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {
                        matriz[fila][columna] = 0;
                        System.out.println("Numero eliminado correctamente.");
                    } else {
                        System.out.println("Posicion invalida.");
                    }
                    break;

                case 4:
                    // Buscar un numero dentro de la matriz
                    System.out.println("\n--- BUSCAR NUMERO ---");
                    System.out.print("Ingrese el numero a buscar: ");
                    numeroBuscado = teclado.nextInt();
                    encontrado = false;

                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            if (matriz[i][j] == numeroBuscado) {
                                System.out.println("Numero encontrado en la posicion [" + i + "][" + j + "]");
                                encontrado = true;
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("El numero no se encuentra en la matriz.");
                    }
                    break;

                case 5:
                    // Mostrar toda la matriz
                    System.out.println("\n--- MOSTRAR MATRIZ ---");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print(matriz[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    // Salir del programa
                    System.out.println("Gracias por usar PoliMatrizNumeros.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while (opcion != 6);

        // Cerrar el scanner
        teclado.close();
    }
}
