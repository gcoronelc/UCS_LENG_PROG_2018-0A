package pe.lesdlp_ef_salazar.service;

import pe.lesdlp_ef_salazar.bean.VentaBean;

public class VentaService {

  public VentaBean procesarVenta(VentaBean bean) {
    // Proceso
    double costoTotalProd = calcCosto(bean.getCostoProd(), bean.getFactorProd());
    double gastosAdm = costoTotalProd * bean.getPorcgastosAdm();
    double total = costoTotalProd + gastosAdm;
    double ganacia = total * bean.getPorcganancia();
    double precioVenta = total + ganacia;
    double precioPublico = precioVenta * 1.18;
    // Reporte
    bean.setCostoProd(costoTotalProd);
    bean.setGastosAdm(gastosAdm);
    bean.setTotal(total);
    bean.setGanacia(ganacia);
    bean.setPrecioVenta(precioVenta);
    bean.setPrecioPublico(precioPublico);
    // Reporte
    return bean;

  }

  private double calcCosto(double costoProd, double factorProd) {
    double costo = 0;
    costo = costoProd * factorProd;
    return costo;
  }

}
