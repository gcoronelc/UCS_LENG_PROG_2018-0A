package pe.egcc.pract_02_coronel.prueba;

import pe.egcc.pract_02_coronel.bean.ItemBean;
import pe.egcc.pract_02_coronel.bean.PrestamoBean;
import pe.egcc.pract_02_coronel.service.Pract02Service;

public class Prueba02 {
  
  public static void main(String[] args) {
    
    // Datos
    PrestamoBean bean = new PrestamoBean("Persona Natural", 1200.0, 6);
    
    // Proceso
    Pract02Service service = new Pract02Service();
    bean = service.procesarPrestamo(bean);
    
    // Reporte
    System.out.println("Tipo de cliente: " + bean.getTipoCliente());
    System.out.println("Capital: " + bean.getCapital());
    System.out.println("Interes: " + bean.getInteres());
    System.out.println("Meses: " + bean.getMeses());
    System.out.println("REPORTE DE CUOTAS");
    for(ItemBean item: bean.getReporte()){
      System.out.println( 
      item.getCuota() + "\t" 
      + item.getCapital() + "\t" 
      + item.getInteres() + "\t" 
      + item.getTotal());
    }
  }
  
}
