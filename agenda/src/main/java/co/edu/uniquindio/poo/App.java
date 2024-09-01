package co.edu.uniquindio.poo;

public class App {
    
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto("Nicolas", "nico", "Circasia", "3057970008", "nicolas@gmail.com");
        Contacto contacto2 = new Contacto("Monica", "Moni", "Medellín", "3057008", "moni@gmail.com");
        Contacto contacto3 = new Contacto("Sofia", "Sofi", "Armenia", "3123819703", "sofisanta@gmail.com");
        Contacto contacto4 = new Contacto("Santiago", "Santi", "Pereira", "3102891032", "santiago@gmail.com");
        Contacto contacto5 = new Contacto("Andrés", "Andi", "Circasia", "3053471208", "andres@gmail.com");
        Contacto contacto6 = new Contacto("Ana", "Anita", "Calarca", "3117972345", "anita@gmail.com");

        Grupo grupoIglesia = new Grupo("Grupo Iglesia", Grupo.Categoria.Iglesia);

        System.out.println(grupoIglesia.getNombre());
        grupoIglesia.setGrupo("Reunion Jovenes SABADOS");

        grupoIglesia.agregarContacto(contacto1);
        grupoIglesia.agregarContacto(contacto2);
        grupoIglesia.agregarContacto(contacto2);

        System.out.println(grupoIglesia.getContactos());

        Grupo universidad = new Grupo("Universidad Trabajo", Grupo.Categoria.Oficina);
        universidad.agregarContacto(contacto3);

        System.out.println(universidad.getNombre());
        System.out.println(universidad.getContactos());

        System.out.println(grupoIglesia.getNombre());
        grupoIglesia.setGrupo("Iglesia Domingo");
        System.out.println(grupoIglesia.getNombre());

        Reunion finDeAnio = new Reunion("Fin de año", "31 enero", "20:00");
        finDeAnio.agregarContacto(contacto1);
        finDeAnio.agregarContacto(contacto6);

        System.out.println(finDeAnio);

        Grupo fiesta = new Grupo ("fiesta Sabado", Grupo.Categoria.Fiesta);

        System.out.println(fiesta.getNombre());

        fiesta.agregarContacto(contacto6);
        fiesta.agregarContacto(contacto1);
        fiesta.agregarContacto(contacto5);
        fiesta.agregarContacto(contacto4);
        fiesta.agregarContacto(contacto3);
        fiesta.agregarContacto(contacto2);
         
        System.out.println(fiesta.getContactos());

        contacto1.setNombre("Rosa");
        System.out.println(contacto1);

    }

}

