package kata2;
// Se quiere obtener un histograma a partir de un array de números enteros
// Un histograma se utiliza para calcular la frecuencia con la que aparece cada valor

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
// En este ejercicio se hará uso de los wrappers: clases que permiten manipular
// tipos primitivos (como int) como si de objetos se tratasen.
    public static void main(String[] args) {
        int data[] = new int []{1,4,0,4,13,2,29,7,29,5,10,8,29,14,15}; 
        Histogram histo = new Histogram(data);
        // Ahora el histograma se prepara desde la clase Histogram. 
        // Antes se hacía todo en la propia clase del main
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        // Se itera en el mapa recién creado y se muestran las keys.
        for (Integer key : histogr.keySet()){
            System.out.println(key + "==>" + histogr.get(key));
        }
        // El resultado debe ser el mismo que en el ejercicio anterior
    }  
}
