/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliestructuramatrizsistema;

/**
 *
 * @author Harol
 */


// Programa: PoliEstructuraMatrizSistema
// Autor: PoliBici
// Descripcion: Sistema de ventas usando matriz con CRUD completo y exportacion
// NOTA: Todo el codigo esta comentado para uso pedagogico

// Importamos librerias necesarias
import java.util.Scanner;      // Permite leer datos por consola
import java.io.FileWriter;     // Permite escribir en archivos
import java.io.IOException;    // Manejo de errores de archivo

public class PoliEstructuraMatrizSistema {

    public static void main(String[] args) {

        // Creamos el objeto scanner para capturar datos
        Scanner sc = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("=========================================");
        System.out.println("   SISTEMA DE VENTAS POLIBICI (MATRIZ)   ");
        System.out.println("=========================================");

        // Pedimos el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre_usuario = sc.nextLine();

        // Declaramos la matriz (estructura principal)
        // Filas = dias, Columnas = productos
        int ventas[][] = new int[5][3];

        // Variable para controlar el menu
        int opcion = 0;

        // Ciclo principal del sistema
        do {

            // Mostramos el menu
            System.out.println("\n------ MENU PRINCIPAL ------");
            System.out.println("1. Registrar venta");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Buscar venta");
            System.out.println("4. Modificar venta");
            System.out.println("5. Eliminar venta");
            System.out.println("6. Exportar a archivo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            // Validamos que el usuario ingrese numero
            if(sc.hasNextInt()){
                opcion = sc.nextInt();
            } else {
                System.out.println("Entrada invalida");
                sc.next(); // Limpiar dato incorrecto
                continue;
            }

            // Evaluamos opcion
            switch(opcion){

                case 1: // INSERTAR
                    System.out.println("\n--- REGISTRO DE VENTA ---");

                    // Pedimos posicion
                    System.out.print("Ingrese dia (0-4): ");
                    int fila = sc.nextInt();

                    System.out.print("Ingrese producto (0-2): ");
                    int columna = sc.nextInt();

                    // Validamos rango
                    if(fila >= 0 && fila < 5 && columna >= 0 && columna < 3){

                        System.out.print("Ingrese cantidad vendida: ");
                        ventas[fila][columna] = sc.nextInt();

                        System.out.println("Venta registrada correctamente");

                    } else {
                        System.out.println("Posicion fuera de rango");
                    }
                    break;

                case 2: // MOSTRAR
                    System.out.println("\n--- MATRIZ DE VENTAS ---");

                    // Recorremos la matriz
                    for(int i = 0; i < 5; i++){
                        for(int j = 0; j < 3; j++){
                            System.out.print(ventas[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3: // BUSCAR
                    System.out.print("Ingrese valor a buscar: ");
                    int buscar = sc.nextInt();

                    boolean encontrado = false;

                    // Busqueda en toda la matriz
                    for(int i = 0; i < 5; i++){
                        for(int j = 0; j < 3; j++){
                            if(ventas[i][j] == buscar){
                                System.out.println("Encontrado en fila " + i + " columna " + j);
                                encontrado = true;
                            }
                        }
                    }

                    if(!encontrado){
                        System.out.println("No se encontro el valor");
                    }
                    break;

                case 4: // MODIFICAR
                    System.out.print("Fila a modificar: ");
                    fila = sc.nextInt();

                    System.out.print("Columna a modificar: ");
                    columna = sc.nextInt();

                    if(fila >= 0 && fila < 5 && columna >= 0 && columna < 3){

                        System.out.print("Nuevo valor: ");
                        ventas[fila][columna] = sc.nextInt();

                        System.out.println("Dato actualizado");

                    } else {
                        System.out.println("Posicion invalida");
                    }
                    break;

                case 5: // ELIMINAR
                    System.out.print("Fila: ");
                    fila = sc.nextInt();

                    System.out.print("Columna: ");
                    columna = sc.nextInt();

                    if(fila >= 0 && fila < 5 && columna >= 0 && columna < 3){

                        ventas[fila][columna] = 0; // Eliminamos colocando cero
                        System.out.println("Dato eliminado");

                    } else {
                        System.out.println("Posicion invalida");
                    }
                    break;

                case 6: // EXPORTAR
                    try {
                        // Creamos archivo
                        FileWriter archivo = new FileWriter("ventas_polibici.txt");

                        // Escribimos encabezado
                        archivo.write("VENTAS POLIBICI\n");

                        // Escribimos datos
                        for(int i = 0; i < 5; i++){
                            for(int j = 0; j < 3; j++){
                                archivo.write(ventas[i][j] + " ");
                            }
                            archivo.write("\n");
                        }

                        // Cerramos archivo
                        archivo.close();

                        System.out.println("Datos exportados correctamente");

                    } catch(IOException e){
                        System.out.println("Error al exportar archivo");
                    }
                    break;
            }

        } while(opcion != 7);

        // Mensaje final personalizado
        System.out.println("\nGracias por usar el sistema, " + nombre_usuario);
        System.out.println("Desarrollado por PoliBici");

        // Cerramos scanner
        sc.close();
    }
}