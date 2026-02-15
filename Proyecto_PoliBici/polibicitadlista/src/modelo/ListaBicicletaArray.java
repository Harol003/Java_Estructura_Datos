/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Implementacion del TAD Lista usando un array
public class ListaBicicletaArray implements ListaTAD<Bicicleta> {

    private Bicicleta[] lista;
    private int tamaño;

    public ListaBicicletaArray(int capacidad) {
        lista = new Bicicleta[capacidad];
        tamaño = 0;
    }

    @Override
    public void insertar(Bicicleta bici) {
        if (tamaño < lista.length) {
            lista[tamaño] = bici;
            tamaño++;
        } else {
            System.out.println("Lista llena, no se puede insertar");
        }
    }

    @Override
    public void eliminar(int posicion) {
        if (posicion >= 0 && posicion < tamaño) {
            for (int i = posicion; i < tamaño - 1; i++) {
                lista[i] = lista[i + 1];
            }
            lista[tamaño - 1] = null;
            tamaño--;
        } else {
            System.out.println("Posicion invalida");
        }
    }

    @Override
    public Bicicleta obtener(int posicion) {
        if (posicion >= 0 && posicion < tamaño) {
            return lista[posicion];
        }
        return null;
    }

    @Override
    public boolean buscar(Bicicleta bici) {
        for (int i = 0; i < tamaño; i++) {
            if (lista[i].getCodigo() == bici.getCodigo()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int longitud() {
        return tamaño;
    }

    @Override
    public boolean estaVacia() {
        return tamaño == 0;
    }
}

