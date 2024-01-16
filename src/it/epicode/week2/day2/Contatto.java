package src.it.epicode.week2.day2;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Contatto {

    private static final HashMap<String, String> rubrica = new HashMap<>();

    public static void main(String[] args) {

        aggiungiContatto("Emanuele", "3342254032");
        aggiungiContatto("Emilio", "3242224032");
        aggiungiContatto("Mauro", "3442324032");

        stampaRubrica();

        String ricercaNome = "Emilio";
        String ricercaNumero = "3242224032";

        System.out.println("Il numero di " + ricercaNome + " corrisponde a " + cercaNome("Emilio"));
        System.out.println("Il numero di " + ricercaNumero + " appartiene a " + cercaNumero("3242224032"));
        rimuoviContatto("Emanuele");
        stampaRubrica();

    }


    public static void aggiungiContatto(String nome, String numero){

        rubrica.put(nome, numero);

    }

    public static void rimuoviContatto(String nome){

        rubrica.remove(nome);

    }

    public static String cercaNumero(String numero){

        Set<String> chiave = rubrica.keySet();
        for(String c:chiave){

            if(rubrica.get(c).equals(numero))
                return c;

        }
            return "Questo numero non corrisponde a nessun contatto il rubrica";

    }

    public static String cercaNome(String nome){

        return rubrica.get(nome);

    }


    public static void stampaRubrica(){

        Set<String> chiave = rubrica.keySet();
        for(String c:chiave){

            System.out.println(c + " " + rubrica.get(c));

        }


    }
}
