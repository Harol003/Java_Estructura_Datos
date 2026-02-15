/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polibiciqueue;

/**
 *
 * @author Harol
 */

import controlador.ControladorQueue;

public class Polibiciqueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorQueue controlador = new ControladorQueue();
        controlador.iniciar();
        
// FIFO = Primero en entrar, primero en salir
// frente apunta al primero
// fin apunta al ultimo
// enqueue mueve fin
// dequeue mueve frente
// Cuando frente == null - cola vacia    
        
        
    }
    
}
