package pe.flace.lp_ef_lace_barreda.bean;

public class ProductoBean {
  //datos

  private String nomProd;
  private double costoProd;
  private double factorProd;
  private double porcGasAdm;
  private double porcGanancia;
  //resultado
  private double costoTotProd;
  private double gasAdm;
  private double costoTotal;
  private double gan;
  private double preVenta;
  private double prePublico;

  public ProductoBean() {

  }

  public ProductoBean(String nomProd, double costoProd, double factorProd, double porcGasAdm, double porcGanancia) {
    this.nomProd = nomProd;
    this.costoProd = costoProd;
    this.factorProd = factorProd;
    this.porcGasAdm = porcGasAdm;
    this.porcGanancia = porcGanancia;
  }

  public String getNomProd() {
    return nomProd;
  }

  public void setNomProd(String nomProd) {
    this.nomProd = nomProd;
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

  public double getPorcGasAdm() {
    return porcGasAdm;
  }

  public void setPorcGasAdm(double porcGasAdm) {
    this.porcGasAdm = porcGasAdm;
  }

  public double getPorcGanancia() {
    return porcGanancia;
  }

  public void setPorcGanancia(double porcGanancia) {
    this.porcGanancia = porcGanancia;
  }

  public double getCostoTotProd() {
    return costoTotProd;
  }

  public void setCostoTotProd(double costoTotProd) {
    this.costoTotProd = costoTotProd;
  }

  public double getGasAdm() {
    return gasAdm;
  }

  public void setGasAdm(double gasAdm) {
    this.gasAdm = gasAdm;
  }

  public double getCostoTotal() {
    return costoTotal;
  }

  public void setCostoTotal(double costoTotal) {
    this.costoTotal = costoTotal;
  }

  public double getGan() {
    return gan;
  }

  public void setGan(double gan) {
    this.gan = gan;
  }

  public double getPreVenta() {
    return preVenta;
  }

  public void setPreVenta(double preVenta) {
    this.preVenta = preVenta;
  }

  public double getPrePublico() {
    return prePublico;
  }

  public void setPrePublico(double prePublico) {
    this.prePublico = prePublico;
  }

}
