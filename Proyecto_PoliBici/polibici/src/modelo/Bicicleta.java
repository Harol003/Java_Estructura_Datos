/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Clase modelo
// Representa la estructura de datos del sistema
public class Bicicleta {

    // Atributos de la bicicleta
    private int codigo;
    private String marca;
    private String tipo;
    private double precio;

    // Constructor
    public Bicicleta(int codigo, String marca, String tipo, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
    }

    // Metodos get y set
    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }
}
