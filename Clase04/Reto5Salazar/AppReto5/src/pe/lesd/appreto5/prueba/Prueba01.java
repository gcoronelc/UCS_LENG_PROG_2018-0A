
package pe.lesd.appreto5.prueba;

import pe.lesd.appreto5.service.Reto05Service;

public class Prueba01 {
    
    public static void main(String[] args) {
        
        //Datos
        int n1 = 16;
        int n2 = 12;
        
        //Proceso
        Reto05Service reto05Service = new Reto05Service();
        int mcd = reto05Service.mcd(n1, n2);
        int mcm = reto05Service.mcm(n1, n2);
        //Reporte
        System.out.println("MCD:" + mcd);
        System.out.println("MCM:" + mcm);
    }
    
}
