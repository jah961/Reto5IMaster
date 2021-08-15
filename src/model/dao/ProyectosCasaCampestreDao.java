package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.ProyectosCasaCampestre;

public class ProyectosCasaCampestreDao {
    //Obtener los proyectos por Tipo en la ciudad de Montería
    public ArrayList<ProyectosCasaCampestre> requerimiento3() throws SQLException {

        ArrayList<ProyectosCasaCampestre> respuesta = new ArrayList<ProyectosCasaCampestre>();
        Connection conexion = JDBCUtilities.getConnection();

        try{       

            String consulta = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad "
                            + "FROM Proyecto "
                            + "WHERE Clasificacion = 'Casa Campestre' AND Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla')";


            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos
            while(resultSet.next())
            {
                ProyectosCasaCampestre requerimiento3 = new ProyectosCasaCampestre();
                
                requerimiento3.SetIdProyecto(resultSet.getInt("Id_Proyecto"));
                requerimiento3.SetConstructora(resultSet.getString("Constructora"));
                requerimiento3.SetNumeroHabitaciones(resultSet.getInt("Numero_Habitaciones"));
                requerimiento3.SetCiudad(resultSet.getString("Ciudad"));

                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento3);
            }

            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando los proyectos de tipo Casa Campestre en Santa Marta, Cartagena y Barranquilla: " + e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }

        //Retornar la colección de vo's
        return respuesta;
    }     
}
