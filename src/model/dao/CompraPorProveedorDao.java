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
import model.vo.CompraPorProveedor;

public class CompraPorProveedorDao {
   
    public ArrayList<CompraPorProveedor> requerimiento2() throws SQLException 
    {
         ArrayList<CompraPorProveedor> respuesta = new ArrayList<CompraPorProveedor>();
        Connection conexion = JDBCUtilities.getConnection();

        try{       

            String consulta = "SELECT c.Id_Compra, c.Proveedor, p.Constructora, p.Banco_Vinculado, p.Ciudad FROM Proyecto p INNER JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto WHERE p.Ciudad = 'Salento' AND c.Proveedor = 'Homecenter'";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos
            while(resultSet.next()){
                CompraPorProveedor requerimiento2 = new CompraPorProveedor();
                
                requerimiento2.SetIdCompra(resultSet.getInt("Id_Compra"));
                requerimiento2.SetProveedor(resultSet.getString("Proveedor"));
                requerimiento2.SetConstructora(resultSet.getString("Constructora"));
                requerimiento2.SetBancoVinculado(resultSet.getString("Banco_Vinculado"));
                requerimiento2.SetCiudad(resultSet.getString("Ciudad"));
  
                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento2);
            }

            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando las compras por proyecto ubicados en la ciudad de Salento cuyo proveedor es Homecenter: " + e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }

        //Retornar la colección de vo's
        return respuesta;
    }
        
}
