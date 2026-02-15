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
import vista.BicicletaVista;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// Controlador con la logica del sistema
public class BicicletaControlador {

    // Lista abstracta
    private List<Bicicleta> listaBicicletas;

    private BicicletaVista vista;
    private Scanner scanner;

    public BicicletaControlador() {
        listaBicicletas = new ArrayList<>();
        vista = new BicicletaVista();
        scanner = new Scanner(System.in);
    }

    // Metodo principal
    public void iniciar() {
        int opcion;

        do {
            vista.mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    insertar();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    obtenerPorPosicion();
                    break;
                case 4:
                    buscarPorCodigo();
                    break;
                case 5:
                    longitud();
                    break;
                case 6:
                    vista.mostrarLista(listaBicicletas);
                    break;
                case 7:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida");
            }
        } while (opcion != 7);
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

        listaBicicletas.add(new Bicicleta(codigo, marca, tipo, precio));
        vista.mostrarMensaje("Bicicleta insertada correctamente");
    }

    // Eliminar por posicion
    private void eliminar() {
        System.out.print("Ingrese posicion a eliminar: ");
        int posicion = scanner.nextInt();

        if (posicion >= 0 && posicion < listaBicicletas.size()) {
            listaBicicletas.remove(posicion);
            vista.mostrarMensaje("Bicicleta eliminada");
        } else {
            vista.mostrarMensaje("Posicion invalida");
        }
    }

    // Obtener elemento por posicion
    private void obtenerPorPosicion() {
        System.out.print("Ingrese posicion: ");
        int posicion = scanner.nextInt();

        if (posicion >= 0 && posicion < listaBicicletas.size()) {
            vista.mostrarBicicleta(listaBicicletas.get(posicion));
        } else {
            vista.mostrarMensaje("Posicion invalida");
        }
    }

    // Buscar bicicleta por codigo
    private void buscarPorCodigo() {
        System.out.print("Ingrese codigo a buscar: ");
        int codigo = scanner.nextInt();
        boolean encontrado = false;

        for (Bicicleta b : listaBicicletas) {
            if (b.getCodigo() == codigo) {
                vista.mostrarBicicleta(b);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            vista.mostrarMensaje("Bicicleta no encontrada");
        }
    }

    // Longitud de la lista
    private void longitud() {
        vista.mostrarMensaje(
            "Cantidad de bicicletas: " + listaBicicletas.size()
        );
    }
}
