/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polibici;

import controlador.BicicletaControlador;
/**
 *
 * @author Harol
 */
public class Polibici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Se crea el controlador
        BicicletaControlador controlador = new BicicletaControlador();

        // Se inicia el sistema
        controlador.iniciar();
    }
    
}
