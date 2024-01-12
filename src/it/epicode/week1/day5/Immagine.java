package src.it.epicode.week1.day5;

public class Immagine extends ElementoMultimediale{

    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }


    public void show() {

        System.out.print(titolo);

        for(int i = 0; i < luminosita; i++) {

            System.out.print(" *");

        }

            System.out.println("");

    }

    public void aumentaLuminosita(){

        luminosita++;

    }

    public void diminuisciLuminosita(){

        luminosita--;

    }

}


