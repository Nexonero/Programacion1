package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EstudianteTest {
     //Estudiante.
    @Test
    public void testToString() {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Luisa", "456", "3207180117", "luisa@gmail.com");
        
        // Cadena esperada según el formato definido en el método toString
        String esperado = "Estudiante: Luisa, Cedula: 456, Telefono: 3207180117, Email: luisa@gmail.com";
        
        // Verificar que el método toString devuelve la cadena correcta
        assertEquals(esperado, estudiante.toString());
    }

    @Test
    public void testConstructorEstudianteConDatosDiferentes() {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Carlos", "123", "3001234567", "carlos@gmail.com");

        // Verificar que los atributos se inicializan correctamente
        assertEquals("Carlos", estudiante.getNombre());
        assertEquals("123", estudiante.getCedula());
        assertEquals("3001234567", estudiante.getTelefono());
        assertEquals("carlos@gmail.com", estudiante.getEmail());
    }
    @Test
    public void testModificacionAtributosEstudiante() {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Ana", "789", "3109876543", "ana@gmail.com");

        // Modificar los atributos
        estudiante.setNombre("Ana Maria");
        estudiante.setCedula("7890");
        estudiante.setTelefono("3109876543");
        estudiante.setEmail("anamaria@gmail.com");

        // Verificar que los atributos se han modificado correctamente
        assertEquals("Ana Maria", estudiante.getNombre());
        assertEquals("7890", estudiante.getCedula());
        assertEquals("3109876543", estudiante.getTelefono());
        assertEquals("anamaria@gmail.com", estudiante.getEmail());
    }
}
