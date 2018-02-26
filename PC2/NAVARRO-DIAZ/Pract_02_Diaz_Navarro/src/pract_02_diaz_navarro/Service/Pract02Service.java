
package pract_02_diaz_navarro.Service;

import pract_02_diaz_navarro.Bean.Itembean;
import pract_02_diaz_navarro.Bean.PrestamoBean;


public class Pract02Service {
    
    public PrestamoBean procesarPrestamo(PrestamoBean bean){
       
        
        //Proceso
        double interes = calcInteres(bean.getTipoCliente());
        Itembean [] reporte= calcReporte(bean.getCapital(),interes, bean.getMeses());
        
        bean.setInteres(interes);
        bean.setReporte(reporte);
        return bean;
    }

    private double calcInteres(String tipoCliente) {
        double interes= 0.0;
        
        return interes;
    }

    private Itembean[] calcReporte(double capital, double interes, int meses) {
        Itembean[] reporte = new Itembean[meses];
        
        
        //Temporal
        for (int i = 0; i < reporte.length; i++){
            reporte[i] = new Itembean();
        }
        
        return reporte;
    }
    
    
    
}
