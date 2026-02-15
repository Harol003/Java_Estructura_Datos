/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Harol
 */


import modelo.ArrayModelo;
import vista.ArrayVista;

public class ArrayControlador {

    private ArrayModelo modelo;
    private ArrayVista vista;

    public ArrayControlador() {
        modelo = new ArrayModelo();
        vista = new ArrayVista();
    }

    public void iniciar() {

        int opcion = vista.menu();

        switch (opcion) {

            case 1:
                int[] array1D = modelo.crearArray1D(5);
                for (int i = 0; i < array1D.length; i++) {
                    array1D[i] = i + 1;
                }
                vista.mostrar1D(array1D);
                break;

            case 2:
                int[][] array2D = modelo.crearArray2D(3, 3);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        array2D[i][j] = i + j;
                    }
                }
                vista.mostrar2D(array2D);
                break;

            case 3:
                int[][][] array3D = modelo.crearArray3D(2, 2, 2);
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 2; k++) {
                            array3D[i][j][k] = i + j + k;
                        }
                    }
                }
                vista.mostrar3D(array3D);
                break;

            case 4:
                int[][][][] array4D = modelo.crearArray4D(2, 2, 2, 2);
                for (int a = 0; a < 2; a++) {
                    for (int b = 0; b < 2; b++) {
                        for (int c = 0; c < 2; c++) {
                            for (int d = 0; d < 2; d++) {
                                array4D[a][b][c][d] = a + b + c + d;
                            }
                        }
                    }
                }
                vista.mostrar4D(array4D);
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }
}

