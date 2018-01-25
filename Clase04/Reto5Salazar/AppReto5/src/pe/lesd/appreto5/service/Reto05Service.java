
package pe.lesd.appreto5.service;

public class Reto05Service {
    
    public static int mcd (int n1, int n2){
        int mcd;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        do{
            mcd=b;
            b=a%b;
            a=mcd;
        }while (b!=0) ;            
            return mcd;
            
    }
    
    public static int mcm (int n1, int n2){
        int mcm;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        mcm=(a/mcd(a,b))*b;
        return mcm;
    }
    
}
