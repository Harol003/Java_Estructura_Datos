/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliestructurapilasistema;

/**
 *
 * @author Harol
 */

// ============================================================
// PROGRAMA: PoliEstructuraPilaSistema
// DESCRIPCION: Sistema de historial usando PILA (LIFO)
// ============================================================
//
// TEORIA IMPORTANTE PARA EL ESTUDIANTE:
//
// PILA (STACK):
// Es una estructura de datos tipo LIFO (Last In, First Out)
// Esto significa: el ultimo elemento que entra es el primero que sale
//
// OPERACIONES PRINCIPALES:
// push()  -> insertar elemento
// pop()   -> eliminar ultimo elemento
// peek()  -> ver ultimo elemento sin eliminarlo
//
// EJEMPLO REAL:
// Historial de acciones (como deshacer en Word o navegador)
//
// ============================================================

import java.util.Scanner;     // Libreria para entrada de datos
import java.util.Stack;       // Libreria para usar pila
import java.io.FileWriter;    // Para exportar archivo
import java.io.IOException;   // Manejo de errores

public class PoliEstructuraPilaSistema {

    public static void main(String[] args) {

        // Creamos scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("=================================");
        System.out.println(" SISTEMA HISTORIAL POLIBICI ");
        System.out.println("=================================");

        // Pedimos nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Creamos la pila
        Stack<String> pila = new Stack<>();

        // Variable para el menu
        int opcion = 0;

        // Ciclo principal del sistema
        do {

            // Mostramos el menu
            System.out.println("\n------ MENU PILA ------");
            System.out.println("1. Registrar accion (push)");
            System.out.println("2. Deshacer accion (pop)");
            System.out.println("3. Ver ultima accion (peek)");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Buscar accion");
            System.out.println("6. Exportar historial");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            // Validamos que el usuario ingrese numero
            if(sc.hasNextInt()){
                opcion = sc.nextInt();
            } else {
                System.out.println("Entrada invalida");
                sc.next(); // limpiamos dato incorrecto
                continue;
            }

            sc.nextLine(); // limpiar buffer

            switch(opcion){

                case 1: // PUSH
                    System.out.print("Ingrese accion: ");
                    String accion = sc.nextLine(); // capturamos accion
                    pila.push(accion); // insertamos en la pila
                    System.out.println("Accion registrada correctamente");
                    break;

                case 2: // POP
                    if(!pila.isEmpty()){ // validamos que no este vacia
                        System.out.println("Accion deshecha: " + pila.pop());
                    } else {
                        System.out.println("No hay acciones para deshacer");
                    }
                    break;

                case 3: // PEEK
                    if(!pila.isEmpty()){
                        System.out.println("Ultima accion: " + pila.peek());
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;

                case 4: // MOSTRAR
                    System.out.println("Historial completo:");
                    System.out.println(pila);
                    break;

                case 5: // BUSCAR
                    System.out.print("Ingrese accion a buscar: ");
                    String buscar = sc.nextLine();

                    if(pila.contains(buscar)){
                        System.out.println("La accion existe en el historial");
                    } else {
                        System.out.println("No se encontro la accion");
                    }
                    break;

                case 6: // EXPORTAR
                    try{
                        // Creamos archivo
                        FileWriter archivo = new FileWriter("historial_polibici.txt");

                        // Escribimos cada elemento
                        for(String x : pila){
                            archivo.write(x + "\n");
                        }

                        archivo.close(); // cerramos archivo
                        System.out.println("Historial exportado correctamente");

                    }catch(IOException e){
                        System.out.println("Error al exportar archivo");
                    }
                    break;
            }

        } while(opcion != 7);

        // Mensaje final
        System.out.println("\nGracias " + nombre);
        System.out.println("Sistema desarrollado por PoliBici");

        sc.close(); // cerramos scanner
    }
}