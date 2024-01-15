package src.it.epicode.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KmLitro {

    private static final Logger logger = LoggerFactory.getLogger(KmLitro.class);

    public static void main(String[] args) {

        kmPerLitro();

    }


public static float kmPerLitro(){

        float lt = 0;

        try{

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci i km percorsi");
        float km = scan.nextFloat();
        System.out.println("Inserisci i lt consumati");
        lt = scan.nextFloat();
        if (lt == 0){

            throw new ArithmeticException("Hai inserito 0, riprova");

        }
        System.out.println(km / lt);

    }
    catch(InputMismatchException e){

        logger.error("Inserito un numero pari a 0");

    }
    catch (ArithmeticException e){

        logger.error("Impossibile dividere per 0");
        System.out.println(e.getMessage());

    }

        return kmPerLitro();
}

}