package src.it.epicode.week2.day2;

public class UsaCarrello2 {

    public static void main(String[] args) {

        CarrelloHashset carrello = new CarrelloHashset();


        Articolo a1 = new Articolo("Mele", "Frutta", 1);
        Articolo a2 = new Articolo("Pere", "Frutta", 3);
        Articolo a3 = new Articolo("Banane", "Frutta", 2);
        Articolo a4 =  new Articolo("Mele", "Frutta", 1);

        // aggiunge due articoli basta che siano due articoli differenti, pur avendo le stesse informazioni

        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);
        carrello.aggiungiArticolo(a3);
        carrello.aggiungiArticolo(a4);

        System.out.println(a2.hashCode());
        System.out.println(a4.hashCode());



        carrello.stampaArticolo();
        System.out.println(carrello.totale());

    }
}

