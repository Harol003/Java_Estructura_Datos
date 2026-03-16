/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliarraymatriz;

// Clase controlador que conecta modelo y vista
public class PersonaControlador {

    private PersonaModelo modelo;
    private PersonaVista vista;
    private String nombreUsuario;

    public PersonaControlador(PersonaModelo modelo, PersonaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Metodo principal del programa
    public void iniciar() {
        vista.mostrarMensaje("=======================================");
        vista.mostrarMensaje("Bienvenido al programa PoliArrayMatriz");
        vista.mostrarMensaje("=======================================");

        nombreUsuario = vista.pedirDato("Ingrese su nombre: ");
        vista.mostrarMensaje("Hola " + nombreUsuario + ", bienvenido al sistema.");

        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    registrarPersona();
                    break;
                case 2:
                    modificarPersona();
                    break;
                case 3:
                    eliminarPersona();
                    break;
                case 4:
                    buscarPersona();
                    break;
                case 5:
                    mostrarMatriz();
                    break;
                case 6:
                    vista.mostrarMensaje("Gracias por usar PoliArrayMatriz, " + nombreUsuario + ".");
                    break;
                default:
                    vista.mostrarMensaje("Opcion invalida.");
            }
        } while (opcion != 6);
    }

    // Metodo para registrar una persona
    private void registrarPersona() {
        int filaVacia = modelo.obtenerPrimeraFilaVacia();

        if (filaVacia == -1) {
            vista.mostrarMensaje("No hay espacio disponible en la matriz.");
            return;
        }

        String documento = vista.pedirDato("Ingrese el documento: ");

        if (modelo.buscarPersonaPorDocumento(documento) != -1) {
            vista.mostrarMensaje("Ya existe una persona con ese documento.");
            return;
        }

        String nombre = vista.pedirDato("Ingrese el nombre: ");
        String apellido = vista.pedirDato("Ingrese el apellido: ");
        String edad = vista.pedirDato("Ingrese la edad: ");
        String telefono = vista.pedirDato("Ingrese el telefono: ");
        String correo = vista.pedirDato("Ingrese el correo: ");

        boolean registrado = modelo.registrarPersona(filaVacia, documento, nombre, apellido, edad, telefono, correo);

        if (registrado) {
            vista.mostrarMensaje("Persona registrada correctamente.");
        } else {
            vista.mostrarMensaje("No fue posible registrar la persona.");
        }
    }

    // Metodo para modificar una persona
    private void modificarPersona() {
        String documento = vista.pedirDato("Ingrese el documento de la persona a modificar: ");

        if (modelo.buscarPersonaPorDocumento(documento) == -1) {
            vista.mostrarMensaje("La persona no existe.");
            return;
        }

        String nuevoNombre = vista.pedirDato("Ingrese el nuevo nombre: ");
        String nuevoApellido = vista.pedirDato("Ingrese el nuevo apellido: ");
        String nuevaEdad = vista.pedirDato("Ingrese la nueva edad: ");
        String nuevoTelefono = vista.pedirDato("Ingrese el nuevo telefono: ");
        String nuevoCorreo = vista.pedirDato("Ingrese el nuevo correo: ");

        boolean modificado = modelo.modificarPersona(documento, nuevoNombre, nuevoApellido, nuevaEdad, nuevoTelefono, nuevoCorreo);

        if (modificado) {
            vista.mostrarMensaje("Persona modificada correctamente.");
        } else {
            vista.mostrarMensaje("No fue posible modificar la persona.");
        }
    }

    // Metodo para eliminar una persona
    private void eliminarPersona() {
        String documento = vista.pedirDato("Ingrese el documento de la persona a eliminar: ");

        boolean eliminado = modelo.eliminarPersona(documento);

        if (eliminado) {
            vista.mostrarMensaje("Persona eliminada correctamente.");
        } else {
            vista.mostrarMensaje("No se encontro la persona.");
        }
    }

    // Metodo para buscar una persona
    private void buscarPersona() {
        String documento = vista.pedirDato("Ingrese el documento de la persona a buscar: ");
        String[] persona = modelo.obtenerPersona(documento);
        vista.mostrarPersona(persona);
    }

    // Metodo para mostrar toda la matriz
    private void mostrarMatriz() {
        vista.mostrarMatriz(modelo.obtenerMatriz());
    }
}
