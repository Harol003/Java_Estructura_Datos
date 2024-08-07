/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapaejemplo;

/**
 *
 * @author Harol
 */
import java.util.HashMap;
import java.util.Map;

public class MapaEjemplo {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        // Insertar pares clave-valor
        mapa.put("Uno", 1);
        mapa.put("Dos", 2);
        mapa.put("Tres", 3);

        // Acceder a un valor mediante su clave
        System.out.println("Valor de 'Dos': " + mapa.get("Dos")); // Salida: 2

        // Recorrer el mapa
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}

