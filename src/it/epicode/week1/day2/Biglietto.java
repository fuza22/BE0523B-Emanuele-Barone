package src.it.epicode.week1.day2;

import java.util.Scanner;

public class Biglietto {

    // scelta tipologia biglietto e costo

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli una opzione tra 1 e 4");

        int scelta = scanner.nextInt();

        /*
        if(scelta == 1){

            System.out.println("Biglietto gratuito");

        }else if (scelta == 2){

            System.out.println("Costo biglietto 8 euro");

        }else if(scelta == 3){

            System.out.println("Costo biglietto 10 euro");

        }else if(scelta == 4){

            System.out.println("Costo biglietto 15 euro");

        }else{

            System.out.println("Scelta errata");

        } */

        // con il metodo switch

        switch(scelta){

            case 1:
                System.out.println("Biglietto gratuito");
                break;

            case 2:
                System.out.println("Costo biglietto 8 euro");
                break;

            case 3:
                System.out.println("Costo biglietto 10 euro");
                break;

            case 4:
                System.out.println("Costo biglietto 15 euro");
                break;

            default:
                System.out.println("Scelta errata");
        }

    }

}
