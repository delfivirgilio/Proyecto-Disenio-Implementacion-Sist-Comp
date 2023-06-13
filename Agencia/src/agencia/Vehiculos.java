
package agencia;


public abstract class Vehiculos {
    
    protected int vehiculoID;
    protected String serieMotor;
    protected String marca;
    protected String año;
    protected double precio;
    
    public abstract void descuento(double precio);

    public int getVehiculoID() {
        return vehiculoID;
    }

   

    public String getSerieMotor() {
        return serieMotor;
    }

    public String getMarca() {
        return marca;
    }

    public String getAño() {
        return año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setVehiculoID(int vehiculoID) {
        this.vehiculoID = vehiculoID;
    }

  

    public void setSerieMotor(String serieMotor) {
        this.serieMotor = serieMotor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    
    
}
