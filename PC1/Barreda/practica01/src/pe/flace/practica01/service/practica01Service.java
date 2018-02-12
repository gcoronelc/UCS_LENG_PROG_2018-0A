
package pe.flace.practica01.service;

public class practica01Service {
    
    public double calcTotal(int item, double parti){
        double total;
        switch(item){
            case 1:
                if(parti<=12)
                    total = parti*800*0.05;
                else
                    total = parti*800*0.07;
            break;
            case 2:
                if(parti<=12)
                    total = parti*500*0.03;
                else
                    total = parti*500*0.05;
            break;
            case 3:
                if(parti<=12)
                    total = parti*1800*0.08;
                else
                    total = parti*1800*0.10;
            break;
            default:
                if(parti<=12)
                    total = parti*1000*0.04;
                else
                    total = parti*800*0.06;
        }
        return total;
    }
    
    public double calcImporte(double total){
        //double importe = 
        return 0.0;
    }
}
