package src.it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero per iniziare il conto alla rovescia");

        int n = scan.nextInt();

        for( int i = n; i >= 0; i--){

            System.out.println(i);

        }

    }

}
