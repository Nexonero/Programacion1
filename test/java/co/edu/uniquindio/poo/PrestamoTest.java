package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; // Import necesario para LogFactory
import org.junit.jupiter.api.Test;

public class PrestamoTest {
    // Definir el logger
    private static final Log LOG = LogFactory.getLog(PrestamoTest.class);

    @Test
    public void asignarIdCorrectamente() {
        LOG.info("Iniciado test: asignarIdCorrectamente");

        // Crear un préstamo con un ID específico
        Prestamo prestamo = new Prestamo("P004", LocalDate.now(), LocalDate.now().plusDays(7));

        // Verificar que el ID se haya asignado correctamente
        assertEquals("P004", prestamo.getId());

        LOG.info("Finalizado test: asignarIdCorrectamente - ID asignado correctamente");
    }

    @Test
    public void listaDeDetallesNoPuedeSerNula() {
        LOG.info("Iniciado test: listaDeDetallesNoPuedeSerNula");

        Prestamo prestamo = new Prestamo("P003", LocalDate.now(), LocalDate.now().plusDays(5));

        // Verificamos que se lanza una excepción cuando se intenta establecer una lista de detalles nula
        assertThrows(IllegalArgumentException.class, () -> 
            prestamo.setDetallePrestamos(null)
        );

        LOG.info("Finalizado test: listaDeDetallesNoPuedeSerNula - Se lanzó IllegalArgumentException como se esperaba");
    }

    @Test
    public void noSePuedenAgregarMasDeCincoDetalles() {
        LOG.info("Iniciado test: noSePuedenAgregarMasDeCincoDetalles");

        // Crear un préstamo
        Prestamo prestamo = new Prestamo("P001", LocalDate.now(), LocalDate.now().plusDays(5));

        // Agregar 5 detalles válidos
        for (int j = 1; j <= 5; j++) {
            Libro libro = new Libro("C00" + j, "ISBN" + j, "Autor " + j, "Título " + j, "Editorial " + j, LocalDate.now(), 5);
            DetallePrestamo detalle = new DetallePrestamo(j, libro);
            prestamo.agregarDetallePrestamo(detalle);
        }

        // Intentar agregar un sexto detalle, lo cual debe lanzar una IllegalArgumentException
        Libro libroExtra = new Libro("C006", "ISBN6", "Autor 6", "Título 6", "Editorial 6", LocalDate.now(), 5);
        DetallePrestamo detalleExtra = new DetallePrestamo(6, libroExtra);

        // Comprobar que se lanza la excepción
        assertThrows(IllegalArgumentException.class, () -> prestamo.agregarDetallePrestamo(detalleExtra));

        LOG.info("Finalizado test: noSePuedenAgregarMasDeCincoDetalles - Se lanzó IllegalArgumentException como se esperaba al intentar agregar más de cinco detalles");
    }
}
