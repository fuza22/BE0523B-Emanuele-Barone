package src.it.epicode.week1.day5;

public class Video extends ElementoMultimediale implements IRiproduci {

    private int volume;
    private int luminosita;

    public Video(String titolo, int volume, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {

        for(int i = 0; i < durata; i++){

            System.out.print(titolo);

            for(int x = 0; x < volume; x++){

                System.out.print(" !");

            }
            for(int y = 0; y < luminosita; y++){

                System.out.print(" *");

            }

            System.out.println("");

        }

    }

    @Override
    public void impostaVolume(int volume) {

        this.volume = volume;

    }

    @Override
    public void alzaVolume() {

        volume++;

    }

    @Override
    public void abbassaVolume() {

        volume--;

    }

    public void aumentaLuminosita(){

        luminosita++;

    }

    public void diminuisciLuminosita(){

        luminosita--;

    }

}
