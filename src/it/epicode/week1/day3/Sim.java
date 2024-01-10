package src.it.epicode.week1.day3;

public class Sim {

    private String numero;
    private double costoSecondo;
    private double credito;
    private String[] listaChiamate = new String[5];
    private double durata;
    private String numeroChiamato;

    public Sim(String numero, double costoSecondo, double credito){

        this.numero = numero;
        this.costoSecondo = costoSecondo;
        this.credito = credito;

    }

    public static String getDatiSim(Sim scheda){

        return "Il numero di telefono è: " + scheda.numero + " il costo per secondo è: " + scheda.costoSecondo +
                " il credito residuo è: " + scheda.credito + " le ultime 5 chiamate sono: " + scheda.listaChiamate;
    }

    public String getNumero() {
        return numero;
    }

    public double getCostoSecondo() {
        return costoSecondo;
    }

    public String getCredito() {
        return "Il credito residuo è di: " + credito + " euro";
    }

    public String[] getListaChiamate() {
        return listaChiamate;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String chiamata(double secondi, String numeroChiamato){

        if(verificaCredito(secondi)){

            for(int i = listaChiamate.length-1; i>0 ; i--){

                listaChiamate[i] = listaChiamate[i - 1];

            }
            listaChiamate[0] = numeroChiamato;

            return "La chiamata è andata a buon fine";

        }
        return "La chiamata non può essere effettuata";
    }

    public boolean verificaCredito(double secondi){

        double costoChiamata = this.costoSecondo * secondi;
        this.credito -= costoChiamata;

        if(this.credito <= 0){

            this.credito += costoChiamata;
            return false;

        }
            return true;

    }

    public void ricarica(double ricarica){

        this.credito += ricarica;

    }
}
