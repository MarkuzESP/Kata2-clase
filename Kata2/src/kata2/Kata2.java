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
        // Aunque existen varias formas de leer estos elementos para el mapa...
        // ... en este caso se utiliza la siguiente estructura for
        for (int i = 0; i < elementos.length; i++){
            int valor = elementos[i];
            // Se recoge cada elemento para introducirlo en el histograma.
             if (histograma.get(valor) == null){
                // Se añade un elemento al histograma si NO está registrado.
                histograma.put(valor, 1);
            } else {
                // Para un elemento ya registrado, sumar una aparición
                histograma.put(valor, histograma.get(valor)+1);
            }
        }  
        
        for (Integer clave : histograma.keySet()){
            System.out.println(clave + "==>" + histograma.get(clave));
        }
    }
}
