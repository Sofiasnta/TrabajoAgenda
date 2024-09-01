package co.edu.uniquindio.poo;

public class App {
    
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto("Nicolas", "nico", "Habitat", "3057970008", "nicolas@gmail.com");
        Contacto contacto2 = new Contacto("Nicolas", "nico", "Habitat", "3057008", "nicolas@gmail.com");
        Contacto contacto3 = new Contacto("Sofia", "Sofi", "Armenia", "3123819703", "sofisanta@gmail.com");
        Contacto contacto4 = new Contacto("Santiago", "Santi", "Pereira", "3102891032", "santiago@gmail.com");
        Contacto contacto5 = new Contacto("Andrés", "Andi", "Circasia", "3053471208", "andres@gmail.com");
        Contacto contacto6 = new Contacto("Ana", "Anita", "Calarca", "3117972345", "anita@gmail.com");

        Grupo grupoIglesia = new Grupo("Grupo Iglesia", Grupo.Categoria.Iglesia);

        grupoIglesia.agregarContacto(contacto1);
        grupoIglesia.agregarContacto(contacto2);
        grupoIglesia.agregarContacto(contacto2);

        Grupo universidad = new Grupo("universidad Trabajo", Grupo.Categoria.Oficina);
        universidad.agregarContacto(contacto1);

        System.out.println(grupoIglesia.getContactos());
        System.out.println(universidad.getContactos());

        System.out.println(grupoIglesia.getNombre());
        grupoIglesia.setGrupo("CLASE LOS SABDOS");
        System.out.println(grupoIglesia.getNombre());

        Reunion finDeAnio = new Reunion("Fin de año", "31 enero", "20:00");
        finDeAnio.agregarContacto(contacto1);
        finDeAnio.agregarContacto(contacto6);

        System.out.println(finDeAnio);

    }

}

