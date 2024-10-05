package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList <Libro> libros; 
    private LinkedList <Estudiante> estudiantes;
    private LinkedList <Bibliotecario> bibliotecarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new LinkedList<>();
        this.estudiantes = new LinkedList<>();
        this.bibliotecarios = new LinkedList<>();
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Biblioteca: " + nombre + "\n" +
               "Libros: " + libros.toString() + "\n" +
               "Estudiantes: " + estudiantes.toString() + "\n" +
               "Bibliotecarios: " + bibliotecarios.toString();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para agregar un estudiante a la biblioteca
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para agregar un bibliotecario a la biblioteca
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    // Método para registrar un bibliotecario
    public void registrarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    // Método para consultar los bibliotecarios registrados
    public LinkedList<Bibliotecario> consultarBibliotecarios() {
        return bibliotecarios;
    }

    // Método para listar estudiantes
    public LinkedList<Estudiante> listarEstudiantes() {
        return estudiantes;
    }

    // Método para mostrar un mensaje
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
