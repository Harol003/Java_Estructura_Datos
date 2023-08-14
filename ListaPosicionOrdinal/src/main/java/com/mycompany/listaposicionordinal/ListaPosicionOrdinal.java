/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaposicionordinal;

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

public class ListaPosicionOrdinal {
    public static void main(String[] args) {
        // Crear una lista de nombres en posición ordinal
        List<String> listaNombres = new ArrayList<>();
        
        // Agregar nombres a la lista
        listaNombres.add("Goku");
        listaNombres.add("Vegeta");
        listaNombres.add("Trunks");
        
        // Imprimir la lista de nombres junto con su posición ordinal
        System.out.println("|Politecnico Internacional | Ejemplo Lista Posicion Ordinal|");
        for (int i = 0; i < listaNombres.size(); i++) {
            String nombre = listaNombres.get(i);
            int posicion = i + 1; // Sumar 1 para que las posiciones comiencen desde 1
            System.out.println("Posición " + posicion + ": " + nombre);
        }
    }
}
