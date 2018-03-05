
package pe.zavala_jorge_ef.bean.prueba;

import pe.zavala_jorge_ef.bean.ProductoBean;
import pe.zavala_jorge_ef.bean.service.ProductoService;


public class Prueba {
    
    public static void main(String[] args) {
        //Datos
        ProductoBean bean = new ProductoBean("Pantalon",55,1.2,0.05,0.80);
        
        //Proceso
        ProductoService service = new ProductoService();
        bean = service.procesarProducto(bean);
        
        //Reporte
        System.out.println("DATOS");
//        System.out.println("Nombre del Producto:" + nombreproducto); 
        System.out.println("Costo Total de Producción: " + bean.getCostototalproduccion());
        System.out.println("Gastos Administrativos: " + Math.round(bean.getGastosadmintotal()*100)/100);
        System.out.println("Costo Total: " + bean.getCostototal());
        System.out.println("Ganancia: " + bean.getGananciatotal());
        System.out.println("Precio de Venta: " + bean.getPrecioventa());
        System.out.println("Precio al público: " + bean.getPreciopublico());
        
        
    }
}
