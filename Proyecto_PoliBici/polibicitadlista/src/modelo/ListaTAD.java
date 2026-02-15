/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Interfaz que define el TAD Lista
public interface ListaTAD<T> {

    void insertar(T elemento);

    void eliminar(int posicion);

    T obtener(int posicion);

    boolean buscar(T elemento);

    int longitud();

    boolean estaVacia();
}

