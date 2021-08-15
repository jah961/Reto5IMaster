package model.vo;

public class AsesorPorCiudad 
{
    private int IdLider; 
    private String Nombre; 
    private String CiudadResidencia;
    
    public int GetIdLider()
    {
        return IdLider;
    }
    
    public String GetNombre()
    {
        return Nombre;
    }
    
    public String GetCiudadResidencia()
    {
        return CiudadResidencia;
    }
    
    public void SetIdLider(int IdLider){
        this.IdLider = IdLider; 
    }
    
    public void SetNombre(String Nombre){
        this.Nombre = Nombre; 
    }
        
    public void SetCiudadResidencia(String CiudadResidencia){
        this.CiudadResidencia = CiudadResidencia; 
    }
}
