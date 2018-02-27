package pe.egcc.platacomocancha.prueba;

import pe.egcc.platacomocancha.bean.ItemBean;
import pe.egcc.platacomocancha.service.PlataService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Dato
    int importe = 1578;
    
    // Proceso
    PlataService service = new PlataService();
    ItemBean[] repo = service.descomponer(importe);
    
    // Reporte
    for (ItemBean item : repo) {
      
      System.out.println(item.getDescripcion() 
      + "\t" + item.getValor() 
      + "\t" + item.getCant()
      + "\t" + item.getTotal());
    }
    
  }
  
}
