package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.AsesorPorCiudadDao;
import model.dao.CompraPorProveedorDao;
import model.dao.ProyectosCasaCampestreDao;
import model.vo.AsesorPorCiudad;
import model.vo.CompraPorProveedor;
import model.vo.ProyectosCasaCampestre;


//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {       
    //Su codigo
    
    public ControladorRequerimientosReto4(){
        //Su codigo
    }

    public ArrayList<AsesorPorCiudad> consultarRequerimiento_1() throws SQLException {
        AsesorPorCiudadDao req = new AsesorPorCiudadDao();
        return req.requerimiento1();
    }
    
    public ArrayList<CompraPorProveedor> consultarRequerimiento_2() throws SQLException {
        CompraPorProveedorDao req = new CompraPorProveedorDao();
        return req.requerimiento2();
    }

    public ArrayList<ProyectosCasaCampestre> consultarRequerimiento_3() throws SQLException {
        ProyectosCasaCampestreDao req = new ProyectosCasaCampestreDao();
        return req.requerimiento3();
    }

}
