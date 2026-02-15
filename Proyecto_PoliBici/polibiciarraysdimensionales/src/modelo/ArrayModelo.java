/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


public class ArrayModelo {

    // Array de una dimension
    public int[] crearArray1D(int n) {
        return new int[n];
    }

    // Array de dos dimensiones
    public int[][] crearArray2D(int filas, int columnas) {
        return new int[filas][columnas];
    }

    // Array de tres dimensiones
    public int[][][] crearArray3D(int x, int y, int z) {
        return new int[x][y][z];
    }

    // Array de cuatro dimensiones
    public int[][][][] crearArray4D(int a, int b, int c, int d) {
        return new int[a][b][c][d];
    }
}
