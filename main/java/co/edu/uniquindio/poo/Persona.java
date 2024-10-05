package co.edu.uniquindio.poo;

public class Persona {
    public String nombre;
    public String cedula;
    public String telefono;
    public String email;
    public Persona(String nombre, String cedula, String telefono, String email) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", email=" + email + "]";
    }
    
    

    
}