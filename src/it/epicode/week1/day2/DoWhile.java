package src.it.epicode.week1.day2;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double somma = 0;
        int i = 0;
        int numero;

        do {

            System.out.println("Dammi un numero");
            numero = scanner.nextInt();
            somma += numero;
            i++;

        }while(numero != 0); //se il numero è diverso da 0 da zero continuo senno si ferma

        System.out.println(somma/i); //sbagliata

    }

}
