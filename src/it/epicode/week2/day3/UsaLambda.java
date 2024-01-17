package src.it.epicode.week2.day3;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

import java.util.List;

public class UsaLambda {

    public static void main(String[] args) { // quando c'è un interfaccia funzionale posso assegnare l'espressione lambda

        Sommatore sommatore = (a, b) -> a + b;

        System.out.println(sommatore.somma(5,7));

        Verificatore verificatore = (s, n) -> s.length() > n;
        System.out.println(verificatore.verifica("Epic", 5));

        Cerchio cerchio = r -> Math.PI * r * r;
        System.out.println(cerchio.area(5));

        List<Double> lista = List.of(2.4,3.2,6.1,7.7,3.9,2.3);

        SommaLista s = l -> {

            double somma = 0;
            for (Double d:lista) { // for avanzato sulla lista per poter sommare a somma ogni volta tutti gli elementi della lista
                somma += d;
            };
            return somma;
        };
        System.out.println(s.sommaLista(lista));
    }
}
