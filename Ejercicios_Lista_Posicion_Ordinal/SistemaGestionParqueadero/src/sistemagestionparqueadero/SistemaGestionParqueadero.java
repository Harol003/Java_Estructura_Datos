/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionparqueadero;

/**
 *
 * @author Harol
 */
import java.util.ArrayList;  // Importa la clase ArrayList para manejar listas dinamicas.
import java.util.Scanner;    // Importa la clase Scanner para leer la entrada del usuario.

public class SistemaGestionParqueadero {  // Declara la clase principal del sistema de gestion de parqueadero.

    // Declara una lista dinamica para almacenar los vehiculos ingresados por el usuario.
    private static ArrayList<Vehiculo> parqueadero = new ArrayList<>();
    
    // Declara un objeto Scanner para leer la entrada del usuario desde la consola.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {  // Metodo principal donde inicia la ejecucion del programa.
        // Muestra el titulo de entrada al inicio del programa.
        System.out.println("Politecnico Internacional - Sistema de Gestion de Parqueadero\n");

        int opcion;  // Variable para almacenar la opcion seleccionada por el usuario.

        do {
            mostrarMenu();  // Llama al metodo para mostrar el menu de opciones.
            opcion = scanner.nextInt();  // Lee la opcion seleccionada por el usuario.
            scanner.nextLine();  // Consume el salto de linea despues de leer un entero.

            // Estructura switch para manejar la opcion seleccionada por el usuario.
            switch (opcion) {
                case 1:
                    agregarVehiculo();  // Llama al metodo para agregar un nuevo vehiculo al parqueadero.
                    break;
                case 2:
                    consultarVehiculo();  // Llama al metodo para consultar un vehiculo en el parqueadero.
                    break;
                case 3:
                    modificarVehiculo();  // Llama al metodo para modificar un vehiculo en el parqueadero.
                    break;
                case 4:
                    eliminarVehiculo();  // Llama al metodo para eliminar un vehiculo del parqueadero.
                    break;
                case 5:
                    mostrarParqueadero();  // Llama al metodo para mostrar todos los vehiculos en el parqueadero.
                    break;
                case 0:
                    System.out.println("Saliendo...");  // Muestra un mensaje de salida al usuario.
                    break;
                default:
                    System.out.println("Opcion no valida.");  // Muestra un mensaje si la opcion no es valida.
            }
        } while (opcion != 0);  // Repite el menu mientras la opcion no sea 0 (salir).
    }

    // Metodo para mostrar el menu de opciones al usuario.
    private static void mostrarMenu() {
        System.out.println("\n--- Menu ---");  // Titulo del menu.
        System.out.println("1. Agregar vehiculo");  // Opcion para agregar un vehiculo.
        System.out.println("2. Consultar vehiculo");  // Opcion para consultar un vehiculo.
        System.out.println("3. Modificar vehiculo");  // Opcion para modificar un vehiculo.
        System.out.println("4. Eliminar vehiculo");  // Opcion para eliminar un vehiculo.
        System.out.println("5. Mostrar parqueadero completo");  // Opcion para mostrar todos los vehiculos en el parqueadero.
        System.out.println("0. Salir");  // Opcion para salir del programa.
        System.out.print("Seleccione una opcion: ");  // Solicita al usuario que seleccione una opcion.
    }

    // Metodo para agregar un nuevo vehiculo al parqueadero.
    private static void agregarVehiculo() {
        System.out.print("Ingrese la placa del vehiculo: ");  // Solicita al usuario que ingrese la placa del vehiculo.
        String placa = scanner.nextLine();  // Lee la placa ingresada por el usuario.
        
        System.out.print("Ingrese el modelo del vehiculo: ");  // Solicita al usuario que ingrese el modelo del vehiculo.
        String modelo = scanner.nextLine();  // Lee el modelo ingresado por el usuario.
        
        System.out.print("Ingrese el nombre del propietario: ");  // Solicita al usuario que ingrese el nombre del propietario.
        String propietario = scanner.nextLine();  // Lee el nombre del propietario ingresado por el usuario.
        
        Vehiculo vehiculo = new Vehiculo(placa, modelo, propietario);  // Crea un nuevo objeto Vehiculo con los datos ingresados.
        parqueadero.add(vehiculo);  // Agrega el vehiculo a la lista del parqueadero.
        
        System.out.println("Vehiculo agregado al parqueadero.");  // Confirma al usuario que el vehiculo ha sido agregado.
    }

    // Metodo para consultar un vehiculo especifico en el parqueadero.
    private static void consultarVehiculo() {
        System.out.print("Ingrese la posicion del vehiculo a consultar: ");  // Solicita la posicion del vehiculo a consultar.
        int posicion = scanner.nextInt();  // Lee la posicion ingresada por el usuario.
        scanner.nextLine();  // Consume el salto de linea.

        // Verifica si la posicion es valida dentro de la lista.
        if (posicion >= 1 && posicion <= parqueadero.size()) {
            Vehiculo vehiculo = parqueadero.get(posicion - 1);  // Obtiene el vehiculo en la posicion indicada.
            System.out.println("Vehiculo en la posicion " + posicion + ":");  // Muestra la posicion del vehiculo.
            System.out.println(vehiculo);  // Muestra los detalles del vehiculo.
        } else {
            System.out.println("Posicion no valida.");  // Muestra un mensaje si la posicion no es valida.
        }
    }

    // Metodo para modificar un vehiculo existente en el parqueadero.
    private static void modificarVehiculo() {
        System.out.print("Ingrese la posicion del vehiculo a modificar: ");  // Solicita la posicion del vehiculo a modificar.
        int posicion = scanner.nextInt();  // Lee la posicion ingresada por el usuario.
        scanner.nextLine();  // Consume el salto de linea.

        // Verifica si la posicion es valida dentro de la lista.
        if (posicion >= 1 && posicion <= parqueadero.size()) {
            Vehiculo vehiculo = parqueadero.get(posicion - 1);  // Obtiene el vehiculo en la posicion indicada.
            
            System.out.print("Ingrese la nueva placa del vehiculo (actual: " + vehiculo.getPlaca() + "): ");  // Solicita la nueva placa.
            String nuevaPlaca = scanner.nextLine();  // Lee la nueva placa.
            vehiculo.setPlaca(nuevaPlaca);  // Actualiza la placa del vehiculo.
            
            System.out.print("Ingrese el nuevo modelo del vehiculo (actual: " + vehiculo.getModelo() + "): ");  // Solicita el nuevo modelo.
            String nuevoModelo = scanner.nextLine();  // Lee el nuevo modelo.
            vehiculo.setModelo(nuevoModelo);  // Actualiza el modelo del vehiculo.
            
            System.out.print("Ingrese el nuevo nombre del propietario (actual: " + vehiculo.getPropietario() + "): ");  // Solicita el nuevo propietario.
            String nuevoPropietario = scanner.nextLine();  // Lee el nuevo propietario.
            vehiculo.setPropietario(nuevoPropietario);  // Actualiza el propietario del vehiculo.
            
            System.out.println("Vehiculo modificado exitosamente.");  // Confirma al usuario que el vehiculo ha sido modificado.
        } else {
            System.out.println("Posicion no valida.");  // Muestra un mensaje si la posicion no es valida.
        }
    }

    // Metodo para eliminar un vehiculo del parqueadero.
    private static void eliminarVehiculo() {
        System.out.print("Ingrese la posicion del vehiculo a eliminar: ");  // Solicita la posicion del vehiculo a eliminar.
        int posicion = scanner.nextInt();  // Lee la posicion ingresada por el usuario.
        scanner.nextLine();  // Consume el salto de linea.

        // Verifica si la posicion es valida dentro de la lista.
        if (posicion >= 1 && posicion <= parqueadero.size()) {
            parqueadero.remove(posicion - 1);  // Elimina el vehiculo en la posicion indicada.
            System.out.println("Vehiculo eliminado del parqueadero.");  // Confirma al usuario que el vehiculo ha sido eliminado.
        } else {
            System.out.println("Posicion no valida.");  // Muestra un mensaje si la posicion no es valida.
        }
    }

    // Metodo para mostrar todos los vehiculos en el parqueadero.
    private static void mostrarParqueadero() {
        System.out.println("\n--- Lista de Vehiculos en el Parqueadero ---");  // Titulo de la lista de vehiculos.
        
        // Verifica si la lista del parqueadero esta vacia.
        if (parqueadero.isEmpty()) {
            System.out.println("El parqueadero esta vacio.");  // Informa al usuario que el parqueadero esta vacio.
        } else {
            // Itera sobre todos los vehiculos en la lista y los muestra con su posicion ordinal.
            for (int i = 0; i < parqueadero.size(); i++) {
                System.out.println((i + 1) + ". " + parqueadero.get(i));  // Muestra cada vehiculo con su numero de posicion.
            }
        }
    }
}

