package src.it.epicode.week1.day5;

public class RegistrazioneAudio extends ElementoMultimediale implements IRiproduci {

    private int volume;

    public RegistrazioneAudio(String title, int volume) {
        super(title);
        this.volume = volume;
    }

    @Override
    public void play() {

        for(int i = 0; i < durata; i++){

            System.out.print(titolo);

            for(int x = 0; x < volume; x++){

                System.out.print(" !");

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
}
