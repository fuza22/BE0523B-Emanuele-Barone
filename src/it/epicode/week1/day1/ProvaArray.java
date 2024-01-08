package it.epicode.week1.day1;

import java.util.Scanner;

public class ProvaArray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //creare un array vuoto e dare una dimensione predefinita

        int[] numeri = new int[5];

        //inserire valori dentro un array direttamente

        // numeri[0] = 4;
        // numeri[2] = 3;


        //ciclo per far inserire i valori dell'array all'utente

        for(int i = 0; i < numeri.length; i++){

            System.out.println("Dammi un numero");
            numeri[i] = scanner.nextInt();

        }

        //ciclo per stampare i numeri dell'array

        for(int i = 0; i < numeri.length; i++){

            System.out.println(numeri[i]);

        }

        //creare un array già con dati dentro

        String[] giorniSettimana = {"L", "M", "M", "G", "V", "S", "D"};

        for(int i = 0; i < giorniSettimana.length; i++){

            System.out.println(giorniSettimana[i]);

        }



    }

}
