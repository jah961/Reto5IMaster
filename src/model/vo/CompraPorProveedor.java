package model.vo;

public class CompraPorProveedor
{
    private int IdCompra;
    private String Proveedor;
    private String Constructora;
    private String BancoVinculado;
    private String Ciudad;
    
    public int GetIdCompra()
    {
        return IdCompra;
    }
    
    public String GetProveedor()
    {
        return Proveedor;
    }
    
    public String GetConstructora()
    {
        return Constructora;
    }
    
    public String GetBancoVinculado()
    {
        return BancoVinculado;
    }
    
    public String GetCiudad()
    {
        return Ciudad;
    }
    
    public void SetIdCompra(int IdCompra)
    {
        this.IdCompra = IdCompra;
    }
    
    public void SetProveedor(String Proveedor)
    {
        this.Proveedor = Proveedor;
    }
    
    public void SetConstructora(String Constructora)
    {
        this.Constructora = Constructora;
    }
    
    public void SetBancoVinculado(String BancoVinculado)
    {
        this.BancoVinculado = BancoVinculado;
    }
    
    public void SetCiudad(String Ciudad)
    {
        this.Ciudad = Ciudad;
    }
    
}
