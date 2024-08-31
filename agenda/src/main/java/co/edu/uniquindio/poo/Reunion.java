package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Reunion {
    public String descripcion;
    public String fecha;
    public String hora;
    public Collection<Contacto> contactos;
    
    public Reunion(String descripcion, String fecha, String hora, Collection<Contacto> contactos) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.contactos = contactos;
        contactos = new LinkedList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }

    public boolean verificarContacto(String nombre, String telefono){
        for (Contacto contacto : contactos) {
            if(nombre.equals(contacto.getNombre()) && telefono.equals(contacto.getTelefono())){
                return false;
            }
        }
        return true;
    }
    

}
