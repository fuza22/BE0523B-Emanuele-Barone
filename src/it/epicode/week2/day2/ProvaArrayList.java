package src.it.epicode.week2.day2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProvaArrayList {

    public static void main(String[] args) {

        // ArrayList lista = new ArrayList(); si allunga in automatico, non dobbiamo inserire una lunghezza massima come gli array
        // hanno la logica delle collection, ma utilizzano array per memorizzare i dati, per accedere alle posizioni si usa l'indice
        // a differenza degli array non viene indicato il tipo di dati contenuto nell'arraylist, come scritto sopra
        // verranno estratti come object

        ArrayList<String> lista = new ArrayList(); // tutti gli elementi che entrano sono di tipo stringa


        /*
        Queste classi sono il corrispondente dei primitivi e vengono utilizzate nella sintassi delle collection

        Integer
        Byte
        Short
        Long
        Double
        Float
        Boolean
        Character

         */

        // COME METTERE I DATI NELLA LISTA DI STRINGHE

        lista.add("Milan");
        lista.add("Palermo");
        lista.add("Cagliari");
        lista.add("Udinese");


        //ESTRARRE DATI DALLA LISTA

        String s = lista.get(2);
        System.out.println(s);
        System.out.println(lista.size()); // indica la lunghezza della lista
        // lista.clear(); cancella tutti gli elementi della lista

        lista.indexOf("Palermo"); // diamo l'elemento e ci torna l'indice dell'elemento
        lista.isEmpty(); // mi dice se la lista è vuota
        lista.remove(2); // rimuove un elemento dalla lista
        lista.remove("Palermo"); // si puo rimuovere anche inserendo direttamente il nome dell'elemento

        lista.set(1, "Milan"); // verrà inserito all'indice 1 il milan
        lista.toString(); // trasforma in stringa la lista
        Object[] parola = lista.toArray(); // restituisce un array di object che contiene gli elementi della lista

        String[] squadre = new String[5]; // in questo modo restituisce un array di stringhe
        lista.toArray(squadre);

        for(int i = 0; i < lista.size(); i++){ // per il ciclo for si procede in questa maniera

            System.out.println(lista.get(i));

        }

        for(String x:lista){

            System.out.println(x);

        }

        // LINKED LIST

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Prova"); // aggiunge un elemento all'inizio
        linkedList.addLast("Prova"); // aggiunge un elemento alla fine
        linkedList.getFirst();
        linkedList.getLast();

        linkedList.pollFirst(); // prende l'elemento e lo cancella dalla lista

    }

}
