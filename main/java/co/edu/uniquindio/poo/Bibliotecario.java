package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {
    private double salario;

    public Bibliotecario(String nombre, String cedula, String telefono, String email, double salario) {
        super(nombre, cedula, telefono, email);
        this.salario = salario;
        assert !nombre.isBlank();
        assert !cedula.isBlank();
        assert !telefono.isBlank();
        assert !email.isBlank();
        assert salario >= 1300000;
        assert email.contains("@");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + ", salario=" + salario + ", cedula=" + cedula + ", telefono=" + telefono + ", email=" + email + "]";
    }

    // Método para registrar un préstamo
    public void registrarPrestamo(Libro libro, Estudiante estudiante) {
        estudiante.agregarLibroHistorial(libro.getTitulo());
        mostrarMensaje("El libro " + libro.getTitulo() + " ha sido prestado al estudiante " + estudiante.getNombre());
    }

    // Método para registrar la devolución de un libro
    public void registrarDevolucion(Libro libro, Estudiante estudiante) {
        mostrarMensaje("El estudiante " + estudiante.getNombre() + " ha devuelto el libro " + libro.getTitulo());
        // Aquí podrías agregar lógica para eliminar el libro del historial si se requiere
    }

    // Método para consultar los libros disponibles
    public void consultarLibros(Biblioteca biblioteca) {
        mostrarMensaje("Libros disponibles en la biblioteca: " + biblioteca.getLibros().toString());
    }

    // Método para mostrar mensajes
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
