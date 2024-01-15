package src.it.epicode.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class ArrayInteri {

    private static final Logger logger= LoggerFactory.getLogger(ArrayInteri.class);

    public static int[] popolaArray(){

        int[] numeri = new int[5];
        Random random = new Random();

        for(int i = 0; i < numeri.length; i++){

            numeri[i] = random.nextInt(10) + 1;

        }

        return numeri;

    }

    public static void stampaArray(int[] arr){

        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);

        }

    }


    public static int[] inserisciNum(int[] arr){

        int num = 0;

        do{

        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Inserisci un numero");
            num = scan.nextInt();
            System.out.println("Inserisci la posizione");
            int pos = scan.nextInt();
            arr[pos - 1] = num;
            stampaArray(arr);


        }

        catch(ArrayIndexOutOfBoundsException e){

            logger.error("Inserisci un numero e non un testo");

        }
        catch(InputMismatchException e){

            logger.error("Inserisci un numero e non un testo");
            continue;
        }
        }while(num != 0);

        return arr;

    }

    public static void main(String[] args) {

        int[] numeri = popolaArray();

        stampaArray(numeri);
        inserisciNum(numeri);


    }

}
