package pe.egcc.ventasapp.prueba;

import pe.egcc.ventasapp.bean.VentaBean;
import pe.egcc.ventasapp.service.VentaService;

public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    VentaBean bean = new VentaBean("PANTALON DE VARON","Hola", 5);
    // Proceso
    VentaService service = new VentaService();
    bean = service.procesarVenta(bean);
    // Reporte
    System.out.println("Costo de Producción: " + bean.getPrecio());
    System.out.println("Gasto Administrativo: " + bean.getParticipantes());
    System.out.println("Costo Total: " + bean.getImporte());
    System.out.println("Ganancia: " + bean.getImpuesto());
    System.out.println("Precio de Venta:" + bean.getTotal());
    System.out.println("Precio al Publico " + bean.getPorcGanancia());
  
  }
}
