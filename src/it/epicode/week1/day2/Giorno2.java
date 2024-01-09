package src.it.epicode.week1.day2;

import java.util.Scanner;

public class Giorno2 {

    public static void main(String[] args) { // main shotcurt

        //sconto su prezzo

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il prezzo"); //sout shotcurt

        double prezzo = scanner.nextDouble();

        double prezzo_scontato;

        if (prezzo < 30){

           prezzo_scontato = prezzo - (prezzo * 12) / 100;

        }else{

            prezzo_scontato = prezzo - (prezzo * 25) / 100;

        }

        System.out.println(prezzo_scontato);

    }

}
