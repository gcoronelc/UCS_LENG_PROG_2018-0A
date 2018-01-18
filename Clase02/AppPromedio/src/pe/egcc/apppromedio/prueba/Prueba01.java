package pe.egcc.apppromedio.prueba;

import pe.egcc.apppromedio.service.PromedioService;

public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    int nota1 = 18;
    int nota2 = 18;
    int nota3 = 10;
    int nota4 = 18;
    
    // Proceso
    PromedioService promedioService = new PromedioService();
    int notaMenor = promedioService.notaMenor(nota1, nota2, nota3, nota4);
    
    // Reporte
    System.out.println("DATOS");
    System.out.println("Nota1: " + nota1);
    System.out.println("Nota2: " + nota2);
    System.out.println("Nota3: " + nota3);
    System.out.println("Nota4: " + nota4);
    System.out.println("RESULTADO");
    System.out.println("Nota menor: " + notaMenor);
    
  }
  
}
