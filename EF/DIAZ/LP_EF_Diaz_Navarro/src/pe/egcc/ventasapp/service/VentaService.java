package pe.egcc.ventasapp.service;

import pe.egcc.ventasapp.bean.VentaBean;

public class VentaService {

  public VentaBean procesarVenta(VentaBean bean){
    // Proceso
    double precio = calcPrecio(bean.getCategoria());
    double total  = precio * bean.getParticipantes();
    double importe = total * 1;
    double impuesto = total *0.8;
    double porcGana = porcGanancia(bean.getCategoria(), bean.getParticipantes());
    double ganancia = importe * 4;
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
      case "PANTALON DE VARON":
        precio = 55.0;
        break;
      case "PANTALON DE NIÑO":
        precio = 45.0;
        break;
      case "POLOS":
        precio = 30.0;
        break;
      case "OTROS":
        precio = 20.0;
        break;
    }
    return precio;
  }

  private double porcGanancia(String categoria, int alumnos) {
    double porc = 0;
    // Porcentaje por defecto
    switch (categoria.toUpperCase()) {
      case "PANTALON DE VARON":
        porc = 5.0;
        break;
      case "PANTALON DE NIÑO":
        porc = 3.0;
        break;
      case "POLOS":
        porc = 2.0;
        break;
      case "OTROS":
        porc = 1.0;
        break;
    }
    // Ganancia 2
    if(alumnos>12){
      porc += 2.0;
    }
    return porc;
  }
  
}
