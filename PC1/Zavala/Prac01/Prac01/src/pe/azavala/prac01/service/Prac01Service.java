package pe.azavala.prac01.service;

public class Prac01Service {

  public double calcTotal(double precio, double cantidad) {

    double total;
    total = precio * cantidad;
    return total;
  }

  public double calcImporte(double total) {
    double importe;
    importe = (total) / (1.18);
    return importe;

  }

  public double calcImpuesto(double total) {
    double impuesto;
    double importe = calcImporte(total);
    impuesto = total - importe;
    return impuesto;

  }

  public double calcGanancia(double total) {
    double ganancia = calcImporte(total);
//    double ganancia2;
    if (total > 12) {

//    System.out.println("Es mayor a 12 participantes;");
      System.out.println("ganan: " + ganancia);
      ganancia = ganancia * 0.07;

    } else {
      System.out.println("Es menor a 12 :( ");
    }
    return ganancia;
  }

}
