package src.it.epicode.week1.day2;

import java.util.Scanner;

public class Media {

    //10 valori dall'utente e calcolare media

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* metodo con array

        int[] numeri = new int[10];

        int i = 0;

        double somma = 0;

        while(i < numeri.length){ // faccio inserire i numeri all'utente

            System.out.println("Dammi un numero");
            numeri[i] = scanner.nextInt();
            i++;

        }

        for(int j = 0; j < numeri.length; j++){ //inserisco nella variabile somma tutti i valori inseriti dall'utente e li raggruppo

            somma += numeri[j];

        }

        double media = somma / numeri.length; //(double)somma = si effettua la conversione esplicita lasciando somma con int
        */

        //metodo senza array

        int i = 0;

        double somma = 0;

        while(i < 10){

            System.out.println("Dammi un numero");
            somma += scanner.nextInt();
            i++;

        }

        double media = somma/10;

        System.out.println(media); // la somma dei numeri diviso il quantitativo di numeri inseriti, cosi da ottenere la media

    }

}
