package pe.egcc.platacomocancha.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pe.egcc.platacomocancha.bean.ItemBean;

public class PlataService {

  public ItemBean[] descomponer(int importe) {
    ItemBean[] repo = crearArreglo();
    
    for (ItemBean item : repo) {
      
      // Fila actual
      int cant = importe / item.getValor();
      int total = cant * item.getValor();
      
      item.setCant(cant);
      item.setTotal(total);
      
      // Siguiente fila
      importe -= total;
      
    }
    
    repo = filtarItems( repo );
    
    return repo;
  }

  private ItemBean[] crearArreglo() {
    ItemBean[] repo = {
      new ItemBean("Billetes de 200", 200, 0, 0),
      new ItemBean("Billetes de 100", 100, 0, 0),
      new ItemBean("Billetes de 50", 50, 0, 0),
      new ItemBean("Billetes de 20", 20, 0, 0),
      new ItemBean("Billetes de 10", 10, 0, 0),
      new ItemBean("Monedas de 5", 5, 0, 0),
      new ItemBean("Monedas de 2", 2, 0, 0),
      new ItemBean("Monedas de 1", 1, 0, 0)
    };
    return repo;
  }

  private ItemBean[] filtarItems(ItemBean[] repo) {
    List<ItemBean> lista = new ArrayList<>();
    for (ItemBean item : repo) {
      if(item.getTotal() > 0){
        lista.add(item);
      }
    }
    return lista.toArray(new ItemBean[0]);
  }

}
