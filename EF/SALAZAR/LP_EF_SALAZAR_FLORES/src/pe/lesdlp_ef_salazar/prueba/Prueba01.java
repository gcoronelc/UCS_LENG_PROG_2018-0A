package pe.lesdlp_ef_salazar.prueba;

import pe.lesdlp_ef_salazar.bean.VentaBean;
import pe.lesdlp_ef_salazar.service.VentaService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    VentaBean bean = new VentaBean("Pantalon de Varon", 55.0, 1.2, 0.05, 0.8);
    // Proceso
    VentaService service = new VentaService();
    bean = service.procesarVenta(bean);
    // Reporte
    System.out.println("Costo Total de Produccion: " + bean.getCostoProd());
    System.out.println("Gastos Administrativos: " + bean.getGastosAdm());
    System.out.println("Costo total: " + bean.getTotal());
    System.out.println("Ganancia: " + bean.getGanacia());
    System.out.println("Precio Venta: " + bean.getPrecioVenta());
    System.out.println("Precio Publico: " + bean.getPrecioPublico());

  }
}
