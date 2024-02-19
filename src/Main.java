//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Metodo 1
        Map<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("PA", "Palermo");
        hashMap1.put("NA", "Napoli");
        hashMap1.put("BO", "Bologna");

        // Stampa il contenuto di HashMap1
        System.out.println("Contenuto di hashMap1: " + hashMap1);


        // Metodo 2
        Map<String, String> hashMap2 = Map.of("PA", "Palermo", "NA", "Napoli", "BO", "Bologna");

        // Stampa il contenuto di HashMap2
        System.out.println("Contenuto di hashMap2: " + hashMap2);


        // Metodo 3
        Map<String, String> hashMap3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("PA", "Palermo"),
                new AbstractMap.SimpleEntry<>("NA", "Napoli"),
                new AbstractMap.SimpleEntry<>("BO", "Bologna")
        );

        // Stampa il contenuto di HashMap3
        System.out.println("Contenuto di hashMap3: " + hashMap3);


    }

}