// Clase Vehiculo para representar los datos de un vehiculo en el parqueadero.
class Vehiculo {  // Declara la clase Vehiculo.
    private String placa;       // Variable para almacenar la placa del vehiculo.
    private String modelo;      // Variable para almacenar el modelo del vehiculo.
    private String propietario; // Variable para almacenar el nombre del propietario del vehiculo.

    // Constructor de la clase Vehiculo.
    public Vehiculo(String placa, String modelo, String propietario) {
        this.placa = placa;               // Inicializa la placa del vehiculo.
        this.modelo = modelo;             // Inicializa el modelo del vehiculo.
        this.propietario = propietario;   // Inicializa el propietario del vehiculo.
    }

    // Metodo getter para obtener la placa del vehiculo.
    public String getPlaca() {
        return placa;  // Retorna la placa del vehiculo.
    }

    // Metodo setter para establecer una nueva placa al vehiculo.
    public void setPlaca(String placa) {
        this.placa = placa;  // Actualiza la placa del vehiculo.
    }

    // Metodo getter para obtener el modelo del vehiculo.
    public String getModelo() {
        return modelo;  // Retorna el modelo del vehiculo.
    }

    // Metodo setter para establecer un nuevo modelo al vehiculo.
    public void setModelo(String modelo) {
        this.modelo = modelo;  // Actualiza el modelo del vehiculo.
    }

    // Metodo getter para obtener el nombre del propietario del vehiculo.
    public String getPropietario() {
        return propietario;  // Retorna el nombre del propietario del vehiculo.
    }

    // Metodo setter para establecer un nuevo propietario al vehiculo.
    public void setPropietario(String propietario) {
        this.propietario = propietario;  // Actualiza el propietario del vehiculo.
    }

    // Metodo toString para representar el vehiculo como una cadena de texto.
    @Override
    public String toString() {
        return "Placa: " + placa + ", Modelo: " + modelo + ", Propietario: " + propietario;  // Retorna los detalles del vehiculo.
    }
}
