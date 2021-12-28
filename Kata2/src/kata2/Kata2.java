package kata2;
// Se quiere obtener un histograma a partir de un array de números enteros
// Un histograma se utiliza para calcular la frecuencia con la que aparece cada valor

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
// En este ejercicio se hará uso de los wrappers: clases que permiten manipular
// tipos primitivos (como int) como si de objetos se tratasen.
    public static void main(String[] args) {
        int elementos[] = new int []{1,4,0,4,13,2,29,7,29,5,10,8,29,14,15}; 
        Map <Integer, Integer> histograma = new HashMap<>();
        // Para este enunciado se utiliza una estructura foreach
        for (int i : elementos){
            // Operador ternario. Si la clave no está, la anota
            // Si la clave está registrada, incrementa su valor.
            histograma.put(i, histograma.containsKey(i) ? histograma.get(i)+1: 1);
        }
        
        for (Integer clave : histograma.keySet()){
            System.out.println(clave + "==>" + histograma.get(clave));
        }
    }
}
