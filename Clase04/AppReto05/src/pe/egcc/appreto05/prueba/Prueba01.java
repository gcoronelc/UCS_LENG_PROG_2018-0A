package pe.egcc.appreto05.prueba;

import pe.egcc.appreto05.service.Reto05Service;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    int n1 = 15;
    int n2 = 20;
    // Proceso
    Reto05Service reto05Service = new Reto05Service();
    int mcd = reto05Service.calcMcd(n1, n2);
    int mcm = reto05Service.calcMcm(n1, n2);
    // Reporte
    System.out.println("DATOS");
    System.out.println("N1: " + n1);
    System.out.println("N2: " + n2);
    System.out.println("RESPUESTA");
    System.out.println("MCD: " + mcd);
    System.out.println("MCM: " + mcm);
  }
  
}
