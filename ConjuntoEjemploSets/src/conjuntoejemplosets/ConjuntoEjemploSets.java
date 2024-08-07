/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntoejemplosets;

/**
 *
 * @author Harol
 */
import java.util.HashSet;
import java.util.Set;

public class ConjuntoEjemploSets {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        // Añadir elementos al conjunto
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");

        // Intentar añadir un duplicado
        conjunto.add("A");

        // Imprimir elementos del conjunto
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
