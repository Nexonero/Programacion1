package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; // Import necesario para LogFactory
import org.junit.jupiter.api.Test;

public class LibroTest {
    // Definir el logger
    private static final Log LOG = LogFactory.getLog(LibroTest.class);
    
    @Test
    public void unidadesNegativas() {
        LOG.info("Iniciado test: unidades disponibles negativas");
        
        Libro libro1 = new Libro("10003", "000000000", "Vargas Llosa", "Satanás", "Norma", null, 10);

        // Verificamos que se lanza una excepción al intentar crear un libro con unidades negativas
        assertThrows(Throwable.class, () -> new Libro("10003", "000000000", "Vargas Llosa", "Satanás", "Norma", null, -10));

        LOG.info("Finalizando test: unidades disponibles negativas");
    }

    @Test
    public void librosConMismoIsbnSonIguales() {
        LOG.info("Iniciado test: librosConMismoIsbnSonIguales");

        // Crear dos libros con el mismo ISBN pero diferente código
        Libro libro1 = new Libro("001", "1234567890", "Gabriel García Márquez", "Cien años de soledad", "Norma", LocalDate.of(2020, 1, 1), 5);
        Libro libro2 = new Libro("002", "1234567890", "Gabriel García Márquez", "Cien años de soledad", "Norma", LocalDate.of(2020, 1, 1), 3);

        // Comparar si los libros se consideran iguales por ISBN
        assertEquals(libro1.getIsbn(), libro2.getIsbn());
        
        LOG.info("Finalizando test: librosConMismoIsbnSonIguales");
    }

    @Test
    public void noPermitirUnidadesNegativasAlActualizar() {
        LOG.info("Iniciado test: noPermitirUnidadesNegativasAlActualizar");

        Libro libro = new Libro("003", "0987654321", "Mario Vargas Llosa", "La ciudad y los perros", "Alfaguara", LocalDate.of(2019, 6, 15), 10);

        // Intentar establecer unidades negativas
        assertThrows(IllegalArgumentException.class, () -> libro.setUnidadesDisponibles(-5));

        LOG.info("Finalizando test: noPermitirUnidadesNegativasAlActualizar");
    }
}
