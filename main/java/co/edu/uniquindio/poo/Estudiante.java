package co.edu.uniquindio.poo;

public class Estudiante extends Persona {
    private double deuda; // Atributo para almacenar la deuda del estudiante
    private String historialLibros; // Atributo para almacenar el historial de libros

    public Estudiante(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.deuda = 0.0; // Inicializamos la deuda en 0
        this.historialLibros = ""; // Inicializamos el historial de libros
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", Cedula: " + cedula + ", Telefono: " + telefono + ", Email: " + email;
    }

    // Método para consultar la deuda del estudiante
    public double consultarDeuda() {
        return deuda;
    }

    // Método para consultar el historial de libros prestados
    public String consultarLibros() {
        return historialLibros;
    }

    // Método para consultar los datos del estudiante
    public String consultarDatos() {
        return "Nombre: " + nombre + ", Cedula: " + cedula + ", Telefono: " + telefono + ", Email: " + email;
    }

    // Método para actualizar la deuda
    public void actualizarDeuda(double monto) {
        this.deuda += monto;
    }

    // Método para agregar un libro al historial
    public void agregarLibroHistorial(String libro) {
        if (historialLibros.isEmpty()) {
            historialLibros = libro;
        } else {
            historialLibros += ", " + libro;
        }
    }
}
