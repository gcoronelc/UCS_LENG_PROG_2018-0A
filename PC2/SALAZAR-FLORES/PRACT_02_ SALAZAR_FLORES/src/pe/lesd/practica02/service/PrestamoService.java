
package pe.lesd.practica02.service;


import pe.lesd.practica02.bean.ItemBean;
import pe.lesd.practica02.bean.PrestamoBean;

public class PrestamoService {
    
    
    public PrestamoBean procesarPrestamo(PrestamoBean bean){
       //PROCESO
       double interes  = calcPorcInteres(bean.getTcliente());
       ItemBean[] reporte = calcReporte(bean.getCapital(), interes, bean.getMeses());
       
       //REPORTE
       bean.setInteres(interes);
       bean.setReporte(reporte);
       return bean;  
    }

    public double calcPorcInteres(String tcliente) {
       double interes=0.0;
        if ("PERSONA NATURAL".equals(tcliente)) {
            interes=0.05;
        } else if ("PERSONA JURIDICA".equals(tcliente)) {
            interes=0.03;
        }
       return interes;
    }
    
   
    
    public ItemBean[] calcReporte(double C, double interes, int meses) {
        
      ItemBean[] reporte = new ItemBean[meses];
      
      double CM = (C/meses);//MONTO A PAGAR POR CUOTA
      double R  = C-CM;
      double CI = interes*(R);//INTERES A PAGAR POR CUOTA
      double total= CM + CI; // TOTAL A PAGAR POR CUOTA     
        
       
      for (int i = 0; i < reporte.length; i++) {
          reporte[i]= new ItemBean();
          ItemBean itemBean = reporte[i];
          itemBean.setCuota(i+1);//CUOTA POR MES
          itemBean.setCapital(CM);
          CI=C*interes;
          C=C-CM;
          total=CM+CI;
         itemBean.setInteres(CI);
         itemBean.setTotal(total);
      }
      
      return reporte;
      
    }




}
