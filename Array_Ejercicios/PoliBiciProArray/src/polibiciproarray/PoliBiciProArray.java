/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polibiciproarray;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class PoliBiciProArray {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de inventario de la tienda POLIBICI");
        System.out.println("Aqui administraremos bicicletas por marca, precio y cantidad");
        System.out.println("------------------------------------------------------------");

        // Pedir tamaño del inventario
        System.out.print("Cuantas bicicletas diferentes desea registrar?: ");
        int tamano = teclado.nextInt();
        teclado.nextLine();

        // Validar tamaño
        if(tamano <= 0){
            System.out.println("Debe registrar al menos una bicicleta.");
            return;
        }

        // Arrays paralelos
        String marcas[] = new String[tamano];
        double precios[] = new double[tamano];
        int cantidades[] = new int[tamano];

        // Ingreso de datos
        System.out.println("\nIngrese los datos de las bicicletas:");

        for(int i = 0; i < tamano; i++){

            System.out.println("\nBicicleta " + (i+1));

            System.out.print("Marca: ");
            marcas[i] = teclado.nextLine();

            System.out.print("Precio: ");
            precios[i] = teclado.nextDouble();

            System.out.print("Cantidad en inventario: ");
            cantidades[i] = teclado.nextInt();

            teclado.nextLine();

        }

        // Mostrar inventario
        System.out.println("\nInventario actual de POLIBICI");
        System.out.println("----------------------------------");

        for(int i = 0; i < tamano; i++){

            System.out.println("Marca: " + marcas[i] +
                    " | Precio: $" + precios[i] +
                    " | Cantidad: " + cantidades[i]);

        }

        // Calcular valor total del inventario
        double totalInventario = 0;

        for(int i = 0; i < tamano; i++){

            totalInventario = totalInventario + (precios[i] * cantidades[i]);

        }

        System.out.println("\nValor total del inventario: $" + totalInventario);

        // Buscar bicicleta por marca
        System.out.print("\nIngrese la marca de bicicleta que desea buscar: ");
        String buscarMarca = teclado.nextLine();

        boolean encontrado = false;

        for(int i = 0; i < tamano; i++){

            if(marcas[i].equalsIgnoreCase(buscarMarca)){

                System.out.println("Bicicleta encontrada:");
                System.out.println("Marca: " + marcas[i]);
                System.out.println("Precio: $" + precios[i]);
                System.out.println("Cantidad: " + cantidades[i]);

                encontrado = true;

            }

        }

        if(!encontrado){

            System.out.println("No se encontro esa marca en el inventario.");

        }

        // Modificar precio
        System.out.print("\nIngrese la posicion de la bicicleta para modificar el precio: ");
        int posicion = teclado.nextInt();

        if(posicion >= 0 && posicion < tamano){

            System.out.print("Ingrese el nuevo precio: ");
            precios[posicion] = teclado.nextDouble();

        }else{

            System.out.println("La posicion no es valida.");

        }

        // Mostrar inventario actualizado
        System.out.println("\nInventario actualizado de POLIBICI");

        for(int i = 0; i < tamano; i++){

            System.out.println("Marca: " + marcas[i] +
                    " | Precio: $" + precios[i] +
                    " | Cantidad: " + cantidades[i]);

        }

        // Despedida
        System.out.println("\nGracias por usar el sistema PoliBiciProArray.");
        System.out.println("Hasta pronto.");

    }
}