package Modelo;

public class Estudiante {

    private String Nro_ID;
    private String Nombres;
    private String Apellido;
    private String Direccion;

    //CONSTRUCTORES
    public Estudiante(){


    }

    public Estudiante(String nro_ID, String nombres, String apellido, String direccion) {
        Nro_ID = nro_ID;
        Nombres = nombres;
        Apellido = apellido;
        Direccion = direccion;
    }

    //METODOS GETTER Y SETTER
    public String getNro_ID() {
        return Nro_ID;
    }

    public void setNro_ID(String nro_ID) {
        Nro_ID = nro_ID;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Nro_ID='" + Nro_ID + '\'' +
                ", Nombres='" + Nombres + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }
}
