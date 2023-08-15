/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.structejemplo;

/**
 *
 * @author Harol
 */
public class StructEjemplo {
    public static void main(String[] args) {
        // Creación de una instancia de "struct" en Java
        Persona persona = new Persona("Harol Torres", 38, "Cra 7 # 6 - 10 Bogota  DC");
        
        // Acceso a los atributos directamente
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Edad: " + persona.edad);
        System.out.println("Dirección: " + persona.direccion);
    }
}

// Definición de la "clase" que imita un "struct"
class Persona {
    public String nombre;
    public int edad;
    public String direccion;
    
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
}

