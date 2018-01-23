
package appreto03.prueba;

import appreto03.service.Reto03Service;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prueba01 {
    
    public static void main(String[] args) {
        
        //Datos
        double precio=100;
        double cantidad=2;
        
        //Proceso
        Reto03Service reto03Service = new Reto03Service();
        double total = reto03Service.calcularTotal(precio, cantidad);
        double importe = reto03Service.calcularImporte(total);   
        double impuesto = reto03Service.calcularImpuesto(total);
        
         // Reporte
         System.out.println("DATOS");
         System.out.println("Precio:" + precio);
         System.out.println("Cantidad:" + cantidad);
         System.out.println("Total: " + total);
         System.out.println("Importe: " + Redondear(importe, 4));
         System.out.println("Impuesto:" + Redondear(impuesto,4));
    }
    
      public static BigDecimal Redondear(double valor,int digitos){
      String val = valor+"";
      BigDecimal big = new BigDecimal(val);
      big = big.setScale(digitos, RoundingMode.HALF_UP);
      return big;
    }
    
}
