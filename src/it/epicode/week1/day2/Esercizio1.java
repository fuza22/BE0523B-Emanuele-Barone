package src.it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la parola");

        String parola = scan.nextLine();

        if(parola.length() % 2 == 0){

            System.out.println("Pari");

        }else{

            System.out.println("Dispari");

        }

        System.out.println("Inserisci l'anno per scoprire se è bisestile");

        int anno = scan.nextInt();

        if(anno % 4 == 0){

            System.out.println("L'anno inserito è bisestile");

        }else{

            System.out.println("L'anno inserito non è bisestile");

        }

    }

}
