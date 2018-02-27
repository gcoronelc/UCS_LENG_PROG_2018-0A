package pe.egcc.ventasapp.bean;

public class VentaBean {

  // Input
  private String categoria;
  private String descripcion;
  private int participantes;

  // Output
  private double precio;
  private double importe;
  private double impuesto;
  private double total;
  private double porcGanancia;
  private double ganancia;

  /**
   * Constructor por defecto
   */
  public VentaBean() {
  }

  /**
   * Constructor adicional
   *
   * @param categoria
   * @param descripcion
   * @param participantes
   */
  public VentaBean(String categoria, String descripcion, int participantes) {
    this.categoria = categoria;
    this.descripcion = descripcion;
    this.participantes = participantes;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getParticipantes() {
    return participantes;
  }

  public void setParticipantes(int participantes) {
    this.participantes = participantes;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public double getImpuesto() {
    return impuesto;
  }

  public void setImpuesto(double impuesto) {
    this.impuesto = impuesto;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public double getPorcGanancia() {
    return porcGanancia;
  }

  public void setPorcGanancia(double porcGanancia) {
    this.porcGanancia = porcGanancia;
  }

  public double getGanancia() {
    return ganancia;
  }

  public void setGanancia(double ganancia) {
    this.ganancia = ganancia;
  }

}
