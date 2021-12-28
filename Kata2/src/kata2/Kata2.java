package kata2;
// Para la versión 5 se busca generar un histograma con frecuencias de nombres

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
// Ahora se trabajará con clases de tipo genérico (indicado como <T>)
// La declaración de "data" ahora se hace utilizando el wrapper Integer
    public static void main(String[] args) {
        String data[] = new String []{"Marcos", "Silvia", "Eloy", "Macarena",
            "Marcos", "Eloy", "Tomate"}; 
        Histogram histo = new Histogram(data);
        // Ahora el histograma se prepara desde la clase Histogram. 
        // Antes se hacía todo en la propia clase del main
        Map<String, Integer> histogr = histo.getHistogram();
        
        // Se itera en el mapa recién creado y se muestran las keys.
        System.out.println("Apariciones en el histograma: ");
        for (String key : histogr.keySet()){
            System.out.println(key + "==>" + histogr.get(key));
        }
        // El resultado debe ser el mismo que en el ejercicio anterior
    }  
}
