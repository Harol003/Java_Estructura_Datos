/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplolistagenericadiversa;

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

public class EjemploListaGenericaDiversa {
    public static void main(String[] args) {
        // Crear una lista genérica para almacenar diferentes tipos de datos
        List<Object> listaDiversa = new ArrayList<>();

        // Agregar diferentes tipos de elementos a la lista
        listaDiversa.add("Hola");     // Cadena de caracteres
        listaDiversa.add(42);         // Entero
        listaDiversa.add(3.14);       // Punto flotante (double)
        listaDiversa.add(true);       // Valor booleano

        // Imprimir los elementos de la lista
        System.out.println("|Politecnico Internacional | Ejemplo Lista Generica Diversa|");
        for (Object elemento : listaDiversa) {
            System.out.println(elemento);
        }
    }
}
