package co.edu.uniquindio.poo;

public class DetallePrestamo {
    private int numero;
    Libro libro;

    public DetallePrestamo(int numero, Libro libro) {
        this.numero = numero;
        this.libro = libro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DetallePrestamo [numero=" + numero + ", libro=" + libro + "]";
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    
}