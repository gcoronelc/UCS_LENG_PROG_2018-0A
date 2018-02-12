
package pe.azavala.prac01.prueba;
import pe.azavala.prac01.service.Prac01Service;



public class Prueba01 {
        public static void main(String[] args) {
        //datos
        
        double precio = 800;
        double cantidad = 15;
        
        //proceso
        Prac01Service Prac01Service = new Prac01Service();
        double total = Prac01Service.calcTotal(precio, cantidad);
        double importe = Prac01Service.calcImporte(total);
        double impuesto = Prac01Service.calcImpuesto(total);
        double ganancia = Prac01Service.calcGanancia(cantidad);
        
        //reporte
        System.out.println("Precio: " + precio);
        System.out.println("Total: " + total);
        System.out.println("Importe: " + importe);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Ganancia:" + ganancia);
        }  
}
