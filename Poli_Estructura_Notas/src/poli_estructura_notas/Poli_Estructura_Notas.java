package poli_estructura_notas;

import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Alumno que representa a un estudiante
class Alumno {
    String nombre;        // Nombre del alumno
    int id;               // ID del alumno
    double[] notas = new double[4]; // Arreglo de notas del alumno
    double promedio;      // Promedio de notas del alumno

    // Constructor que inicializa el ID y nombre del alumno
    Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Metodo para asignar notas y calcular el promedio
    void setNotas(double[] notas) {
        this.notas = notas;       // Asigna las notas al alumno
        calcularPromedio();       // Calcula el promedio de las notas
    }

    // Metodo para calcular el promedio de las notas
    void calcularPromedio() {
        double suma = 0;          // Variable para sumar las notas
        for (double nota : notas) {
            suma += nota;         // Suma cada nota al total
        }
        this.promedio = suma / notas.length; // Calcula el promedio
    }

    // Metodo para imprimir la informacion del alumno
    void imprimirAlumno() {
        // Imprime el ID y nombre del alumno en formato de tabla
        System.out.printf("| %-10d | %-20s |", id, nombre);
        // Imprime cada una de las notas del alumno
        for (double nota : notas) {
            System.out.printf(" %-6.2f |", nota);
        }
        // Imprime el promedio del alumno
        System.out.printf(" %-8.2f |\n", promedio);
    }
}

public class Poli_Estructura_Notas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para leer entradas del usuario
        boolean continuar = true;                 // Variable para controlar el ciclo principal

        // Mensaje de bienvenida
        System.out.println("Politecnico Internacional Estructura de Datos");

        // Ciclo principal para permitir al usuario repetir el proceso
        while (continuar) {
            String[] asignaturas = {"electronica", "matematicas", "espanol", "sociales", "democracia"};
            String asignatura = ""; // Asignatura seleccionada por el usuario

            // Seleccion de asignatura
            System.out.println("Seleccione una asignatura:");
            for (int i = 0; i < asignaturas.length; i++) {
                System.out.println((i + 1) + ". " + asignaturas[i]); // Lista las asignaturas
            }

            int opcion = 0; // Opcion seleccionada por el usuario
            // Ciclo para asegurar que se selecciona una opcion valida
            while (opcion < 1 || opcion > asignaturas.length) {
                try {
                    System.out.print("Ingrese el numero de la asignatura: ");
                    opcion = scanner.nextInt(); // Lee la opcion seleccionada
                    if (opcion < 1 || opcion > asignaturas.length) {
                        // Si la opcion no es valida, muestra un mensaje de error
                        System.out.println("Opcion no valida. Por favor, seleccione una opcion del 1 al " + asignaturas.length + ".");
                    }
                } catch (InputMismatchException e) {
                    // Si se ingresa un valor no numerico, muestra un mensaje de error
                    System.out.println("Entrada no valida. Por favor, ingrese un numero.");
                    scanner.next(); // Limpia el buffer del scanner
                }
            }
            asignatura = asignaturas[opcion - 1]; // Asigna la asignatura seleccionada
            scanner.nextLine(); // Consume el salto de linea

            int cantidadAlumnos = 0; // Cantidad de alumnos a ingresar
            // Ciclo para asegurar que se ingresa una cantidad valida de alumnos
            while (true) {
                try {
                    System.out.print("Ingrese la cantidad de alumnos: ");
                    cantidadAlumnos = scanner.nextInt(); // Lee la cantidad de alumnos
                    if (cantidadAlumnos <= 0) {
                        // Si la cantidad no es valida, muestra un mensaje de error
                        System.out.println("La cantidad de alumnos debe ser mayor a 0.");
                    } else {
                        break; // Si la cantidad es valida, sale del ciclo
                    }
                } catch (InputMismatchException e) {
                    // Si se ingresa un valor no numerico, muestra un mensaje de error
                    System.out.println("Entrada no valida. Por favor, ingrese un numero entero.");
                    scanner.next(); // Limpia el buffer del scanner
                }
            }
            scanner.nextLine(); // Consume el salto de linea

            Alumno[] alumnos = new Alumno[cantidadAlumnos]; // Arreglo para almacenar los alumnos

            // Ciclo para capturar los datos de cada alumno
            for (int i = 0; i < cantidadAlumnos; i++) {
                int id = 0; // ID del alumno
                // Ciclo para asegurar que se ingresa un ID valido
                while (true) {
                    try {
                        System.out.print("Ingrese el numero de identificacion del alumno " + (i + 1) + ": ");
                        id = scanner.nextInt(); // Lee el ID del alumno
                        break; // Si el ID es valido, sale del ciclo
                    } catch (InputMismatchException e) {
                        // Si se ingresa un valor no numerico, muestra un mensaje de error
                        System.out.println("Entrada no valida. Por favor, ingrese un numero entero.");
                        scanner.next(); // Limpia el buffer del scanner
                    }
                }
                scanner.nextLine(); // Consume el salto de linea

                // Captura del nombre del alumno
                System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
                String nombre = scanner.nextLine();
                alumnos[i] = new Alumno(id, nombre); // Crea un nuevo objeto Alumno

                double[] notas = new double[4]; // Arreglo para almacenar las notas del alumno
                // Ciclo para capturar las 4 notas del alumno
                for (int j = 0; j < 4; j++) {
                    double nota = -1; // Nota del alumno
                    // Ciclo para asegurar que se ingresa una nota valida
                    while (nota < 0 || nota > 5) {
                        try {
                            System.out.print("Ingrese la nota " + (j + 1) + " del alumno " + nombre + " (entre 0.0 y 5.0): ");
                            nota = scanner.nextDouble(); // Lee la nota del alumno
                            if (nota < 0 || nota > 5) {
                                // Si la nota no es valida, muestra un mensaje de error
                                System.out.println("Nota no valida. Debe estar entre 0.0 y 5.0.");
                            }
                        } catch (InputMismatchException e) {
                            // Si se ingresa un valor no numerico, muestra un mensaje de error
                            System.out.println("Entrada no valida. Por favor, ingrese un numero decimal.");
                            scanner.next(); // Limpia el buffer del scanner
                        }
                    }
                    notas[j] = nota; // Asigna la nota al arreglo de notas
                }
                scanner.nextLine(); // Consume el salto de linea

                alumnos[i].setNotas(notas); // Asigna las notas al alumno
            }

            // Impresion del listado de alumnos y sus notas
            System.out.println("\nAsignatura: " + asignatura);
            System.out.println("\nListado de Alumnos y sus Notas:");
            // Imprime la cabecera de la tabla
            System.out.printf("| %-10s | %-20s | %-6s | %-6s | %-6s | %-6s | %-8s |\n", "ID", "Nombre", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Promedio");
            System.out.println("-----------------------------------------------------------------------------------------");
            // Imprime la informacion de cada alumno
            for (Alumno alumno : alumnos) {
                alumno.imprimirAlumno();
            }

            // Preguntar al usuario si desea reiniciar el proceso
            System.out.print("\nDesea iniciar el proceso nuevamente? (s/n): ");
            char respuesta = scanner.next().toLowerCase().charAt(0); // Lee la respuesta del usuario
            continuar = (respuesta == 's'); // Decide si continuar basado en la respuesta
            scanner.nextLine(); // Consume el salto de linea
        }

        // Mensaje de despedida
        System.out.println("Gracias por usar el sistema. ¡Hasta luego!");

        scanner.close(); // Cierra el scanner
    }
}


