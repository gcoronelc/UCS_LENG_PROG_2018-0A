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

  private double calcInteres(String tipoPersona) {
    double interes = 0.0;
    switch (tipoPersona.toUpperCase()) {
      case "PERSONA NATURAL":
        interes = 0.05;
        break;
      case "PERSONA JURIDICA":
        interes = 0.03;
        break;
    }
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

  public double[] procCurso(String tipoPersona, double capital, double interes, int meses) {
    double[] repo = new double[meses];
    repo[0] = calcInteres(tipoPersona); // cuota
    repo[1] = capital/meses; // capital
    repo[2] = repo[1] * repo[0]/100; // interes
    repo[3] = repo[1] + repo[2] ; // total
    return repo;
  }
}
