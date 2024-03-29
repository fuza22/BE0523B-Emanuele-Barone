package src.it.epicode.week1.day4;

public class ContrattoTelefonico {

    private int numeroTel;
    private String utente;
    private double costoTelefonate;
    private int numeroTelefonate;
    private final double COSTO_AL_SECONDO;

    public ContrattoTelefonico(int numeroTel, String utente, double COSTO_AL_SECONDO) {

        this.numeroTel = numeroTel;
        this.utente = utente;
        this.COSTO_AL_SECONDO = COSTO_AL_SECONDO;


    }

    public double getCOSTO_AL_SECONDO() {
        return COSTO_AL_SECONDO;
    }

    public double getCostoTelefonate() {
        return costoTelefonate;
    }

    public int getNumeroTelefonate() {
        return numeroTelefonate;
    }

    public void aggiornaBolletta(int secondi){

        numeroTelefonate++;
        costoTelefonate+= secondi * COSTO_AL_SECONDO;

    }

    public void aggiungiCosti(double costo){

        costoTelefonate += costo;

    }


    public boolean stessoCostoAlSecondo(ContrattoTelefonico ct){

        // serve se devo fare un cast all'interno di un metodo, se la variabile ct
        // che è di tipo contrattotelefonico dovesse avere un oggetto collegato a
        // contratto mobile allora istanceof sarà true sennò false
        if(ct instanceof ContrattoMobile){

            ContrattoMobile cm = (ContrattoMobile) ct;
            System.out.println(cm.getCOSTO_ALLA_RISPOSTA());

        }

        if(ct.getCOSTO_AL_SECONDO() == this.COSTO_AL_SECONDO){

            return true;

        }

        return false;

    }

    @Override
    public String toString() {
        return "ContrattoTelefonico{" +
                "numeroTel=" + numeroTel +
                ", utente='" + utente + '\'' +
                ", costoTelefonate=" + costoTelefonate +
                ", numeroTelefonate=" + numeroTelefonate +
                ", COSTO_AL_SECONDO=" + COSTO_AL_SECONDO +
                '}';
    }
}
