package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //Creacion de la clase biblioteca.
        Biblioteca biblioteca = new Biblioteca("Olimpica");

        //Creacion del bibliotecario.
        Bibliotecario bibliotecario = new Bibliotecario("Nicolas Gabriel Rodriguez", "10001", "3012155790", "ng@gmail.com", 120);

        //Creacion del Estudiante.
        Estudiante estudiante = new Estudiante("Santiago Galeano", "10002", "3201786326", "elsanti@gmail.com");

        //Creacion del Libro.
        Libro libro1 = new Libro("10003", "000000000", "Vargas Lloza", "Satanas", "Norma", LocalDate.now(), 10);

        //Creacion de Prestamo.
        Prestamo prestamo = new Prestamo("10004", LocalDate.now(), LocalDate.now());

        //Agregar bibliotecario a biblioteca.
        biblioteca.agregarBibliotecario(bibliotecario);
        //Agregar estudiante a biblioteca.
        biblioteca.agregarEstudiante(estudiante);
        //agregar libro a biblioteca.
        biblioteca.agregarLibro(libro1);
        //Crear detalle y agregar prestamos.
        DetallePrestamo detallePrestamo = new DetallePrestamo(1, libro1);
        prestamo.agregarDetallePrestamo(detallePrestamo);

        //Mostrar el mensaje.
        Biblioteca.mostrarMensaje(biblioteca.toString());
    }
}