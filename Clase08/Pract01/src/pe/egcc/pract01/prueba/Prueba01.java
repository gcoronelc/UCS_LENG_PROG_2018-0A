package pe.egcc.pract01.prueba;

import pe.egcc.pract01.service.Pract01Service;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    String categoria = "PROGRAMACION";
    int alumnos = 15;
    // Proceso
    Pract01Service pract01Service = new Pract01Service();
    double[] repo = pract01Service.procCurso(categoria, alumnos);
    // Reporte
    System.out.println("Precio: " + repo[0]);
    System.out.println("Practicipantes: " + repo[1]);
    System.out.println("Importe: " + repo[2]);
    System.out.println("Impuesto: " + repo[3]);
    System.out.println("Total: " + repo[4]);
    System.out.println("Porc. Ganancia: " + repo[5]);
    System.out.println("Ganancia: " + repo[6]);
  }
  
}
