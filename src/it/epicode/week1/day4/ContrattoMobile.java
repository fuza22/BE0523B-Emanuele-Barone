package src.it.epicode.week1.day4;

public class ContrattoMobile extends ContrattoTelefonico {

    private final double COSTO_ALLA_RISPOSTA;

        // il costruttore della sottoclasse si fa dare tutti i parametri della classe che estende piu i nuovi parametri e va dato alla prima istruzione
        public ContrattoMobile(int numeroTel, String utente, double COSTO_AL_SECONDO, double COSTO_ALLA_RISPOSTA) {
        // il costruttore della sottoclasse è costretto a chiamare il costruttore della super classe
        super(numeroTel, utente, COSTO_AL_SECONDO);
        // creando la sottoclasse accedo anche alle caratteristiche della super classe
        this.COSTO_ALLA_RISPOSTA= COSTO_ALLA_RISPOSTA;

    }

    @Override // è un annotazione perchè si effettua un override, con l'override si riscrive un metodo ereditato
    public void aggiornaBolletta(int secondi){

        super.aggiornaBolletta(secondi); //dobbiamo usare super. per richiamare il metodo della superclasse, senno richiamerebbe sempre se stesso creando un loop
        aggiungiCosti(COSTO_ALLA_RISPOSTA); //possiamo richiamare i metodi della super classe anche senza super in questo caso

    }

    public double getCOSTO_ALLA_RISPOSTA() {
        return COSTO_ALLA_RISPOSTA;
    }
}
