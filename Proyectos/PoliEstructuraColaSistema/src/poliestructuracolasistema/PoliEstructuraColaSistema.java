/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliestructuracolasistema;

/**
 *
 * @author Harol
 */


// ============================================================
// PROGRAMA: PoliEstructuraColaSistema
// DESCRIPCION: Sistema de turnos usando COLA (FIFO)
// ============================================================
//
// TEORIA IMPORTANTE:
//
// COLA (QUEUE):
// Es una estructura de datos tipo FIFO (First In, First Out)
// El primer elemento que entra es el primero que sale
//
// OPERACIONES PRINCIPALES:
// add()  -> insertar (enqueue)
// poll() -> eliminar (dequeue)
// peek() -> ver primero sin eliminar
//
// EJEMPLO REAL:
// Fila de banco o atencion de clientes
//
// ============================================================

import java.util.Scanner;       // Entrada de datos
import java.util.Queue;         // Interfaz cola
import java.util.LinkedList;    // Implementacion de cola
import java.io.FileWriter;      // Exportar archivo
import java.io.IOException;     // Manejo de errores

public class PoliEstructuraColaSistema {

    public static void main(String[] args) {

        // Creamos scanner
        Scanner sc = new Scanner(System.in);

        // Bienvenida
        System.out.println("=================================");
        System.out.println(" SISTEMA TURNOS POLIBICI ");
        System.out.println("=================================");

        // Nombre usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Creamos la cola
        Queue<String> cola = new LinkedList<>();

        int opcion = 0;

        // Ciclo principal
        do {

            // Menu
            System.out.println("\n------ MENU COLA ------");
            System.out.println("1. Agregar cliente (enqueue)");
            System.out.println("2. Atender cliente (dequeue)");
            System.out.println("3. Ver primer cliente (peek)");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Buscar cliente");
            System.out.println("6. Exportar cola");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            // Validacion
            if(sc.hasNextInt()){
                opcion = sc.nextInt();
            } else {
                System.out.println("Entrada invalida");
                sc.next();
                continue;
            }

            sc.nextLine();

            switch(opcion){

                case 1: // ENQUEUE
                    System.out.print("Ingrese nombre del cliente: ");
                    String cliente = sc.nextLine();
                    cola.add(cliente); // insertamos
                    System.out.println("Cliente agregado correctamente");
                    break;

                case 2: // DEQUEUE
                    if(!cola.isEmpty()){
                        System.out.println("Cliente atendido: " + cola.poll());
                    } else {
                        System.out.println("No hay clientes en la cola");
                    }
                    break;

                case 3: // PEEK
                    if(!cola.isEmpty()){
                        System.out.println("Primer cliente: " + cola.peek());
                    } else {
                        System.out.println("Cola vacia");
                    }
                    break;

                case 4: // MOSTRAR
                    System.out.println("Cola actual:");
                    System.out.println(cola);
                    break;

                case 5: // BUSCAR
                    System.out.print("Ingrese cliente a buscar: ");
                    String buscar = sc.nextLine();

                    if(cola.contains(buscar)){
                        System.out.println("El cliente esta en la cola");
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                    break;

                case 6: // EXPORTAR
                    try{
                        FileWriter archivo = new FileWriter("cola_polibici.txt");

                        for(String x : cola){
                            archivo.write(x + "\n");
                        }

                        archivo.close();
                        System.out.println("Cola exportada correctamente");

                    }catch(IOException e){
                        System.out.println("Error al exportar archivo");
                    }
                    break;
            }

        } while(opcion != 7);

        // Mensaje final
        System.out.println("\nGracias " + nombre);
        System.out.println("Sistema desarrollado por PoliBici");

        sc.close();
    }
}