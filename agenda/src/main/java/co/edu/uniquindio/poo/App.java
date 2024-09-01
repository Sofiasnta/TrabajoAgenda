package Agenda;

public class App2 {
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto("Nicolas","nico","Habitat","3057970008","nicolas@gmail.com");
        Contacto contacto2 = new Contacto("Luis","lucho","Habitat","3057007878","Luis@gmail.com");
        Contacto contacto3 = new Contacto("Nicolas","nico","Habitat","3057970008","nicolas@gmail.com");
        Contacto contacto4 = new Contacto("Nicolas","nico","Habitat","3057970008","nicolas@gmail.com");
        Contacto contacto5 = new Contacto("Nicolas","nico","Habitat","3057970008","nicolas@gmail.com");
        Contacto contacto6 = new Contacto("Nicolas","nico","Habitat","3057970008","nicolas@gmail.com");

        Grupo grupoIglesia = new Grupo("Grupo Iglesia");

        grupoIglesia.agregarContacto(contacto1);
        grupoIglesia.agregarContacto(contacto2);
        grupoIglesia.agregarContacto(contacto3);

        Grupo eam = new Grupo("eam");
        eam.agregarContacto(contacto1);


        System.out.println(grupoIglesia);
        System.out.println(eam.getContactos());

        Reunion FinDeAño = new Reunion("Reunion de fin de año","31 de diciembre","20:00");
        FinDeAño.agregarContacto(contacto1);
        FinDeAño.agregarContacto(contacto6);

        System.out.println(FinDeAño);


    }


}
