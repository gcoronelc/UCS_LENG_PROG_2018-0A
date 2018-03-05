
package pe.lesdlp_ef_salazar.bean;


public class VentaBean {
    
  // Input
  private String producto;
  private double costoProd;
  private double factorProd;
  private double porcgastosAdm;
  private double porcganancia;

  // Output
  private double costoTotalProd;
  private double gastosAdm;
  private double total;
  private double ganacia;
  private double precioVenta;
  private double precioPublico;


    public VentaBean() {
    }

    public VentaBean(String producto, double costoProd, double factorProd, double porcgastosAdm, double porcganancia) {
        this.producto = producto;
        this.costoProd = costoProd;
        this.factorProd = factorProd;
        this.porcgastosAdm = porcgastosAdm;
        this.porcganancia = porcganancia;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getCostoProd() {
        return costoProd;
    }

    public void setCostoProd(double costoProd) {
        this.costoProd = costoProd;
    }

    public double getFactorProd() {
        return factorProd;
    }

    public void setFactorProd(double factorProd) {
        this.factorProd = factorProd;
    }

    public double getPorcgastosAdm() {
        return porcgastosAdm;
    }

    public void setPorcgastosAdm(double porcgastosAdm) {
        this.porcgastosAdm = porcgastosAdm;
    }

    public double getPorcganancia() {
        return porcganancia;
    }

    public void setPorcganancia(double porcganancia) {
        this.porcganancia = porcganancia;
    }

    public double getCostoTotalProd() {
        return costoTotalProd;
    }

    public void setCostoTotalProd(double costoTotalProd) {
        this.costoTotalProd = costoTotalProd;
    }

    public double getGastosAdm() {
        return gastosAdm;
    }

    public void setGastosAdm(double gastosAdm) {
        this.gastosAdm = gastosAdm;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getGanacia() {
        return ganacia;
    }

    public void setGanacia(double ganacia) {
        this.ganacia = ganacia;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(double precioPublico) {
        this.precioPublico = precioPublico;
    }

    
    
  
    
    
}
