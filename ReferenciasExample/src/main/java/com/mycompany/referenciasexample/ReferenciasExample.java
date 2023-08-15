/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.referenciasexample;

/**
 *
 * @author Harol
 */
public class ReferenciasExample {

    public static void main(String[] args) {
        // Crear un objeto de tipo String
        String cadena = "Politecnico Internacional, Implementacion de una Cadena";

        // Asignar una referencia al objeto a otra variable
        String otraCadena = cadena;

        // Modificar el contenido del objeto a través de la referencia
        otraCadena = otraCadena + "Politecnico Internacional, Implementacion de una cadena modificada";

        // Imprimir ambas variables
        System.out.println("| Politecnico Internacional | Ejemplo Referencia |");
        System.out.println("Cadena original: " + cadena);
        System.out.println("Otra cadena: " + otraCadena);
    }
}
