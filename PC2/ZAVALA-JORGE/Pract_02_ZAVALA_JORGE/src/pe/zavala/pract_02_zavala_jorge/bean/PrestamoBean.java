
package pe.zavala.pract_02_zavala_jorge.bean;


public class PrestamoBean {
    // Datos
    private String tipoCliente;
    private double capital;
    private int meses;
       
    
    // Resultado
    private double interes;
    private ItemBean[] reporte;


public PrestamoBean() {

}

    public PrestamoBean(String tipoCliente, double capital, int meses) {
        this.tipoCliente = tipoCliente;
        this.capital = capital;
        this.meses = meses;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
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
   

