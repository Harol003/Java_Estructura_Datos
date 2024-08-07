/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author Harol
 */
class NodoArbol {
    int valor;
    NodoArbol izquierda, derecha;

    public NodoArbol(int valor) {
        this.valor = valor;
        izquierda = derecha = null;
    }
}

public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void agregar(int valor) {
        raiz = agregarRecursivo(raiz, valor);
    }

    private NodoArbol agregarRecursivo(NodoArbol actual, int valor) {
        if (actual == null) {
            return new NodoArbol(valor);
        }

        if (valor < actual.valor) {
            actual.izquierda = agregarRecursivo(actual.izquierda, valor);
        } else if (valor > actual.valor) {
            actual.derecha = agregarRecursivo(actual.derecha, valor);
        }

        return actual;
    }

    public void imprimirEnOrden(NodoArbol nodo) {
        if (nodo != null) {
            imprimirEnOrden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            imprimirEnOrden(nodo.derecha);
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.agregar(6);
        arbol.agregar(4);
        arbol.agregar(8);
        arbol.agregar(3);
        arbol.agregar(5);
        arbol.agregar(7);
        arbol.agregar(9);

        arbol.imprimirEnOrden(arbol.raiz); // Salida: 3 4 5 6 7 8 9
    }
}
