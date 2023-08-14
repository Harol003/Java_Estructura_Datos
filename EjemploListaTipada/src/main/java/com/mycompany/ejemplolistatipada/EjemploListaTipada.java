/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplolistatipada;

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

public class EjemploListaTipada {
    public static void main(String[] args) {
        // Crear una lista tipada para almacenar cadenas de caracteres
        List<String> listaDeCadenas = new ArrayList<>();

        // Agregar elementos a la lista
        listaDeCadenas.add("Harol");
        listaDeCadenas.add("Torres");
        listaDeCadenas.add("Harol.Torres@poli.edu.co");
        listaDeCadenas.add("14 de Agosto de 2023");

        // No se permitiría agregar un entero en una lista tipada de cadenas
        // listaDeCadenas.add(42); // Esto causaría un error de compilación

        // Imprimir los elementos de la lista
         System.out.println("|Politecnico Internacional | Ejemplo Lista Tipada|");
        for (String cadena : listaDeCadenas) {
            System.out.println(cadena);
        }
    }
}
