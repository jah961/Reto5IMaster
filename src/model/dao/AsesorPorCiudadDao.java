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
import model.vo.AsesorPorCiudad;

public class AsesorPorCiudadDao {
    
    public ArrayList<AsesorPorCiudad> requerimiento1() throws SQLException {
        ArrayList<AsesorPorCiudad> respuesta = new ArrayList<AsesorPorCiudad>();
        Connection conexion = JDBCUtilities.getConnection();

        try{       

            String consulta = "SELECT ID_Lider, Nombre || ' ' || Primer_Apellido Nombre, Ciudad_Residencia FROM Lider WHERE Cargo = 'Asesor' Order By Ciudad_Residencia ASC";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos
            while(resultSet.next()){
                
                AsesorPorCiudad requerimiento1 = new AsesorPorCiudad();
  
                requerimiento1.SetIdLider(resultSet.getInt("ID_Lider"));
                requerimiento1.SetNombre(resultSet.getString("Nombre"));
                requerimiento1.SetCiudadResidencia(resultSet.getString("Ciudad_Residencia"));
  
                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento1);
            }

            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando la información de los asesores: " + e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }

        //Retornar la colección de vo's
        return respuesta;
    }
    
}
