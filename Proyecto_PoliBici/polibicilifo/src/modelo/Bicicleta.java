/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Clase que representa una bicicleta
public class Bicicleta {

    private String marca;
    private double precio;

    // Constructor
    public Bicicleta(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    // Metodos get
    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    // Mostrar informacion
    @Override
    public String toString() {
        return "Marca: " + marca + " | Precio: $" + precio;
    }
}
