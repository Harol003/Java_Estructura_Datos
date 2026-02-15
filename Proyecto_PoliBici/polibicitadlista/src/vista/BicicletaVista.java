/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Harol
 */


import controlador.BicicletaControlador;
import modelo.Bicicleta;
import java.util.Scanner;

// Vista por consola
public class BicicletaVista {

    public static void main(String[] args) {

        BicicletaControlador controlador = new BicicletaControlador();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- PoliBici TAD Lista ---");
            System.out.println("1. Insertar bicicleta");
            System.out.println("2. Eliminar bicicleta");
            System.out.println("3. Obtener bicicleta por posicion");
            System.out.println("4. Buscar bicicleta");
            System.out.println("5. Mostrar total bicicletas");
            System.out.println("0. Salir");
            System.out.print("Seleccione opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    controlador.agregarBicicleta(codigo, marca);
                    break;

                case 2:
                    System.out.print("Posicion a eliminar: ");
                    controlador.eliminarBicicleta(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Posicion: ");
                    Bicicleta b = controlador.obtenerBicicleta(sc.nextInt());
                    System.out.println(b != null ? b : "No existe bicicleta");
                    break;

                case 4:
                    System.out.print("Codigo a buscar: ");
                    System.out.println(
                        controlador.buscarBicicleta(sc.nextInt()) ?
                        "Bicicleta encontrada" : "No encontrada"
                    );
                    break;

                case 5:
                    System.out.println("Total bicicletas: " + controlador.totalBicicletas());
                    break;
            }

        } while (opcion != 0);
    }
}

