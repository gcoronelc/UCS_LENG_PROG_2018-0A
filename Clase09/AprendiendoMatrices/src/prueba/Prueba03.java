package prueba;

import java.util.Random;

public class Prueba03 {
  
  public static void main(String[] args) {
    
    int[][] mat = new int[10][5];
    mostrarMatriz( mat );
    /*
    llenarColumna(mat,0);
    llenarColumna(mat,1);
    llenarColumna(mat,2);
    */
    
    for(int columna = 0; columna < mat[0].length; columna++){
      llenarColumna(mat,columna);
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

  // llenar la columna columna con 
  // números aleatorios menores a 50.
  private static void llenarColumna(int[][] mat, int columa) {
    Random random = new Random();
    for (int i = 0; i < mat.length; i++) {
      int[] fila = mat[i];
      fila[columa] = random.nextInt(50);
      fila[columa] = random.nextInt(50);
      fila[columa] = random.nextInt(50);
      fila[columa] = random.nextInt(50);
      fila[columa] = random.nextInt(50);
    }
  }
  
  
}
