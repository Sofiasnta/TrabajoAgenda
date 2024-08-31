package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {
    public String nombre;

    public enum categoria {
        OFICINA, FIESTA, AMIGOS, FAMILIA
    };

    public Collection<Contacto> contactos;

    public Grupo(String nombre, Collection<Contacto> contactos) {
        this.nombre = nombre;
        this.contactos = contactos;
        contactos = new LinkedList<>();
    }

    

    public Grupo(String nombre) {
        this.nombre = nombre;
        contactos = new LinkedList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void agregarContacto(Contacto contacto) {
        boolean isCupo = verificarTamanioLista();
        if (isCupo) {
            boolean esUnico = verificarContacto(contacto.getNombre(), contacto.getTelefono());
            if (esUnico) {
                contactos.add(contacto);
            } else {
                System.out.println("El Contacto Ya Existe");
            }
        } else {
            System.out.println("La Lista de Contactos esta llena");
        }

    }

    public boolean verificarContacto(String nombre, String telefono) {
        for (Contacto contacto : contactos) {
            if (nombre.equals(contacto.getNombre()) && telefono.equals(contacto.getTelefono())) {
                return false;
            }
        }
        return true;
    }

    public boolean verificarTamanioLista() {
        if (contactos.size() <= 5) {
            return true;
        } else {
            return false;
        }
    }

}
