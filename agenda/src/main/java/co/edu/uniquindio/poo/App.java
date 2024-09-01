package Agenda;

public class App {
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto("Nicolas","nico","Habitat","3057008","nicolas@gmail.com");
        Contacto contacto2 = new Contacto("Luara", "lau", "Habitat", "30570474808", "laura@gmail.com");
        Contacto contacto3 = new Contacto("Sofia", "Sofi", "Armenia", "3123819703", "sofisanta@gmail.com");
        Contacto contacto4 = new Contacto("Santiago", "Santi", "Pereira", "3102891032", "santiago@gmail.com");
        Contacto contacto5 = new Contacto("Andrés", "Andi", "Circasia", "3053471208", "andres@gmail.com");
        Contacto contacto6 = new Contacto("Ana", "Anita", "Calarca", "3117972345", "anita@gmail.com");
        Contacto contacto7 = new Contacto("Nicolas","nico","Habitat","3057008","nicolas@gmail.com");


        Grupo grupoIglesia = new Grupo("Grupo Iglesia", Grupo.Categoria.Iglesia);

        grupoIglesia.agregarContacto(contacto1);
        grupoIglesia.agregarContacto(contacto2);
        grupoIglesia.agregarContacto(contacto3);
        grupoIglesia.agregarContacto(contacto4);
        grupoIglesia.agregarContacto(contacto5);
        //grupoIglesia.agregarContacto(contacto6);




        Grupo universidad = new Grupo("Universidad", Grupo.Categoria.Trabajo);
        universidad.agregarContacto(contacto1);
        universidad.agregarContacto(contacto3);
       // universidad.agregarContacto(contacto7);



        System.out.println(grupoIglesia);
        System.out.println(universidad);

        Reunion FinDeAño = new Reunion("Reunion de fin de año","31 de diciembre","20:00");
        FinDeAño.agregarContacto(contacto1);
        FinDeAño.agregarContacto(contacto6);
        FinDeAño.eliminarContacto("Nicolas","3057008");

        System.out.println(FinDeAño);

        contacto2.setNombre("Rosa");
        System.out.println(contacto2);
    }
}
