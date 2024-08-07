/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilaejemplo;

/**
 *
 * @author Harol
 */
import java.util.Stack;

public class PilaEjemplo {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // Apilar elementos
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // Desapilar elementos
        System.out.println("Elemento en la cima: " + pila.pop()); // Salida: 30
        System.out.println("Elemento en la cima: " + pila.pop()); // Salida: 20

        // Ver el elemento en la cima sin removerlo
        System.out.println("Elemento en la cima: " + pila.peek()); // Salida: 10
    }
}
