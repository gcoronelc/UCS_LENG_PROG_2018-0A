
package pract1.service;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class service {
    
 public double calcularTotal (double precio, double cantidad){
        double total = precio*cantidad;
        return Redondear(total, 2).doubleValue();       
    }
 
  public double calcularImporte (double total){
        double importe= total/(1.18) ;
        return Redondear(importe, 2).doubleValue();
    }
  
   public double calcularImpuesto (double total){
        double importe=calcularImporte(total);
        double impuesto= total - importe;
        return Redondear(impuesto, 2).doubleValue();
    }
  
    public static BigDecimal Redondear(double valor,int digitos){
      String val = valor+"";
      BigDecimal big = new BigDecimal(val);
      big = big.setScale(digitos, RoundingMode.HALF_UP);
      return big;
    }
  
  
  
  
}
