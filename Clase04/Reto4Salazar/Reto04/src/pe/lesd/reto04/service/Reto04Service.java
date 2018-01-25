
package pe.lesd.reto04.service;


public class Reto04Service {
 
    public String multiplo (int n){
        String  condicion;
        if ((n%3==0 && n%5==0)) {
           condicion = "es multiplo de 3 y 5";
        }else if (n%3==0) {
            condicion = "es multiplo de 3";
        }else if (n%5==0) {
           condicion  = "es multiplo de 5";
        }else{
            condicion = "no es multiplo de 3 y 5";
        }
        return condicion;
    }
    
   
}
