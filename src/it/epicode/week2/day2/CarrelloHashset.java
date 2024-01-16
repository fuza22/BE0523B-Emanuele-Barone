package src.it.epicode.week2.day2;

import java.util.HashSet;

public class CarrelloHashset {

    private HashSet<Articolo> carrello;

    public CarrelloHashset() {

        carrello = new HashSet<>();

    }

    public void aggiungiArticolo(Articolo a){

        carrello.add(a);

    }


    public void stampaArticolo(){

        System.out.println(carrello);

    }


    public double totale(){

        double costoArticolo = 0;

        for(Articolo articolo:carrello){ // estraggo un articolo

            costoArticolo += articolo.getPrezzo(); // per ogni articolo estratto ottengo il prezzo

        }
        return costoArticolo;
    }

}
