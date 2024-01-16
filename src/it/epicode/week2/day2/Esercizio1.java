package src.it.epicode.week2.day2;

import java.util.HashSet;
import java.util.Scanner;

public class Esercizio1 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        stampaArray();

    }

    public static void stampaArray(){

        HashSet<String> p = new HashSet<>();
        HashSet<String> doppioni = new HashSet<>();
        System.out.println("Inserisci il numero di parole che vuoi inserire");
        int num = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < num; i++) {

            System.out.println("Inserisci la parola numero:" + (i + 1));
            String parola = scan.nextLine();
            if(!p.add(parola)){

                doppioni.add(parola);

            }
                p.add(parola);

            System.out.println(p);
            System.out.println(doppioni);
            System.out.println(p.size());
        }

    }


}
