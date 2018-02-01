package pe.egcc.reto12.prueba;

import pe.egcc.reto12.service.Reto12Service;

public class Prueba01 {
  
  public static void main(String[] args) {
    // Dato
    int tamano = 5;
    // Proceso
    Reto12Service service = new Reto12Service();
    int lista[] = service.generarLista(tamano);
    int mayor = service.elMayor(lista);
    // Reporte
    for (int i = 0; i < lista.length; i++) {
      int dato = lista[i];
      System.out.println(dato);
    }
    System.out.println("MAYOR: " + mayor);
  }
  
}
