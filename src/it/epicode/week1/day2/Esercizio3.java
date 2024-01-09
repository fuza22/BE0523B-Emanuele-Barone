package src.it.epicode.week1.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String parola;

        do {

            System.out.println("Inserisci la parola");
            parola = scan.nextLine();
            char[] lettere = parola.toCharArray();
            System.out.println(Arrays.toString(lettere));

        } while (!parola.equals(":q"));

    }
}
