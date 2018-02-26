/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract_02_diaz_navarro.Prueba;

import pract_02_diaz_navarro.Bean.Itembean;
import pract_02_diaz_navarro.Bean.PrestamoBean;
import pract_02_diaz_navarro.Service.Pract02Service;

public class Prueba2 {

  public static void main(String[] args) {

    //datos
    PrestamoBean bean = new PrestamoBean("Personal Natural", 1200.0, 6);

    //Proceso
    Pract02Service service = new Pract02Service();
    bean = service.procesarPrestamo(bean);

    //Reporte
    System.out.println("Tipo Cliente : " + bean.getTipoCliente());
    System.out.println("Capital : " + bean.getCapital());
    System.out.println("Interes : " + bean.getInteres());
    System.out.println("Meses : " + bean.getMeses());
    System.out.println("Reporte de Cuotas ");
    for (Itembean item : bean.getReporte()) {
      System.out.println(
              item.getCuota() + "\t"
              + item.getCapital() + "\t"
              + item.getInteres() + "\t"
              + item.getTotal());
    }

  }

}
