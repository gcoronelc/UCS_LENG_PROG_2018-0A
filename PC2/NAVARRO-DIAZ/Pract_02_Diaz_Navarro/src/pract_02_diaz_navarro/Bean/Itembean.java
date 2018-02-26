
package pract_02_diaz_navarro.Bean;


public class Itembean {
    
    
    
    private int cuota;
    private double capital;
    private double interes;
    private double total;

    public Itembean() {
        
    }
    
    public Itembean(int cuota, double capital, double interes, double total) {
        this.cuota = cuota;
        this.capital = capital;
        this.interes = interes;
        this.total = total;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
