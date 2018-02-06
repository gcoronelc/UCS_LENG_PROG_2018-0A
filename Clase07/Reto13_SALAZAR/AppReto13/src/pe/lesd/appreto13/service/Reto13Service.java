
package pe.lesd.appreto13.service;


public class Reto13Service {
    
    public int[] listarNum(int tamano){
        int lista[] = new  int[tamano];
        for (int i = 0; i < lista.length ; i++) { 
          switch (i) {
            case 0:
              lista[i]=0;
              break;
            case 1:
              lista[i]=1;
              break;
            default:
              lista[i]=lista[i-1] + lista[i-2];
              break;
          }
        }
        return lista;
    }
    
}
