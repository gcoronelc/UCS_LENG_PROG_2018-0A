
package pe.lesd.practica02.prueba;

import pe.lesd.practica02.bean.ItemBean;
import pe.lesd.practica02.bean.PrestamoBean;
import pe.lesd.practica02.service.PrestamoService;


public class PruebaPrestamo {
    public static void main(String[] args) {
        //DATOS
        
        PrestamoBean bean = new PrestamoBean("PERSONA JURIDICA", 1200.0, 8);
        
        //PROCESO
        PrestamoService prestamoService = new PrestamoService();
        bean = prestamoService.procesarPrestamo(bean);
       
        
        
        //REPORTE
        System.out.println("Tipo Cliente: " + bean.getTcliente());
        System.out.println("Capital: " +  bean.getCapital());
        System.out.println("Interes: " +  bean.getInteres());
        System.out.println("Meses: " +  bean.getMeses());
        System.out.println("REPORTE: ");
        
            
        for(ItemBean item:bean.getReporte()){
            System.out.println(item.getCuota()+"\t"
                    + item.getCapital()+ "\t" 
                    + item.getInteres()+ "\t" 
                    + item.getTotal());
        }
        
       
    }
    
}
