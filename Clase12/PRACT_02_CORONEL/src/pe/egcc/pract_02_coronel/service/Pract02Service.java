package pe.egcc.pract_02_coronel.service;

import pe.egcc.pract_02_coronel.bean.ItemBean;
import pe.egcc.pract_02_coronel.bean.PrestamoBean;

public class Pract02Service {

  public PrestamoBean procesarPrestamo( PrestamoBean bean ){
    // Proceso
    double interes = calcInteres(bean.getTipoCliente());
    ItemBean[] reporte = calcReporte(bean.getCapital(), 
            interes, bean.getMeses());
    // Reporte
    bean.setInteres(interes);
    bean.setReporte(reporte);
    return bean;
  }

  private double calcInteres(String tipoCliente) {
    double interes = 0.0;
    
    return interes;
  }

  private ItemBean[] calcReporte(double capital, double interes, int meses) {
    ItemBean[] reporte = new ItemBean[meses];
  
    // Temporal
    for (int i = 0; i < reporte.length; i++) {
      reporte[i] = new ItemBean();
    }
    
    return reporte;
  }

}
