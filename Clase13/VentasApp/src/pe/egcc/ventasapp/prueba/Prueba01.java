package pe.egcc.ventasapp.prueba;

import pe.egcc.ventasapp.bean.VentaBean;
import pe.egcc.ventasapp.service.VentaService;

public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    VentaBean bean = new VentaBean("programacion", "Prog. con Java", 15);
    // Proceso
    VentaService service = new VentaService();
    bean = service.procesarVenta(bean);
    // Reporte
    System.out.println("Precio: " + bean.getPrecio());
    System.out.println("Practicipantes: " + bean.getParticipantes());
    System.out.println("Importe: " + bean.getImporte());
    System.out.println("Impuesto: " + bean.getImpuesto());
    System.out.println("Total: " + bean.getTotal());
    System.out.println("Porc. Ganancia: " + bean.getPorcGanancia());
    System.out.println("Ganancia: " + bean.getGanancia());
  }
}
