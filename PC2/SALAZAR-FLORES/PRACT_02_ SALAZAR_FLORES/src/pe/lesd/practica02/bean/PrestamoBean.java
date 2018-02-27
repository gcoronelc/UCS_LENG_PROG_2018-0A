
package pe.lesd.practica02.bean;


public class PrestamoBean {
    //INPUT
    private String tcliente;
    private double capital;
    private int meses;
    
    //OUTPUT
    private double interes;
    ItemBean[] reporte;

    public PrestamoBean() {
    }

    public PrestamoBean(String tcliente, double capital, int meses) {
        this.tcliente = tcliente;
        this.capital = capital;
        this.meses = meses;
    }

    public String getTcliente() {
        return tcliente;
    }

    public void setTcliente(String tcliente) {
        this.tcliente = tcliente;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public ItemBean[] getReporte() {
        return reporte;
    }

    public void setReporte(ItemBean[] reporte) {
        this.reporte = reporte;
    }
    
    

}
