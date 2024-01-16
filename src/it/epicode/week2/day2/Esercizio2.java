package src.it.epicode.week2.day2;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {

        System.out.println("Inserisci la quantità di numeri da visualizzare");
        int n = scan.nextInt();
        stampaListaOrdinata(n);
        evenOrOdd(listaDoppia(listaOrdinata), true);
        listaDoppia(listaOrdinata);

    }

    public static ArrayList<Integer> listaOrdinata = new ArrayList<>();

    private static final Scanner scan = new Scanner(System.in);

    public static ArrayList<Integer> stampaListaOrdinata(int n){

        Random nRandom = new Random();

        for (int i = 0; i < n; i++) {

            listaOrdinata.add(nRandom.nextInt(101));

        }
        Collections.sort(listaOrdinata);
        System.out.println(listaOrdinata);
        return listaOrdinata;

    }


    private static ArrayList<Integer> listaDoppia(ArrayList<Integer> arr){

        ArrayList<Integer> listaReverse = new ArrayList<>();

        for(int n:arr){

            listaReverse.add(n);

        }
        Collections.reverse(arr);

        for(int n:arr){

            listaReverse.add(n);

        }

        System.out.println(listaReverse);
        return listaReverse;

    }

    public static void evenOrOdd(ArrayList<Integer> arr, boolean b){

            for (int i = b ? 0 : 1 ; i < arr.size(); i += 2) {

                System.out.println(arr.get(i));

            }


    }

}
