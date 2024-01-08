package src.it.epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {

    public static void main(String[] args){

        //oggetto di tipo scanner


        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero"); // frase per segnalare che si attende un input

        int j = scanner.nextInt();

        System.out.println(j); // lo scanner è un metodo bloccante finchè non riceve qualcosa

        scanner.nextLine();

        System.out.println("Inserisci una parola");

        String parola = scanner.nextLine(); //next prende solo la prima parola scritta, nextLine tutta la frase

        System.out.println(parola.length());

        // commento su una riga

        /*
            commento su più righe
         */

        /**
         * commento javadoc
         *
         *
         *
         *
         */


        int x;

        x=8;

        int y = 0;

        final int r = 6; // la variabile r è di tipo final di tipo intero, il suo valore non puo piu cambiare

        boolean b = true;

        char c = 'e'; //singolo apice

        byte w = 6;

        short s = 9;

        long g = 1000000000;

        float f = 3.5f; // facendo il casting non va in errore

        double d = 3.6;

        String frase = "Hello world"; //doppio apice

        String frase2 = "Epicode";

        String fraseConcatenata = frase + frase2;

        System.out.println(fraseConcatenata); //stampare il risultato in console


        int z = s;

        float f2 = z;

        System.out.println(z);

        System.out.println(f2);

        z = z%6; // % ci da la differenza tra i numeri che andiamo a calcolare, ossia il resto

        z = z%3; // ci dice in questo caso se il numero è multiplo

        System.out.println(z);


        z++; //incrementa di 1

        System.out.println(z);

        z--; //decrementa di 1

        System.out.println(z);

        double somma = somma(4, 5); //il primo somma è una variabile, il secondo è un metodo

        System.out.println(somma);

        benvenuto("Emanuele"); // il metodo voi non ritorna nulla quindi non lo dobbiamo assegnare ad una variabile
        benvenuto("Pippo");

    }

    //metodo per fare una somma

    public static double somma(double x, double y){

        double somma = x + y;
        return somma;

    }

    public static void benvenuto(String nome){

        System.out.println("Benvenuto " + nome);

    }

}
