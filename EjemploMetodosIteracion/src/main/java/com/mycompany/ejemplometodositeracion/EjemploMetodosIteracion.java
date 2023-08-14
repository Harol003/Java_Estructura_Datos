/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplometodositeracion;

/**
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023


import java.util.ArrayList;
import java.util.List;

public class EjemploMetodosIteracion {
    public static void main(String[] args) {
        // Crear una lista de números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Utilizar el método forEach para imprimir el doble de cada número
        System.out.println("|Politecnico Internacional | Ejemplo Metodos de Iteraccion ForEach|");
        System.out.println("Números originales y su doble:");
        numeros.forEach(numero -> {
            int doble = numero * 2;
            System.out.println(numero + " -> " + doble);
        });
    }
}
