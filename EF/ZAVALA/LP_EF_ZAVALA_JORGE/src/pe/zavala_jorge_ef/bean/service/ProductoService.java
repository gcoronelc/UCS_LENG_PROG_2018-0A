package pe.zavala_jorge_ef.bean.service;

import pe.zavala_jorge_ef.bean.ProductoBean;

public class ProductoService {

  public ProductoBean procesarProducto(ProductoBean bean) {

    //Proceso
    double costototalprod = bean.getCostoproduccion() * bean.getFactorproduccion();
    double gastosadmtotal = costototalprod * bean.getGastosadm();
    double costototal = costototalprod + gastosadmtotal;
    double gananciatotal = costototal * bean.getPorcGanancia();
    double precioventa = costototal + gananciatotal;
    double preciopublico = precioventa * 1.18;

    //Reporte
    bean.setCostototalproduccion(costototalprod);
    bean.setGastosadmintotal(gastosadmtotal);
    bean.setCostototal(costototal);
    bean.setGananciatotal(gananciatotal);
    bean.setPrecioventa(precioventa);
    bean.setPreciopublico(preciopublico);

    return bean;

  }

}
