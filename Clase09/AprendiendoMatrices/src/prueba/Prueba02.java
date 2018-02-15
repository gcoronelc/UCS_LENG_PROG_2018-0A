package prueba;

import java.util.Random;

public class Prueba02 {
  
  public static void main(String[] args) {
    
    int[][] mat = new int[5][3];
    mostrarMatriz( mat );
    
    // llenar la primera columna con 
    // números aleatorios menores a 50.
    Random random = new Random();
    for (int i = 0; i < mat.length; i++) {
      int[] fila = mat[i];
      fila[0] = random.nextInt(50);
      fila[0] = random.nextInt(50);
      fila[0] = random.nextInt(50);
      fila[0] = random.nextInt(50);
      fila[0] = random.nextInt(50);
    }
    
    System.out.println("------------------");
    mostrarMatriz( mat );

  }

  private static void mostrarMatriz(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
      
      int[] fila = mat[i];
      System.out.print("Fila " + i + ": ");
      
      for (int j = 0; j < fila.length; j++) {
        int dato = fila[j];
        System.out.print(dato + "\t");
      }
      System.out.println();
      
    }
  }
}
