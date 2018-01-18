package pe.egcc.apppromedio.service;

public class PromedioService {
  
  public int notaMenor(int nota1, int nota2, int nota3, int nota4){
    int menor;
    menor = Math.min(nota1, nota2);
    menor = Math.min(menor, nota3);
    menor = Math.min(menor, nota4);
    return menor;
  }
  
}
