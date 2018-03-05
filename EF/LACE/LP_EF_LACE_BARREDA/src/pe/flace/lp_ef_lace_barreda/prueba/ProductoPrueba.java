package pe.flace.lp_ef_lace_barreda.prueba;

import pe.flace.lp_ef_lace_barreda.bean.ProductoBean;
import pe.flace.lp_ef_lace_barreda.service.ProductoService;

public class ProductoPrueba {
    
    public static void main(String[] args) {
        
        //datos
        String producto = "Pantalon de Varon";
        double costProd = 55.0;
        double factorProd = 1.2;
        double porcGasAdm = 5;
        double porcGanancia = 80;
        
        ProductoBean bean = new ProductoBean(producto,costProd,factorProd,porcGasAdm,porcGanancia);
        
        //proceso
        ProductoService service = new ProductoService();
        bean = service.procesarVenta(bean);
        
        //reporte
        System.out.println("Costo total de produccion: " + bean.getCostoTotProd());
        System.out.println("Gastos Administrativos: " + bean.getGasAdm());
        System.out.println("Costo Total: " + bean.getCostoTotal());
        System.out.println("Ganancia: " + bean.getGan());
        System.out.println("Precio de Venta: " + bean.getPreVenta());
        System.out.println("Precio al Publico: " + bean.getPrePublico());
    }
}
