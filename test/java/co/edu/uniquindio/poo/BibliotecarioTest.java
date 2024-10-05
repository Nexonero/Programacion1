package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; // Import necesario para LogFactory
import org.junit.jupiter.api.Test;

public class BibliotecarioTest {
    // Definir el logger
    private static final Log LOG = LogFactory.getLog(BibliotecarioTest.class);
    
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test: datos vacíos");
        
        // Crear un bibliotecario con datos válidos
        Bibliotecario bibliotecario = new Bibliotecario("Nicolas Gabriel Rodriguez", "10001", "3012155790", "ng@gmail.com", 1300000);

        // Verificamos que se lanza una excepción al intentar crear un bibliotecario con datos vacíos
        assertThrows(Throwable.class, () -> new Bibliotecario(" ", " ", " ", " ", 0.0));

        LOG.info("Finalizando test: datos vacíos");
    }

    @Test
    public void salarioMayorASMLMV() {
        LOG.info("Iniciado test: salario mayor a SMLMV");
        
        // Verificamos que se lanza una excepción al intentar crear un bibliotecario con un salario menor al SMLMV
        assertThrows(Throwable.class, () -> new Bibliotecario("Nicolas Gabriel Rodriguez", "10001", "3012155790", "ng@gmail.com", 1299999));
        
        LOG.info("Finalizando test: salario mayor a SMLMV");
    }

    @Test
    public void validacionCorreo() {
        LOG.info("Iniciado test: validación del correo");
        
        // Verificamos que se lanza una excepción al intentar crear un bibliotecario con un correo inválido
        assertThrows(Throwable.class, () -> new Bibliotecario("Nicolas Gabriel Rodriguez", "10001", "3012155790", "ng", 1300000));
        
        LOG.info("Finalizando test: validación del correo");
    }
}
