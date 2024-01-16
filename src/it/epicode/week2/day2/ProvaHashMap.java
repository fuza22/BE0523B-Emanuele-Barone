package src.it.epicode.week2.day2;

import java.util.HashMap;
import java.util.Set;

public class ProvaHashMap {

    public static void main(String[] args) {

        HashMap<Integer, Articolo> inventario = new HashMap<>(); // creata una mappa che dovrà avere una chiave ed un valore, cioe un codice identificativo e l'articolo corrispondente, la chiave è mappata come integer, l'articolo come oggetto articolo

        Articolo a1 = new Articolo("Mele", "Frutta", 1);
        Articolo a2 = new Articolo("Pere", "Frutta", 3);
        Articolo a3 = new Articolo("Banane", "Frutta", 2);

        inventario.put(1, a1); // assegno ad ogni articolo una chiave identificativa
        inventario.put(2, a2);
        inventario.put(3, a3);

        inventario.containsKey(1); // verifica se la mappa contiene una chiave
        inventario.containsValue(a3); // verifica se la mappa contiene il valore a3

        Articolo a = inventario.get(1); // get permette di estrarre il valore inserendo la chiave, è l'unico modo di effettuare una ricerca all'interno di una mappa
        System.out.println(a);

        Set<Integer> chiavi = inventario.keySet(); // permette di estrarre un set di tutte le chiavi della mappa, solo le chiavi
        System.out.println(chiavi);

        for(Integer c:chiavi){ // ciclo sul set di chiavi con un ciclo avanzato, per ogni chiave che estratto entro nella mappa ed estraggo l'articolo associato

            System.out.println(inventario.get(c));

        }

    }

}
