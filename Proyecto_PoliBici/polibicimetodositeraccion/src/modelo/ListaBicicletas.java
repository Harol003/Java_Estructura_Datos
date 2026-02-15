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
import java.util.Iterator;

// Clase que almacena las bicicletas
public class ListaBicicletas {

    private ArrayList<Bicicleta> lista;

    // Constructor
    public ListaBicicletas() {
        lista = new ArrayList<>();
        // Datos de prueba
        lista.add(new Bicicleta("GW", 1200));
        lista.add(new Bicicleta("Shimano", 1800));
        lista.add(new Bicicleta("Trek", 2500));
    }

    // Metodo for
    public void recorrerConFor() {
        System.out.println("\nIteraccion con FOR");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    // Metodo while
    public void recorrerConWhile() {
        System.out.println("\nIteraccion con WHILE");
        int i = 0;
        while (i < lista.size()) {
            System.out.println(lista.get(i));
            i++;
        }
    }

    // Metodo do-while
    public void recorrerConDoWhile() {
        System.out.println("\nIteraccion con DO-WHILE");
        int i = 0;
        if (!lista.isEmpty()) {
            do {
                System.out.println(lista.get(i));
                i++;
            } while (i < lista.size());
        }
    }

    // Metodo for-each
    public void recorrerConForEach() {
        System.out.println("\nIteraccion con FOR-EACH");
        for (Bicicleta b : lista) {
            System.out.println(b);
        }
    }

    // Metodo Iterator
    public void recorrerConIterator() {
        System.out.println("\nIteraccion con ITERATOR");
        Iterator<Bicicleta> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
