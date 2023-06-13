
package agencia;

public class Carga extends Vehiculos{

    private int cargaKg;
    private int cantEjes;
    private int rodadas;
    
    public Carga(int cargaKg, int cantEjes, int rodadas, String serieMotor, String marca, String año, double precio){
        this.serieMotor=serieMotor;
        this.marca=marca;
        this.año=año;
        this.precio=precio;
        this.cantEjes=cantEjes;
        this.cargaKg=cargaKg;
        this.rodadas=rodadas;
    }
    
    @Override
    public String toString() {
        return "Vehiculo" + "\n" + "Carga en KG:" + cargaKg + "\n" + "Cantidad de Ejes:" + cantEjes + "\n" +"Cantidad Rodadas:" + rodadas + "\n" +"Numero de serie:" + serieMotor + "\n" +"Marca:" + marca + "\n" +"Año=" + año + "\n" +"Precio=" + precio ;
    }
    
    public void descuento(double precio){
        this.precio=precio*.85;
    }

    public int getCargaKg() {
        return cargaKg;
    }

    public void setCargaKg(int cargaKg) {
        this.cargaKg = cargaKg;
    }

    public int getCantEjes() {
        return cantEjes;
    }

    public void setCantEjes(int cantEjes) {
        this.cantEjes = cantEjes;
    }

    public int getRodadas() {
        return rodadas;
    }

    public void setRodadas(int rodadas) {
        this.rodadas = rodadas;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
