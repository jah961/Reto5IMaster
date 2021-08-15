package util;

import java.io.File;//Para verificación de longitud de base de datos

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {

    //Atributos de clase para gestión de conexión con la base de datos    
    private static final String UBICACION_BD = "C:\\Users\\ALHER\\Documents\\NetBeansProjects\\proyecto_construccion\\ProyectosConstruccion.db";    

    public static Connection getConnection() throws SQLException {
       
       try {
            String url = "jdbc:sqlite:" + UBICACION_BD;
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(url);
       } 
       catch (Exception e)
       {
           return null;
       }
    }

    public static boolean estaVacia(){
        File archivo = new File(JDBCUtilities.UBICACION_BD);
        return archivo.length() == 0;
    }
}
