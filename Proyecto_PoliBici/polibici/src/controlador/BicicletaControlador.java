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
import java.util.ArrayList;
import java.util.Scanner;

// Clase controlador
// Contiene la logica del sistema
public class BicicletaControlador {

    // Estructura de datos
    private ArrayList<Bicicleta> bicicletas;

    // Vista
    private BicicletaVista vista;

    // Scanner para entrada de datos
    private Scanner scanner;

    // Constructor
    public BicicletaControlador() {
        bicicletas = new ArrayList<>();
        vista = new BicicletaVista();
        scanner = new Scanner(System.in);
    }

    // Metodo principal del sistema
    public void iniciar() {
        int opcion;

        do {
            vista.mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarBicicleta();
                    break;
                case 2:
                    vista.mostrarBicicletas(bicicletas);
                    break;
                case 3:
                    vista.mostrarMensaje("Saliendo del sistema PoliBici...");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida");
            }
        } while (opcion != 3);
    }

    // Logica para registrar bicicleta
    private void registrarBicicleta() {
        System.out.print("Ingrese codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese tipo: ");
        String tipo = scanner.nextLine();

        System.out.print("Ingrese precio: ");
        double precio = scanner.nextDouble();

        // Se crea el modelo
        Bicicleta bicicleta = new Bicicleta(codigo, marca, tipo, precio);

        // Se guarda en la estructura de datos
        bicicletas.add(bicicleta);

        vista.mostrarMensaje("Bicicleta registrada correctamente\n");
    }
}
