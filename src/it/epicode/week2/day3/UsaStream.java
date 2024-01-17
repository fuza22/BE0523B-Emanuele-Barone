package src.it.epicode.week2.day3;

import src.it.epicode.week2.day2.Articolo;

import java.util.List;
import java.util.stream.Stream;

public class UsaStream {

    public static void main(String[] args) {

        List<Integer> numeri = List.of(2,5,6,9,5);

        Stream<Integer> streamNumeri = numeri.stream();
        Stream<Integer> s1 = Stream.of(3,6,7,9,3);
        Stream<String> s2 = Stream.<String>builder().add("Ciao").add("come").add("stai?").build();

        /* for(Integer i:numeri){

            if(i % 2 == 0){

                System.out.println(i);

            }
        }
*/
        streamNumeri.filter(i -> i % 2 != 0).forEach(i -> System.out.println(i)); // seleziona solo  i numeri pari
        System.out.println(numeri.stream().filter(i -> i % 2 != 0).count()); // restituisce il numero degli elementi contenuti nello stream
        System.out.println(numeri.stream().filter(i -> i % 2 != 0).sorted().toList()); // elementi della lista ordinati

        Articolo a1 = new Articolo("Mele", "Frutta", 1);
        Articolo a2 = new Articolo("Pere", "Frutta", 0.7);
        Articolo a3 = new Articolo("Banane", "Frutta", 2);

        List<Articolo> listaArticoli = List.of(a1, a2, a3);

        System.out.println(listaArticoli.stream().map(a -> a.getPrezzo()).filter(p -> p < 1).reduce(0.0, (somma, i) -> somma += i));
        System.out.println(listaArticoli.stream().map(a -> a.getPrezzo()).filter(p -> p < 1).min((p1, p2) -> (int) (p1 - p2)));


    }

}
