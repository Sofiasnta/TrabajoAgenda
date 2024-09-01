package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {
    public String nombre;
    public Categoria categoria;

    public enum Categoria {
        Oficina, Fiesta, Amigos, Familia, Iglesia
    };

    public Collection<Contacto> contactos;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new LinkedList<>();
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public void eliminarContacto(String nombre, String telefono) {
        for (Contacto contacto : contactos) {
            if (nombre.equals(contacto.getNombre()) && telefono.equals(contacto.getTelefono())) {
                contactos.remove(contacto);
                break;
            }
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
        if (contactos.size() < 5) {
            return true;
        } else {
            return false;
        }
    }

    // hacer esto en reuniom pero llamar todos lños parametros por que los puedo
    // editar todos y en el main los inicializo para editar
    public void setGrupo(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + ", contactos=" + contactos + "]";
    }

}

