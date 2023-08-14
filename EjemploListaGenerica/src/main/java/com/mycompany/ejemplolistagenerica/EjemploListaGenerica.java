/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplolistagenerica;

/**
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023

import java.util.List;
import java.util.ArrayList;

public class EjemploListaGenerica {
    public static void main(String[] args) {
        // Crear una lista genérica para almacenar enteros
        List<Integer> listaDeEnteros = new ArrayList<>();

        // Agregar elementos a la lista
        listaDeEnteros.add(10);
        listaDeEnteros.add(20);
        listaDeEnteros.add(30);

        // Imprimir los elementos de la lista
        System.out.println("|Politecnico Internacional | Ejemplo Lista Generica|");
        for (int elemento : listaDeEnteros) {
            System.out.println(elemento);
        }
    }
}
