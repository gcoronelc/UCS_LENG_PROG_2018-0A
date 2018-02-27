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
  
  public int[] obtenerRango(String tipoCliente) {
    int[] rango = null;
    switch(tipoCliente.toUpperCase()){
      case "PERSONA NATURAL":
        rango = new int[]{6,36};
        break;
      case "PERSONA JURIDICA":
        rango = new int[]{12,48};
        break;  
    }
    return rango;
  }

  public double calcInteres(String tipoCliente) {
    double interes = 0.0;
    switch(tipoCliente.toUpperCase()){
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
  
    double cuotaCapital = capital / meses;
    for (int i = 0; i < reporte.length; i++) {
      
      // Cuota actual
      ItemBean bean = new ItemBean();
      
      double cuotaInteres = capital * interes;
      double cuotaTotal = cuotaCapital + cuotaInteres;
      
      bean.setCuota(i + 1);
      bean.setCapital(cuotaCapital);
      bean.setInteres(cuotaInteres);
      bean.setTotal(cuotaTotal);
            
      reporte[i] = bean;
      
      // Siguiente Cuota
      capital -= cuotaCapital;
    }
    
    return reporte;
  }

}
