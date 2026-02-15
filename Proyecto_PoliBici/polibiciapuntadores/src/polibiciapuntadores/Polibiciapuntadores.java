/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polibiciapuntadores;

/**
 *
 * @author Harol
 */
import controlador.ControladorApuntadores;

public class Polibiciapuntadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ControladorApuntadores controlador = new ControladorApuntadores();
        controlador.iniciar();
        
// Nodo siguiente es el apuntador
// actual = actual.siguiente mueve el apuntador
// No se copian bicicletas, se mueven referencias
// null significa fin de la lista
        
    }
    
}
