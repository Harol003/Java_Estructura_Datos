/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliarraymatriz;

/**
 *
 * @author Harol
 */
public class PoliArrayMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Se define la cantidad de personas que se almacenaran
        PersonaModelo modelo = new PersonaModelo(5);
        // Se crean la vista y el controlador
        PersonaVista vista = new PersonaVista();
        PersonaControlador controlador = new PersonaControlador(modelo, vista);
        // Se inicia el programa
        controlador.iniciar();
    }
    
}
