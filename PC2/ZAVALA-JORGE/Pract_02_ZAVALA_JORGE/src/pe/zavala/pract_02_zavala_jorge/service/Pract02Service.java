
package pe.zavala.pract_02_zavala_jorge.service;

import java.util.HashSet;
import java.util.Set;
import pe.zavala.pract_02_zavala_jorge.bean.ItemBean;
import pe.zavala.pract_02_zavala_jorge.bean.PrestamoBean;


public class Pract02Service {
     
    public PrestamoBean procesarPrestamo ( PrestamoBean bean){
    
    // Proceso
    double interes = calcInteres(bean.getTipoCliente());
    ItemBean[] reporte = calcReporte(bean.getCapital(), interes, bean.getMeses());
    
    // Reporte
    bean.setInteres(interes);
    bean.setReporte(reporte);
    
    return bean;    
    }

    private double calcInteres(String tipoCliente) {
        double interes = 0.0;
        switch(tipoCliente.toUpperCase())
        {
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
      reporte[i].setCuota(i+1);
      reporte[i].setCapital(capital/meses) ;
      
      reporte[i].setInteres(calcInteres("PERSONA NATURAL")*capital);
      reporte[i].setTotal(interes+capital);
      
    }
        
        return reporte;
    }

}
            
            
    
