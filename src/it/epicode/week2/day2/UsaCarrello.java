package src.it.epicode.week2.day2;

public class UsaCarrello {

    public static void main(String[] args) {

        Carrello carrello = new Carrello();


        Articolo a1 = new Articolo("Mele", "Frutta", 1);
        Articolo a2 = new Articolo("Pere", "Frutta", 3);
        Articolo a3 = new Articolo("Banane", "Frutta", 2);

        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);
        carrello.aggiungiArticolo(a3);
        carrello.aggiungiArticolo(a2);

        carrello.stampaArticolo();
        System.out.println(carrello.totale());

    }
}
