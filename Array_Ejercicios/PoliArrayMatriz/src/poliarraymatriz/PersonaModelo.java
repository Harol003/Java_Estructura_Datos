/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliarraymatriz;

// Clase modelo que gestiona la matriz de datos
public class PersonaModelo {

    // Matriz para almacenar los datos de las personas
    // Columnas:
    // 0 = Documento
    // 1 = Nombre
    // 2 = Apellido
    // 3 = Edad
    // 4 = Telefono
    // 5 = Correo
    private String[][] matrizPersonas;

    // Constructor
    public PersonaModelo(int cantidadPersonas) {
        matrizPersonas = new String[cantidadPersonas][6];
    }

    // Metodo para registrar una persona en una fila especifica
    public boolean registrarPersona(int fila, String documento, String nombre, String apellido, String edad, String telefono, String correo) {
        if (fila >= 0 && fila < matrizPersonas.length && matrizPersonas[fila][0] == null) {
            matrizPersonas[fila][0] = documento;
            matrizPersonas[fila][1] = nombre;
            matrizPersonas[fila][2] = apellido;
            matrizPersonas[fila][3] = edad;
            matrizPersonas[fila][4] = telefono;
            matrizPersonas[fila][5] = correo;
            return true;
        }
        return false;
    }

    // Metodo para buscar una persona por documento
    public int buscarPersonaPorDocumento(String documento) {
        for (int i = 0; i < matrizPersonas.length; i++) {
            if (matrizPersonas[i][0] != null && matrizPersonas[i][0].equals(documento)) {
                return i;
            }
        }
        return -1;
    }

    // Metodo para modificar una persona
    public boolean modificarPersona(String documento, String nuevoNombre, String nuevoApellido, String nuevaEdad, String nuevoTelefono, String nuevoCorreo) {
        int fila = buscarPersonaPorDocumento(documento);
        if (fila != -1) {
            matrizPersonas[fila][1] = nuevoNombre;
            matrizPersonas[fila][2] = nuevoApellido;
            matrizPersonas[fila][3] = nuevaEdad;
            matrizPersonas[fila][4] = nuevoTelefono;
            matrizPersonas[fila][5] = nuevoCorreo;
            return true;
        }
        return false;
    }

    // Metodo para eliminar una persona
    public boolean eliminarPersona(String documento) {
        int fila = buscarPersonaPorDocumento(documento);
        if (fila != -1) {
            for (int j = 0; j < matrizPersonas[fila].length; j++) {
                matrizPersonas[fila][j] = null;
            }
            return true;
        }
        return false;
    }

    // Metodo para obtener los datos de una persona
    public String[] obtenerPersona(String documento) {
        int fila = buscarPersonaPorDocumento(documento);
        if (fila != -1) {
            return matrizPersonas[fila];
        }
        return null;
    }

    // Metodo para obtener toda la matriz
    public String[][] obtenerMatriz() {
        return matrizPersonas;
    }

    // Metodo para buscar la primera fila vacia
    public int obtenerPrimeraFilaVacia() {
        for (int i = 0; i < matrizPersonas.length; i++) {
            if (matrizPersonas[i][0] == null) {
                return i;
            }
        }
        return -1;
    }
}
