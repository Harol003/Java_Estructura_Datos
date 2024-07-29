/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaabstractaejemplo;

/**
 *
 * @author Harol
 */
import java.util.ArrayList;
import java.util.List;

public class ListaAbstractaEjemplo {

    public static void main(String[] args) {
        // Crear una lista abstracta usando la implementacion de ArrayList
        List<String> tecnologias = new ArrayList<>();

        // Agregar elementos a la lista relacionados a la tecnologia
        tecnologias.add("Inteligencia Artificial");
        tecnologias.add("Aprendizaje Automatico");
        tecnologias.add("Internet de las Cosas");
        tecnologias.add("Blockchain");
        tecnologias.add("Computacion en la Nube");
        tecnologias.add("Ciberseguridad");
        tecnologias.add("Big Data");
        tecnologias.add("Realidad Aumentada");
        tecnologias.add("Realidad Virtual");
        tecnologias.add("5G");
        tecnologias.add("Impresion 3D");
        tecnologias.add("Automatizacion Robotica");
        tecnologias.add("Redes Neuronales");
        tecnologias.add("Biotecnologia");
        tecnologias.add("Computacion Cuantica");

        // Recorrer la lista y mostrar cada elemento
        for (String tecnologia : tecnologias) {
            System.out.println(tecnologia);
        }

        // Verificar si la lista contiene un elemento especifico
        if (tecnologias.contains("Blockchain")) {
            System.out.println("La lista contiene 'Blockchain'.");
        }

        // Obtener el tamano de la lista
        int tamaño = tecnologias.size();
        System.out.println("El tamano de la lista es: " + tamaño);

        // Eliminar un elemento de la lista
        tecnologias.remove("Biotecnologia");
        System.out.println("Despues de eliminar 'Biotecnologia', el tamano de la lista es: " + tecnologias.size());

        // Obtener un elemento en una posicion especifica
        String elemento = tecnologias.get(0);
        System.out.println("El primer elemento de la lista es: " + elemento);

        // Modificar un elemento en una posicion especifica
        tecnologias.set(0, "Inteligencia Artificial Avanzada");
        System.out.println("Despues de modificar, el primer elemento de la lista es: " + tecnologias.get(0));
    }
}
