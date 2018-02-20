package pe.egcc.ventasapp.service;

import pe.egcc.ventasapp.bean.VentaBean;

public class VentaService {

  public VentaBean procesarVenta(VentaBean bean){
    // Proceso
    double precio = calcPrecio(bean.getCategoria());
    double total  = precio * bean.getParticipantes();
    double importe = total / 1.18;
    double impuesto = total - importe;
    double porcGana = porcGanancia(bean.getCategoria(), bean.getParticipantes());
    double ganancia = importe * porcGana / 100;
    // Reporte
    bean.setPrecio(precio);
    bean.setTotal(total);
    bean.setImporte(importe);
    bean.setImpuesto(impuesto);
    bean.setPorcGanancia(porcGana);
    bean.setGanancia(ganancia);
    // Reporte
    return bean;
  }
  
  private double calcPrecio(String categoria) {
    double precio = 0.0;
    switch (categoria.toUpperCase()) {
      case "PROGRAMACION":
        precio = 800.0;
        break;
      case "OFIMATICA":
        precio = 500.0;
        break;
      case "ADMINISTRACION":
        precio = 1800.0;
        break;
      case "OTROS":
        precio = 1000.0;
        break;
    }
    return precio;
  }

  private double porcGanancia(String categoria, int alumnos) {
    double porc = 0;
    // Porcentaje por defecto
    switch (categoria.toUpperCase()) {
      case "PROGRAMACION":
        porc = 5.0;
        break;
      case "OFIMATICA":
        porc = 3.0;
        break;
      case "ADMINISTRACION":
        porc = 8.0;
        break;
      case "OTROS":
        porc = 4.0;
        break;
    }
    // Ganancia 2
    if(alumnos>12){
      porc += 2.0;
    }
    return porc;
  }
  
}
