
package pe.lesd.reto04.prueba;

import pe.lesd.reto04.service.Reto04Service;


public class Prueba01 {
    
    public static void main(String[] args) {
        
        //Datos
        int n = 30;
        
        //Proceso
        Reto04Service reto04Service = new Reto04Service();
        String condicion = reto04Service.multiplo(n);
        
        //Reporte
        System.out.println(condicion);
        
    }
    
}
