package src.it.epicode.week2.day1;

public class UsaAritmetica {

    public static void main(String[] args) {

        Aritmetica aritmetica = new Aritmetica();

        try {

            System.out.println(aritmetica.divisione(5, 0)); // eseguo l'operazione o l'azione da fare nel programma

        }
        catch(ArithmeticException e){

            System.out.println("Divisione per 0 non ammessa"); //eccezione dell'operazione contenuta nel try che viene propagata al chiamante (main), di conseguenza viene stampata l'eccezione e non il risultato dato che non esiste il risultato per quest'operazione

        }
        catch(Exception e){ // accetta qualsiasi eccezione, ma è una forzatura



        }
        finally{



        }

        System.out.println("Programma terminato"); // il programma può continuare dopo il try / catch

    }

}
