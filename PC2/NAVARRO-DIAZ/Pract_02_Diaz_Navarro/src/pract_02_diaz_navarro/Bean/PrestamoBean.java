/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract_02_diaz_navarro.Bean;

/**
 *
 * @author ALUMNA
 */
public class PrestamoBean {
    
    
    // Datos
    private String tipoCliente;
    private double capital;
    private int meses;
    
    
    
    
    
    
    // Resultados
    
    private double interes;
    private Itembean[] reporte;

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

    public Itembean[] getReporte() {
        return reporte;
    }

    public void setReporte(Itembean[] reporte) {
        this.reporte = reporte;
    }

    
             
       
}
