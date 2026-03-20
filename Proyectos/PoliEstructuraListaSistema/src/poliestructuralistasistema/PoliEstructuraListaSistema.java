/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliestructuralistasistema;

/**
 *
 * @author Harol
 */

// Programa: PoliEstructuraListaSistema
// Descripcion: Sistema CRUD usando ArrayList con validacion y exportacion

import java.util.Scanner;     // Entrada de datos
import java.util.ArrayList;   // Estructura dinamica
import java.io.FileWriter;    // Escritura de archivo
import java.io.IOException;   // Manejo de errores

public class PoliEstructuraListaSistema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner

        // Bienvenida
        System.out.println("=====================================");
        System.out.println(" SISTEMA POLIBICI LISTA DINAMICA ");
        System.out.println("=====================================");

        // Nombre usuario
        System.out.print("Ingrese su nombre: ");
        String nombre_usuario = sc.nextLine();

        // Creamos lista dinamica
        ArrayList<String> lista = new ArrayList<>();

        int opcion = 0; // Control menu

        do {

            // Menu
            System.out.println("\n------ MENU ------");
            System.out.println("1. Insertar");
            System.out.println("2. Mostrar");
            System.out.println("3. Buscar");
            System.out.println("4. Modificar");
            System.out.println("5. Eliminar");
            System.out.println("6. Exportar");
            System.out.println("7. Salir");
            System.out.print("Seleccione: ");

            // Validacion
            if(sc.hasNextInt()){
                opcion = sc.nextInt();
            } else {
                System.out.println("Entrada invalida");
                sc.next();
                continue;
            }

            sc.nextLine(); // limpiar buffer

            switch(opcion){

                case 1: // INSERTAR
                    System.out.print("Ingrese nombre bicicleta: ");
                    lista.add(sc.nextLine());
                    System.out.println("Agregado correctamente");
                    break;

                case 2: // MOSTRAR
                    if(lista.isEmpty()){
                        System.out.println("Lista vacia");
                    } else {
                        for(int i=0;i<lista.size();i++){
                            System.out.println(i + " -> " + lista.get(i));
                        }
                    }
                    break;

                case 3: // BUSCAR
                    System.out.print("Ingrese nombre a buscar: ");
                    String buscar = sc.nextLine();

                    if(lista.contains(buscar)){
                        System.out.println("Existe en la lista");
                    } else {
                        System.out.println("No existe");
                    }
                    break;

                case 4: // MODIFICAR
                    System.out.print("Ingrese indice: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    if(indice >=0 && indice < lista.size()){
                        System.out.print("Nuevo valor: ");
                        lista.set(indice, sc.nextLine());
                        System.out.println("Actualizado");
                    } else {
                        System.out.println("Indice invalido");
                    }
                    break;

                case 5: // ELIMINAR
                    System.out.print("Ingrese nombre a eliminar: ");
                    String eliminar = sc.nextLine();

                    if(lista.remove(eliminar)){
                        System.out.println("Eliminado");
                    } else {
                        System.out.println("No se encontro");
                    }
                    break;

                case 6: // EXPORTAR
                    try{
                        FileWriter archivo = new FileWriter("lista_polibici.txt");

                        for(String dato : lista){
                            archivo.write(dato + "\n");
                        }

                        archivo.close();
                        System.out.println("Exportado correctamente");

                    }catch(IOException e){
                        System.out.println("Error al exportar");
                    }
                    break;
            }

        } while(opcion != 7);

        System.out.println("\nGracias " + nombre_usuario);
        System.out.println("Sistema desarrollado por PoliBici");

        sc.close();
    }
}