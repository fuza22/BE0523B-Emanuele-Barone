package src.it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int n = scan.nextInt();

        switch(n){

            case 1:
                System.out.println("a");
                break;

            case 2:
                System.out.println("b");
                break;

            case 3:
                System.out.println("c");
                break;

            default:
                System.out.println("Scelta non valida");

        }

    }

}
