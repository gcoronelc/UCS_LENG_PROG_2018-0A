package pe.egcc.platacomocancha.bean;

public class ItemBean {

  private String descripcion;
  private int valor;
  private int cant;
  private int total;

  public ItemBean() {
  }

  public ItemBean(String descripcion, int valor, int cant, int total) {
    this.descripcion = descripcion;
    this.valor = valor;
    this.cant = cant;
    this.total = total;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public int getCant() {
    return cant;
  }

  public void setCant(int cant) {
    this.cant = cant;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

}
