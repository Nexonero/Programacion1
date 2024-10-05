package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Libro {
    private String codigo;
    private String isbn;
    private String autor;
    private String titulo;
    private String editorial;
    private LocalDate fecha;
    private int unidadesDisponibles;

    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, LocalDate fecha,
            int unidadesDisponibles) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fecha = fecha;
        
        setUnidadesDisponibles(unidadesDisponibles); // Utilizar el setter para la validación
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        if (unidadesDisponibles < 0) {
            throw new IllegalArgumentException("Las unidades disponibles no pueden ser negativas");
        }
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", fecha=" + fecha + ", unidadesDisponibles=" + unidadesDisponibles + "]";
    }

    // Método agregado: consultarLibros
    public String consultarLibros() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Editorial: " + editorial;
    }
}
