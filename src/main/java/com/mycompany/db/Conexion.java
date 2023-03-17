package com.mycompany.db;

import java.sql.*; //Importamos
import javax.swing.JOptionPane;

public class Conexion {

    //Creamos el constructor vacio
    public Conexion() {

    }

    //3.- Creamos una variable en la cual vamos a guardar el 
    // estado de la conexion a nuestra BDD
    public static Connection conexion;

    //4.- Creamos una variable para crear una instancia
    private static Conexion instancia;

    //5.- Creamos las variable para poder conectarnos a la BD
    private static final String URL = "jdbc:mysql://localhost/ilib";

    //6.- Creamos las variable para que guarde el nombre del usuario
    private static final String USER = "root";

    //7.- Creamos las variables para que guarde la contraseña
    private static final String PASSWORD = "Dragon1234";

    //8.- Creamos un metodo para conectarnos a la BDD
    public Connection conectar() {
        try {
            //10.- creamos para el nombre del Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //11.- Con esto guardamoc los datos de URL,ETC en la variable conexion.
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);

            //JOptionPane.showMessageDialog(null, "Conectado a la BD", "Mensaje", 3);
            return conexion;

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
        }

        return conexion;

    }

    //13.- Creamos el metodo para cerrar la conexion
    public void cerrarConexion() throws SQLException {
        try {
            //JOptionPane.showMessageDialog(null, "Desconeptado de la BD", "Mensaje", 3);
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
            conexion.close();
        } finally {
            //JOptionPane.showMessageDialog(null, "Desconeptado de la BD", "Mensaje", 3);
            conexion.close();
        }
    }

    //14.- Creamos el metodo Patron Singleton
    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

}
