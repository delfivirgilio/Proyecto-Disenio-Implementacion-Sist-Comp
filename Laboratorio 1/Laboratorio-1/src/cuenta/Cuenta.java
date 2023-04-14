
package cuenta;

public class Cuenta {
    private String nombre;
    private String nroCuenta;
    private double interes;
    private double saldo;
    
    public Cuenta(){
   
}

    public String getNombre() {
        return nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cuenta(String nombre, String nroCuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }
    
   public boolean ingreso(double importe){
       if(importe>0){
           saldo+=importe;
           return true;
       }
       else{
           return false;
       }
   }
   public boolean extraccion(double importeEx){
       if(saldo>=importeEx){
           if(importeEx>0){
               saldo-=importeEx;
               return true;
           }
       }
       else {
           return false;
       }
        return false;
   }
   
   public boolean transferencia(Cuenta cuentaDestino,double importe){
       if(extraccion(importe)&& cuentaDestino.ingreso(importe)){
           return true;
       }
       else{
           return false;
       }
   }
}
       
   
   
