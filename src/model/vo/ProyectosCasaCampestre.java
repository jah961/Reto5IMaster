package model.vo;

public class ProyectosCasaCampestre 
{
    private int IdProyecto;
    private String Constructora;
    private int NumeroHabitaciones;
    private String Ciudad;
    
    public int GetIdProyecto()
    {
        return IdProyecto;
    }

    public String GetConstructora()
    {
        return Constructora;
    }
    
    public int GetNumeroHabitaciones()
    {
        return NumeroHabitaciones;
    }
    
    public String GetCiudad()
    {
        return Ciudad;
    }
    
    public void SetIdProyecto(int IdProyecto)
    {
        this.IdProyecto = IdProyecto;
    }
    
    public void SetConstructora(String Constructora)
    {
        this.Constructora = Constructora;
    }
    
    public void SetNumeroHabitaciones(int NumeroHabitaciones)
    {
        this.NumeroHabitaciones = NumeroHabitaciones;
    }
    
    public void SetCiudad(String Ciudad)
    {
        this.Ciudad = Ciudad;
    }
}
