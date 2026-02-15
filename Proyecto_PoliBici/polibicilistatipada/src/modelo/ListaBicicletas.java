/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


import java.util.ArrayList;

// Clase que maneja la lista tipada de bicicletas
public class ListaBicicletas {

    // Lista tipada, solo acepta objetos Bicicleta
    private ArrayList<Bicicleta> lista;

    // Constructor
    public ListaBicicletas() {
        lista = new ArrayList<>();
    }

    // Insertar bicicleta
    public void insertar(Bicicleta bicicleta) {
        lista.add(bicicleta);
    }

    // Eliminar bicicleta por codigo
    public boolean eliminar(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo() == codigo) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }

    // Obtener bicicleta por posicion
    public Bicicleta obtener(int posicion) {
        if (posicion >= 0 && posicion < lista.size()) {
            return lista.get(posicion);
        }
        return null;
    }

    // Buscar bicicleta por codigo
    public Bicicleta buscar(int codigo) {
        for (Bicicleta b : lista) {
            if (b.getCodigo() == codigo) {
                return b;
            }
        }
        return null;
    }

    // Obtener longitud de la lista
    public int longitud() {
        return lista.size();
    }

    // Obtener toda la lista
    public ArrayList<Bicicleta> obtenerLista() {
        return lista;
    }
}
