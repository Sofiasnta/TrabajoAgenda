package Agenda;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {
    public String nombre;
    public Categoria categoria;

    public enum Categoria {
        Oficina,Amigos, Trabajo, Iglesia
    }

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

    public boolean verificarTamanioLista() {
        if (contactos.size() < 5) {
            return true;
        } else {
            return false;
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
    public void eliminarContacto(String nombre,String telefono) {
        for (Contacto contacto : contactos) {
            if (nombre.equals(contacto.getNombre()) && telefono.equals(contacto.getTelefono())) {
                contactos.remove(contacto);
                break;
            }
        }
    }

    public void setGrupo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", contactos=" + contactos +
                '}';
    }
}
