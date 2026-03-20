/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliestructuraarraysistema;

/**
 *
 * @author Harol
 */

// Programa: PoliEstructuraArraySistema
// Autor: PoliBici
// Descripcion: Sistema completo de inventario con arrays, CRUD y exportacion a archivo

// Importamos librerias necesarias
import java.util.Scanner;          // Para entrada de datos
import java.io.FileWriter;         // Para escribir archivos
import java.io.IOException;        // Para manejar errores

public class PoliEstructuraArraySistema {

    public static void main(String[] args) {

        // Creamos objeto scanner para leer datos
        Scanner sc = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("=====================================");
        System.out.println(" BIENVENIDO AL SISTEMA POLIBICI ");
        System.out.println("=====================================");

        // Pedimos nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre_usuario = sc.nextLine();

        // Declaramos arrays para almacenar datos
        String nombres[] = new String[20]; // Nombres de bicicletas
        double precios[] = new double[20]; // Precios
        int cantidades[] = new int[20];    // Cantidad en stock

        // Variable que controla cuantos registros hay
        int contador = 0;

        // Variable para el menu
        int opcion;

        // Inicio del menu principal
        do {

            // Mostramos menu
            System.out.println("\n------ MENU POLIBICI ------");
            System.out.println("1. Insertar bicicleta");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Buscar bicicleta");
            System.out.println("4. Modificar bicicleta");
            System.out.println("5. Eliminar bicicleta");
            System.out.println("6. Exportar a archivo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            // Leemos opcion
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            // Evaluamos opcion
            switch(opcion){

                case 1: // INSERTAR
                    if(contador < nombres.length){

                        // Pedimos datos
                        System.out.print("Nombre: ");
                        nombres[contador] = sc.nextLine();

                        System.out.print("Precio: ");
                        precios[contador] = sc.nextDouble();

                        System.out.print("Cantidad: ");
                        cantidades[contador] = sc.nextInt();
                        sc.nextLine();

                        // Aumentamos contador
                        contador++;

                        System.out.println("Bicicleta registrada correctamente");

                    } else {
                        System.out.println("Inventario lleno");
                    }
                    break;

                case 2: // MOSTRAR
                    if(contador == 0){
                        System.out.println("No hay datos");
                    } else {
                        for(int i=0; i<contador; i++){
                            System.out.println("ID: " + i +
                                " | Nombre: " + nombres[i] +
                                " | Precio: " + precios[i] +
                                " | Cantidad: " + cantidades[i]);
                        }
                    }
                    break;

                case 3: // BUSCAR
                    System.out.print("Ingrese nombre a buscar: ");
                    String buscar = sc.nextLine();

                    boolean encontrado = false;

                    for(int i=0; i<contador; i++){
                        if(nombres[i].equalsIgnoreCase(buscar)){
                            System.out.println("Encontrado -> " + nombres[i] +
                                " Precio: " + precios[i] +
                                " Cantidad: " + cantidades[i]);
                            encontrado = true;
                        }
                    }

                    if(!encontrado){
                        System.out.println("No se encontro la bicicleta");
                    }
                    break;

                case 4: // MODIFICAR
                    System.out.print("Ingrese nombre a modificar: ");
                    String modificar = sc.nextLine();

                    for(int i=0; i<contador; i++){
                        if(nombres[i].equalsIgnoreCase(modificar)){

                            System.out.print("Nuevo nombre: ");
                            nombres[i] = sc.nextLine();

                            System.out.print("Nuevo precio: ");
                            precios[i] = sc.nextDouble();

                            System.out.print("Nueva cantidad: ");
                            cantidades[i] = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Registro actualizado");
                        }
                    }
                    break;

                case 5: // ELIMINAR
                    System.out.print("Ingrese nombre a eliminar: ");
                    String eliminar = sc.nextLine();

                    for(int i=0; i<contador; i++){
                        if(nombres[i].equalsIgnoreCase(eliminar)){

                            // Corrimiento de datos
                            for(int j=i; j<contador-1; j++){
                                nombres[j] = nombres[j+1];
                                precios[j] = precios[j+1];
                                cantidades[j] = cantidades[j+1];
                            }

                            contador--; // Reducimos tamaño
                            System.out.println("Bicicleta eliminada");
                            break;
                        }
                    }
                    break;

                case 6: // EXPORTAR
                    try {

                        // Creamos archivo
                        FileWriter archivo = new FileWriter("inventario_polibici.txt");

                        // Escribimos datos
                        archivo.write("INVENTARIO POLIBICI\n");

                        for(int i=0; i<contador; i++){
                            archivo.write(
                                nombres[i] + " - " +
                                precios[i] + " - " +
                                cantidades[i] + "\n"
                            );
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
        System.out.println("Sistema desarrollado por PoliBici");

        // Cerramos scanner
        sc.close();
    }
}