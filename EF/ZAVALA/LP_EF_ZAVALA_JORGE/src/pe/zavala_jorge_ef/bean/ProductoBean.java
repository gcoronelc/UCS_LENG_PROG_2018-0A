/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.zavala_jorge_ef.bean;

/**
 *
 * @author ALUMNO
 */
public class ProductoBean {
  
  // Input
  private String nombreproducto;
  private int costoproduccion;
  private double factorproduccion;
  private double gastosadm;
  private double porcGanancia;

  // Output
  private double costototalproduccion;
  private double gastosadmintotal;
  private double costototal;
  private double gananciatotal;
  private double porcGananciatotal;
  private double precioventa;
  private double preciopublico;

  /**
   * Constructor por defecto
   */
  public ProductoBean() {
  
  }

    public ProductoBean(String nombreproducto, int costoproduccion, double factorproduccion, double gastosadm, double porcGanancia) {
        this.nombreproducto = nombreproducto;
        this.costoproduccion = costoproduccion;
        this.factorproduccion = factorproduccion;
        this.gastosadm = gastosadm;
        this.porcGanancia = porcGanancia;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public double getCostoproduccion() {
        return costoproduccion;
    }

    public void setCostoproduccion(int costoproduccion) {
        this.costoproduccion = costoproduccion;
    }

    public double getFactorproduccion() {
        return factorproduccion;
    }

    public void setFactorproduccion(double factorproduccion) {
        this.factorproduccion = factorproduccion;
    }

    public double getGastosadm() {
        return gastosadm;
    }

    public void setGastosadm(double gastosadm) {
        this.gastosadm = gastosadm;
    }

    public double getPorcGanancia() {
        return porcGanancia;
    }

    public void setPorcGanancia(double porcGanancia) {
        this.porcGanancia = porcGanancia;
    }

    public double getCostototalproduccion() {
        return costototalproduccion;
    }

    public void setCostototalproduccion(double costototalproduccion) {
        this.costototalproduccion = costototalproduccion;
    }

    public double getGastosadmintotal() {
        return gastosadmintotal;
    }

    public void setGastosadmintotal(double gastosadmintotal) {
        this.gastosadmintotal = gastosadmintotal;
    }

    public double getCostototal() {
        return costototal;
    }

    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }

    public double getGananciatotal() {
        return gananciatotal;
    }

    public void setGananciatotal(double gananciatotal) {
        this.gananciatotal = gananciatotal;
    }

    public double getPorcGananciatotal() {
        return porcGananciatotal;
    }

    public void setPorcGananciatotal(double porcGananciatotal) {
        this.porcGananciatotal = porcGananciatotal;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public double getPreciopublico() {
        return preciopublico;
    }

    public void setPreciopublico(double preciopublico) {
        this.preciopublico = preciopublico;
    } 
}
