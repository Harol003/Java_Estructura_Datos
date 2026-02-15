/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Harol
 */


import modelo.Bicicleta;
import modelo.ListaTAD;
import modelo.ListaBicicletaArray;

// Controlador que usa el TAD Lista
public class BicicletaControlador {

    private ListaTAD<Bicicleta> lista;

    public BicicletaControlador() {
        lista = new ListaBicicletaArray(20);
    }

    public void agregarBicicleta(int codigo, String marca) {
        lista.insertar(new Bicicleta(codigo, marca));
    }

    public void eliminarBicicleta(int posicion) {
        lista.eliminar(posicion);
    }

    public Bicicleta obtenerBicicleta(int posicion) {
        return lista.obtener(posicion);
    }

    public int totalBicicletas() {
        return lista.longitud();
    }

    public boolean buscarBicicleta(int codigo) {
        return lista.buscar(new Bicicleta(codigo, ""));
    }

    public boolean listaVacia() {
        return lista.estaVacia();
    }
}

