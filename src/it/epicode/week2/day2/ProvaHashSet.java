package src.it.epicode.week2.day2;

import java.util.HashSet;

public class ProvaHashSet {
    public static void main(String[] args) {
        // è un array senza indice di posizione nel quale non possono presentarsi duplicati
        HashSet<String> parole = new HashSet<>(); // verso il contenuto di un array nell'hashter

        parole.add("Milan");
        parole.add("Palermo");

        System.out.println(parole);

        for(String s:parole){

            System.out.println(s);

        }

    }


}
