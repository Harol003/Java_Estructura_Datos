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

    // Atributos de la bicicleta
    private int codigo;
    private String marca;
    private double precio;

    // Constructor
    public Bicicleta(int codigo, String marca, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
    }

    // Metodos get
    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    // Metodo para mostrar la informacion
    @Override
    public String toString() {
        return "Codigo: " + codigo + " | Marca: " + marca + " | Precio: $" + precio;
    }
}
