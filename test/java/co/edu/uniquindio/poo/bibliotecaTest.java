/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class bibliotecaTest {
    private static final Logger LOG = Logger.getLogger(bibliotecaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    //Biblioteca.
    @Test
    public void datosCompletos() {
        LOG.info("Iniciando test de datos Completos");
        Biblioteca biblioteca = new Biblioteca("Olimpica");
        assertEquals("Olimpica",biblioteca.getNombre());
        LOG.info("Finalizando test datos completos.");
    }
    //Agregar multiples estudiantes.
    @Test
    public void agregarEstudiante() {
        LOG.info("Iniciado test agregarEstudiante");

        // Crear una instancia de la biblioteca
        Biblioteca biblioteca = new Biblioteca("Confenalco");

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Luis", "456", "31092421", "nicolas@gmail.com");
        Estudiante estudiante2 = new Estudiante("Ana", "789", "131212312", "ana@gmail.com");
        Estudiante estudiante3 = new Estudiante("Carlos", "123", "3104924160", "carlos@gmail.com");

        // Agregar estudiantes a la biblioteca
        biblioteca.agregarEstudiante(estudiante1);
        biblioteca.agregarEstudiante(estudiante2);
        biblioteca.agregarEstudiante(estudiante3);

        // Verificar si los estudiantes fueron agregados correctamente
        assertTrue(biblioteca.getEstudiantes().contains(estudiante1));
        assertTrue(biblioteca.getEstudiantes().contains(estudiante2));
        assertTrue(biblioteca.getEstudiantes().contains(estudiante3));

        // Verificar el tamaño de la lista de estudiantes
        assertEquals(3, biblioteca.getEstudiantes().size());

        LOG.info("Finalizando test agregarEstudiante");
    }
    @Test
    //Agregar un unico bibliotecario.
    public void agregarListaBibliotecarios() {
        Biblioteca biblioteca = new Biblioteca("Confenalco");
        Bibliotecario bibliotecario = new Bibliotecario("Nicolas Gabriel Rodriguez", "10001", "3012155790", "ng@gmail.com",  1300000);
        biblioteca.agregarBibliotecario(bibliotecario);
        assertEquals(1, biblioteca.getBibliotecarios().size());
        assertTrue(biblioteca.getBibliotecarios().contains(bibliotecario));
    }

   








}