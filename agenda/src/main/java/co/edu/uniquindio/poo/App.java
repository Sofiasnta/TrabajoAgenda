package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto("Nicolas","nico","Habitat","3057970008","nicolas@gmail.com");
        Contacto contacto2 = new Contacto("Nicolas","nico","Habitat","3057008","nicolas@gmail.com");
        Contacto contacto3 = new Contacto("Nicolas","nico","Habitat","3057970008","nicolas@gmail.com");
        Contacto contacto4 = new Contacto("Nicolas","nico","Habitat","3057970008","nicolas@gmail.com");
        Contacto contacto5 = new Contacto("Nicolas","nico","Habitat","3057970008","nicolas@gmail.com");
        Contacto contacto6 = new Contacto("Nicolas","nico","Habitat","3057970008","nicolas@gmail.com");

        Grupo grupoIglesia = new Grupo("Grupo Iglesia");
        grupoIglesia.agregarContacto(contacto1);
        grupoIglesia.agregarContacto(contacto2);
        grupoIglesia.agregarContacto(contacto2);

        Grupo eam = new Grupo("eam");
        eam.agregarContacto(contacto1);


        System.out.println(grupoIglesia.getContactos());
        System.out.println(eam.getContactos());


    }

    
}
