
package agencia;


public class CPasajeros extends Vehiculos {
    
    private int cantPasajeros;

    public CPasajeros(int cantPasajeros, String serieMotor, String marca, String año, double precio) {
        this.cantPasajeros = cantPasajeros;
        this.serieMotor=serieMotor;
        this.marca=marca;
        this.año=año;
        this.precio=precio;
    }
    
    public void descuento(double precio){
        this.precio=precio*0.70;
    }

    @Override
    public String toString() {
        return "Vehiculo" + "\n" + "Cantidad de Pasajeros:" + cantPasajeros + "\n" +  "Numero de serie:" +  serieMotor + "\n" + "Marca:"
                + marca + "\n" + "Año:" + año + "\n" + "Precio:" + precio;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getVehiculoID() {
        return vehiculoID;
    }

    public void setVehiculoID(int vehiculoID) {
        this.vehiculoID = vehiculoID;
    }

  

    public String getSerieMotor() {
        return serieMotor;
    }

    public void setSerieMotor(String serieMotor) {
        this.serieMotor = serieMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void descuento() {
        
    }

}
