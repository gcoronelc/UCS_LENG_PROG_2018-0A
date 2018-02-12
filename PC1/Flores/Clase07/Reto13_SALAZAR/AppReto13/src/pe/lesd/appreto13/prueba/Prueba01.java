
package pe.lesd.appreto13.prueba;

import pe.lesd.appreto13.service.Reto13Service;

public class Prueba01 {
    
    public static void main(String[] args) {
        int tamano=5;
        Reto13Service reto13Service=new Reto13Service();
        int figo[]= reto13Service.listarNum(tamano);
        for (int i = 0; i < figo.length; i++) {
            int j = figo[i];
            System.out.println(j);
        }
    }
}
