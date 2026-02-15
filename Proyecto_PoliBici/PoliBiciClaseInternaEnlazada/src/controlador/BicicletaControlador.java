/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Harol
 */


import modelo.Bicicleta;
import modelo.ListaBicicletas;
import vista.BicicletaVista;
import java.util.Scanner;

// Controlador que gestiona la logica del sistema
public class BicicletaControlador {

    private ListaBicicletas lista;
    private BicicletaVista vista;
    private Scanner scanner;

    // Constructor
    public BicicletaControlador() {
        lista = new ListaBicicletas();
        vista = new BicicletaVista();
        scanner = new Scanner(System.in);
    }

    // Metodo principal del sistema
    public void iniciar() {
        int opcion;

        do {
            vista.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    insertar();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    obtener();
                    break;
                case 4:
                    buscar();
                    break;
                case 5:
                    vista.mostrarMensaje(
                        "Cantidad de bicicletas: " + lista.longitud()
                    );
                    break;
                case 6:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida");
            }
        } while (opcion != 6);
    }

    // Insertar bicicleta
    private void insertar() {
        System.out.print("Codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        lista.insertar(new Bicicleta(codigo, marca, tipo, precio));
        vista.mostrarMensaje("Bicicleta insertada correctamente");
    }

    // Eliminar bicicleta
    private void eliminar() {
        if (lista.estaVacia()) {
            vista.mostrarMensaje("La lista esta vacia");
            return;
        }

        System.out.print("Posicion a eliminar: ");
        int pos = scanner.nextInt();
        scanner.nextLine();

        if (lista.eliminar(pos)) {
            vista.mostrarMensaje("Bicicleta eliminada");
        } else {
            vista.mostrarMensaje("Posicion invalida");
        }
    }

    // Obtener bicicleta por posicion
    private void obtener() {
        if (lista.estaVacia()) {
            vista.mostrarMensaje("La lista esta vacia");
            return;
        }

        System.out.print("Posicion a obtener: ");
        int pos = scanner.nextInt();
        scanner.nextLine();

        Bicicleta b = lista.obtener(pos);

        if (b != null) {
            vista.mostrarBicicleta(b);
        } else {
            vista.mostrarMensaje("Posicion invalida");
        }
    }

    // Buscar bicicleta por codigo
    private void buscar() {
        if (lista.estaVacia()) {
            vista.mostrarMensaje("La lista esta vacia");
            return;
        }

        System.out.print("Codigo a buscar: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        Bicicleta b = lista.buscar(codigo);

        if (b != null) {
            vista.mostrarBicicleta(b);
        } else {
            vista.mostrarMensaje("Bicicleta no encontrada");
        }
    }
}
