package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.time.LocalDate;

public class Prestamo {
    private String id;
    private LocalDate fechaDePrestamo;
    private LocalDate fechaDeDevolucion;
    LinkedList <DetallePrestamo> detallePrestamos;

    public Prestamo(String id, LocalDate fechaDePrestamo, LocalDate fechaDeDevolucion) {
        this.id = id;
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
        detallePrestamos = new LinkedList<>();
        assert detallePrestamos != null;
    }
    public LinkedList<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }
    public void setDetallePrestamos(LinkedList<DetallePrestamo> detallePrestamos) {
        if (detallePrestamos == null) {
            throw new IllegalArgumentException("La lista de detalles no puede ser nula");
        }
        this.detallePrestamos = detallePrestamos;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDate getFechaDePrestamo() {
        return fechaDePrestamo;
    }
    public void setFechaDePrestamo(LocalDate fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }
    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }
    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }
    @Override
    public String toString() {
        return "Prestamo [id=" + id + ", fechaDePrestamo=" + fechaDePrestamo + ", fechaDeDevolucion="
                + fechaDeDevolucion + ", detallePrestamos=" + detallePrestamos + "]";
    }
    public void agregarDetallePrestamo(DetallePrestamo detallePrestamo) {
        if (detallePrestamos.size() >= 5) {
            throw new IllegalArgumentException("No se pueden agregar más de cinco detalles");
        }
        detallePrestamos.add(detallePrestamo);
    }
    
    
}