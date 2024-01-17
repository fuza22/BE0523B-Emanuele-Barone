package src.it.epicode.week2.day3;

import java.util.Comparator;
import java.util.TreeSet;

public class UsaTreeSet {

    public static void main(String[] args) {

        // Ordinatore ordinatore = new Ordinatore();

        TreeSet<String> parole = new TreeSet<>((o1, o2) -> o2.compareTo(o1));
      //    @Override
      //    public int compare(String o1, String o2) {
      //        return o2.compareTo(o1);
      //    }
      //  });  il treeset va ad ordinare in ordine alfabetico le stringhe

        parole.add("Java");
        parole.add("C++");
        parole.add("Python");
        parole.add("JavaScript");

        System.out.println(parole);

    }
}
