/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliarraycompleto;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class PoliArrayCompleto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al programa PoliArrayCompleto");
        System.out.println("Este programa permitira trabajar con arrays.");
        System.out.println("-------------------------------------------");

        // Pedir tamaño del array
        System.out.print("Ingrese el tamano del array: ");
        int tamano = teclado.nextInt();

        // Validar que el tamaño sea mayor a cero
        if(tamano <= 0){
            System.out.println("El tamano debe ser mayor que cero.");
            System.out.println("El programa finaliza.");
            return;
        }

        // Crear el array
        int numeros[] = new int[tamano];

        System.out.println("\nIngrese los valores del array:");

        // Llenar el array
        for(int i = 0; i < numeros.length; i++){

            System.out.print("Ingrese el numero para la posicion " + i + ": ");
            numeros[i] = teclado.nextInt();

        }

        // Mostrar el array
        System.out.println("\nLos valores del array son:");

        for(int i = 0; i < numeros.length; i++){

            System.out.println("Posicion " + i + " = " + numeros[i]);

        }

        // Sumar los valores
        int suma = 0;

        for(int i = 0; i < numeros.length; i++){

            suma = suma + numeros[i];

        }

        System.out.println("\nLa suma de todos los numeros es: " + suma);

        // Buscar un numero
        System.out.print("\nIngrese el numero que desea buscar: ");
        int buscar = teclado.nextInt();

        boolean encontrado = false;

        for(int i = 0; i < numeros.length; i++){

            if(numeros[i] == buscar){

                System.out.println("El numero se encontro en la posicion: " + i);
                encontrado = true;

            }

        }

        if(!encontrado){

            System.out.println("El numero no se encuentra en el array.");

        }

        // Modificar un valor
        System.out.print("\nIngrese la posicion que desea modificar: ");
        int posicion = teclado.nextInt();

        if(posicion >= 0 && posicion < numeros.length){

            System.out.print("Ingrese el nuevo valor: ");
            numeros[posicion] = teclado.nextInt();

        }else{

            System.out.println("La posicion ingresada no es valida.");

        }

        // Mostrar array actualizado
        System.out.println("\nEl array actualizado es:");

        for(int i = 0; i < numeros.length; i++){

            System.out.println("Posicion " + i + " = " + numeros[i]);

        }

        // Despedida
        System.out.println("\nEl programa ha terminado.");
        System.out.println("Gracias por usar PoliArrayCompleto.");
        System.out.println("Hasta pronto.");

    }
}