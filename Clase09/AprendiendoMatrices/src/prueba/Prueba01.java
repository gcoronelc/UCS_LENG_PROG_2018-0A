package prueba;

public class Prueba01 {
  
  public static void main(String[] args) {
    
    int[][] mat = new int[5][3];
    
    mostrarMatriz( mat );
    
    mat[0][0] = 70;
    
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
