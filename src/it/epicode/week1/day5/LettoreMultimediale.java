package src.it.epicode.week1.day5;

import java.util.Arrays;
import java.util.Scanner;

public class LettoreMultimediale {

    public static void main(String[] args) {

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for(int i = 0; i < elementi.length; i++){

            elementi[i] = creaElementoMultimediale();
            System.out.println(Arrays.toString(elementi));
        }

        player(elementi);
    }

    public static void player(ElementoMultimediale[] elementi){

        Scanner scanScelta = new Scanner(System.in);

        int scelta;

        do{

            System.out.println("Inserisci un numero da 1 a 5 per scegliere cosa riprodurre, oppure 0 per uscire dalla riproduzione");
            scelta = scanScelta.nextInt();

            if(scelta >= 1 && scelta <= 5){

                if(elementi[scelta - 1] instanceof RegistrazioneAudio audio){

                    int n;

                    do {

                        System.out.println("Inserisci un'opzione: 1: Play, 2: Alza il volume, 3: Abbassa il volume, 4: Imposta un volume, 0: Esci");
                        n = scanScelta.nextInt();

                        switch(n){

                            case 1:

                                audio.play();
                                break;

                            case 2:
                                audio.alzaVolume();
                                break;

                            case 3:
                                audio.abbassaVolume();
                                break;

                            case 4:
                                System.out.println("Imposta il volume");
                                int v = scanScelta.nextInt();
                                audio.impostaVolume(v);

                            case 0:
                                break;

                            default:
                                System.out.println("Inserisci una scelta valida");
                                break;
                        }

                    }while(n != 0);



                }
                if(elementi[scelta - 1] instanceof Video video){

                    int y;

                    do {

                        System.out.println("Inserisci un'opzione: 1: Play, 2: Alza il volume, 3: Abbassa il volume, 4: Imposta un volume, 5: Alza la luminosità, 6: Abbassa la luminosità, 0: Esci");
                        y = scanScelta.nextInt();

                        switch(y){

                            case 1:

                                video.play();
                                break;

                            case 2:
                                video.alzaVolume();
                                break;

                            case 3:
                                video.abbassaVolume();
                                break;

                            case 4:
                                System.out.println("Imposta il volume");
                                int v = scanScelta.nextInt();
                                video.impostaVolume(v);

                            case 5:
                                video.aumentaLuminosita();
                                break;

                            case 6:
                                video.diminuisciLuminosita();
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Inserisci una scelta valida");
                                break;
                        }

                    }while(y != 0);

                }
                if(elementi[scelta - 1] instanceof Immagine immagine){

                    int i;

                    do {

                        System.out.println("Inserisci un'opzione: 1: Mostra, 2: Alza la luminosità, 3: Abbassa la luminosità, 0: Esci");

                        i = scanScelta.nextInt();

                        switch(i){

                            case 1:

                                immagine.show();
                                break;

                            case 2:
                                immagine.aumentaLuminosita();
                                break;

                            case 3:
                                immagine.diminuisciLuminosita();
                                break;


                            case 0:
                                break;

                            default:
                                System.out.println("Inserisci una scelta valida");
                                break;
                        }

                    }while(i != 0);


                }

            }

        }while(scelta != 0);

        System.out.println("Programma terminato, hai scelto 0");

    }

    public static ElementoMultimediale creaElementoMultimediale(){

        Scanner scanner = new Scanner(System.in);
        String titolo;
        int volume,luminosita;
        Tipi tipoDiElemento;
        System.out.println("Che tipo di elemento vuoi scegliere tra: AUDIO, VIDEO, IMMAGINE?");
        tipoDiElemento = Tipi.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Inserisci un titolo");
        titolo = scanner.nextLine();

        switch(tipoDiElemento){

            case AUDIO:
                System.out.println("Inserisci il volume");
                volume = scanner.nextInt();
                return new RegistrazioneAudio(titolo, volume);

            case VIDEO:
                System.out.println("Inserisci il volume");
                volume = scanner.nextInt();
                System.out.println("Inserisci la luminosità");
                luminosita = scanner.nextInt();
                return new Video(titolo, volume, luminosita);

            default:
                System.out.println("Inserisci la luminosità");
                luminosita = scanner.nextInt();
                return new Immagine(titolo, luminosita);

        }

    }

}
