package pe.egcc.reto12.service;

import java.util.Random;

public class Reto12Service {
  
  public int[] generarLista(int tamano){
    int lista[] = new int[tamano];
    Random random = new Random();
    for (int i = 0; i < lista.length; i++) {
      lista[i] = random.nextInt(50);
    }
    return lista;
  }
  
  public int elMayor(int[] lista){
    int mayor = lista[0];
    for (int i = 1; i < lista.length; i++) {
      int dato = lista[i];
      if(mayor < dato){
        mayor = dato;
      }
    }
    return mayor;
  }
  
}
