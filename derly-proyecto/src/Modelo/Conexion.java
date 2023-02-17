package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //Debemos saber que tipo es la conexion. En este caso es MYSQL
    //Nombre de Base de datos
    //Usuario root
    //Contraseña

    private String bdName = "prestamos";
    private String url = "jdbc:mysql://localhost:3306/" + bdName;
    private String user = "root";
    private String pass = "1234";
    Connection conect = null;

    public Connection conector(){

        try {

            conect = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión Ok.....");

        } catch(SQLException excep){

            System.out.println("Error en la conexion " + excep);

        }

        return conect;

    }

}
