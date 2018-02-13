package pe.egcc.pract01.service;

public class Pract01Service {

  public double[] procCurso(String categoria, int alumnos) {
    double[] repo = new double[7];
    repo[0] = calcPrecio(categoria); // Precio
    repo[1] = alumnos; // Participantes
    repo[4] = repo[0] * repo[1]; // Total
    repo[2] = repo[4] / 1.18; // Importe
    repo[3] = repo[4] - repo[2]; // Impuesto
    repo[5] = porcGanancia(categoria, alumnos); // Porcentaje Ganancia
    repo[6] = repo[2] * repo[5] / 100;
    return repo;
  }

  private double calcPrecio(String categoria) {
    double precio = 0.0;
    switch (categoria.toUpperCase()) {
      case "PROGRAMACION":
        precio = 800.0;
        break;
      case "OFIMATICA":
        precio = 500.0;
        break;
      case "ADMINISTRACION":
        precio = 1800.0;
        break;
      case "OTROS":
        precio = 1000.0;
        break;
    }
    return precio;
  }

  private double porcGanancia(String categoria, int alumnos) {
    double porc = 0;
    // Porcentaje por defecto
    switch (categoria.toUpperCase()) {
      case "PROGRAMACION":
        porc = 5.0;
        break;
      case "OFIMATICA":
        porc = 3.0;
        break;
      case "ADMINISTRACION":
        porc = 8.0;
        break;
      case "OTROS":
        porc = 4.0;
        break;
    }
    // Ganancia 2
    if(alumnos>12){
      porc += 2.0;
    }
    return porc;
  }

}
