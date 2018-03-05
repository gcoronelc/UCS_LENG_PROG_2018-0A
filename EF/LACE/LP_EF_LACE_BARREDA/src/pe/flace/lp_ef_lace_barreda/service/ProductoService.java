package pe.flace.lp_ef_lace_barreda.service;

import pe.flace.lp_ef_lace_barreda.bean.ProductoBean;

public class ProductoService {

  public ProductoBean procesarVenta(ProductoBean bean) {
    //variables
    double costoTotalProd, gasAdm, costoTotal, gan, preVenta, prePublico;
    //proceso
    costoTotalProd = bean.getCostoProd() * bean.getFactorProd();
    gasAdm = (costoTotalProd * (bean.getPorcGasAdm() / 100));
    costoTotal = costoTotalProd + gasAdm;
    gan = costoTotal * (bean.getPorcGanancia() / 100);
    preVenta = costoTotal + gan;
    prePublico = preVenta * 1.18;
    //salida
    bean.setCostoTotProd(costoTotalProd);
    bean.setGasAdm(gasAdm);
    bean.setCostoTotal(costoTotal);
    bean.setGan(gan);
    bean.setPreVenta(preVenta);
    bean.setPrePublico(prePublico);

    return bean;
  }
}
