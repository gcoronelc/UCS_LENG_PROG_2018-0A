package pe.egcc.appreto05.service;

public class Reto05Service {
  
  public int calcMcd(int n1, int n2){
    while(n1 != n2){
      if(n1 > n2){
        n1 -= n2;
      } else {
        n2 -= n1;
      }
    }
    return n1;
  }
  
  public int calcMcm(int n1, int n2){
    int mcm = n1 * n2 / calcMcd(n1, n2);
    return mcm;
  }
  
}
