/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Clase modelo que representa una bicicleta
public class Bicicleta {

    private int codigo;
    private String marca;

    public Bicicleta(int codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Bicicleta [codigo=" + codigo + ", marca=" + marca + "]";
    }
}
