/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colaejemplo;

/**
 *
 * @author Harol
 */
import java.util.LinkedList;
import java.util.Queue;

public class ColaEjemplo {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        // Encolar elementos
        cola.add(10);
        cola.add(20);
        cola.add(30);

        // Desencolar elementos
        System.out.println("Elemento en el frente: " + cola.poll()); // Salida: 10
        System.out.println("Elemento en el frente: " + cola.poll()); // Salida: 20

        // Ver el elemento en el frente sin removerlo
        System.out.println("Elemento en el frente: " + cola.peek()); // Salida: 30
    }
}
