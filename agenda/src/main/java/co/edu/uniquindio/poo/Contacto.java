package Agenda;

public class Contacto {
    public String Nombre;
    public String Alias;
    public String Direccion;
    public String Telefono;
    public String Email;

    public Contacto(String Nombre,String Alias, String Direccion, String Telefono, String Email){
        this.Nombre=Nombre;
        this.Alias=Alias;
        this.Direccion=Direccion;
        this.Telefono=Telefono;
        this.Email=Email;
    }

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }

    public String getAlias(){
        return Alias;
    }
    public void setAlias(String Alias){
        this.Alias=Alias;
    }

    public String getDireccion(){
        return Direccion;
    }
    public void setDireccion(String Direccion){
        this.Direccion=Direccion;
    }

    public String getTelefono(){
        return Telefono;
    }
    public void setTelefono(String Telefono){
        this.Telefono=Telefono;
    }

    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }
    @Override
    public String toString() {
        return "Contacto{" +
                "Nombre='" + Nombre + '\'' +
                ", Alias='" + Alias + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
