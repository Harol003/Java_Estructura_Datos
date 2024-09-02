/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaposicionordinalejemplo;

/**
 *
 * @author Harol
 */
import java.util.ArrayList;  // Importa la clase ArrayList para manejar listas dinámicas.
import java.util.Scanner;    // Importa la clase Scanner para leer la entrada del usuario.

public class ListaPosicionOrdinalEjemplo {  // Declara la clase principal.

    // Declara una lista dinámica para almacenar los elementos ingresados por el usuario.
    private static ArrayList<String> lista = new ArrayList<>();
    
    // Declara un objeto Scanner para leer la entrada del usuario desde la consola.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {  // Método principal donde inicia la ejecución del programa.
        // Muestra el título de entrada al inicio del programa.
        System.out.println("Politecnico Internacional - Ejemplo de Lista de Posicion Ordinal\n");

        int opcion;  // Variable para almacenar la opción seleccionada por el usuario.

        do {
            mostrarMenu();  // Llama al método para mostrar el menú de opciones.
            opcion = scanner.nextInt();  // Lee la opción seleccionada por el usuario.
            scanner.nextLine();  // Consume el salto de línea después de leer un entero.

            // Estructura switch para manejar la opción seleccionada por el usuario.
            switch (opcion) {
                case 1:
                    agregarElemento();  // Llama al método para agregar un nuevo elemento a la lista.
                    break;
                case 2:
                    consultarElemento();  // Llama al método para consultar un elemento en la lista.
                    break;
                case 3:
                    modificarElemento();  // Llama al método para modificar un elemento de la lista.
                    break;
                case 4:
                    eliminarElemento();  // Llama al método para eliminar un elemento de la lista.
                    break;
                case 5:
                    mostrarLista();  // Llama al método para mostrar todos los elementos de la lista.
                    break;
                case 0:
                    System.out.println("Saliendo...");  // Muestra un mensaje de salida al usuario.
                    break;
                default:
                    System.out.println("Opcion no valida.");  // Muestra un mensaje si la opción no es válida.
            }
        } while (opcion != 0);  // Repite el menú mientras la opción no sea 0 (salir).
    }

    // Método para mostrar el menú de opciones al usuario.
    private static void mostrarMenu() {
        System.out.println("\n--- Menu ---");  // Título del menú.
        System.out.println("1. Agregar elemento");  // Opción para agregar un elemento.
        System.out.println("2. Consultar elemento");  // Opción para consultar un elemento.
        System.out.println("3. Modificar elemento");  // Opción para modificar un elemento.
        System.out.println("4. Eliminar elemento");  // Opción para eliminar un elemento.
        System.out.println("5. Mostrar lista completa");  // Opción para mostrar todos los elementos de la lista.
        System.out.println("0. Salir");  // Opción para salir del programa.
        System.out.print("Seleccione una opcion: ");  // Solicita al usuario que seleccione una opción.
    }

    // Método para agregar un nuevo elemento a la lista.
    private static void agregarElemento() {
        System.out.print("Ingrese el nuevo elemento: ");  // Solicita al usuario que ingrese un nuevo elemento.
        String elemento = scanner.nextLine();  // Lee el elemento ingresado por el usuario.
        lista.add(elemento);  // Agrega el elemento a la lista.
        System.out.println("Elemento agregado.");  // Confirma al usuario que el elemento ha sido agregado.
    }

    // Método para consultar un elemento específico de la lista.
    private static void consultarElemento() {
        System.out.print("Ingrese la posicion del elemento a consultar: ");  // Solicita la posición del elemento a consultar.
        int posicion = scanner.nextInt();  // Lee la posición ingresada por el usuario.
        // Verifica si la posición es válida dentro de la lista.
        if (posicion >= 1 && posicion <= lista.size()) {
            // Muestra el elemento en la posición solicitada.
            System.out.println("Elemento en la posicion " + posicion + ": " + lista.get(posicion - 1));
        } else {
            System.out.println("Posicion no valida.");  // Muestra un mensaje si la posición no es válida.
        }
    }

    // Método para modificar un elemento existente en la lista.
    private static void modificarElemento() {
        System.out.print("Ingrese la posicion del elemento a modificar: ");  // Solicita la posición del elemento a modificar.
        int posicion = scanner.nextInt();  // Lee la posición ingresada por el usuario.
        scanner.nextLine();  // Consume el salto de línea.
        // Verifica si la posición es válida dentro de la lista.
        if (posicion >= 1 && posicion <= lista.size()) {
            System.out.print("Ingrese el nuevo valor: ");  // Solicita el nuevo valor para el elemento.
            String nuevoValor = scanner.nextLine();  // Lee el nuevo valor ingresado por el usuario.
            lista.set(posicion - 1, nuevoValor);  // Reemplaza el valor en la lista en la posición indicada.
            System.out.println("Elemento modificado.");  // Confirma al usuario que el elemento ha sido modificado.
        } else {
            System.out.println("Posicion no valida.");  // Muestra un mensaje si la posición no es válida.
        }
    }

    // Método para eliminar un elemento de la lista.
    private static void eliminarElemento() {
        System.out.print("Ingrese la posicion del elemento a eliminar: ");  // Solicita la posición del elemento a eliminar.
        int posicion = scanner.nextInt();  // Lee la posición ingresada por el usuario.
        // Verifica si la posición es válida dentro de la lista.
        if (posicion >= 1 && posicion <= lista.size()) {
            lista.remove(posicion - 1);  // Elimina el elemento en la posición indicada.
            System.out.println("Elemento eliminado.");  // Confirma al usuario que el elemento ha sido eliminado.
        } else {
            System.out.println("Posicion no valida.");  // Muestra un mensaje si la posición no es válida.
        }
    }

    // Método para mostrar todos los elementos de la lista.
    private static void mostrarLista() {
        System.out.println("\n--- Lista de elementos ---");  // Título de la lista.
        // Itera sobre todos los elementos en la lista y los muestra con su posición ordinal.
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));  // Muestra cada elemento con su número de posición.
        }
    }
}
