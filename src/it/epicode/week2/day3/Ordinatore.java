package src.it.epicode.week2.day3;

import java.util.Comparator;

public class Ordinatore implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) { // è un metodo che restituisce un numero, se il segno è positivo, la stringa viene dopo la stringa passata come parametro di ingresso, il valore che restituisce rappresenta la distanza in lettere tra la prima lettera delle due parole che è diversa
        return o2.compareTo(o1);
    }
}
