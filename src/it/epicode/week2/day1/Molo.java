package src.it.epicode.week2.day1;

public class Molo {

    private String codice;
    private int numPostiBarca;
    private String[] barche;

    private Molo(String codice, int numPostiBarca) {
        this.codice = codice;
        this.numPostiBarca = numPostiBarca;
        barche = new String[numPostiBarca];
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public int getNumPostiBarca() {
        return numPostiBarca;
    }

    public void setNumPostiBarca(int numPostiBarca) {
        this.numPostiBarca = numPostiBarca;
    }

    public static Molo crea(String codice, int numPostiBarca){

        Molo m = new Molo(codice, numPostiBarca);

        return m;

    }

    public Boolean libero(int n){

        if(barche[n] != null){

            return false; // il posto è occupato

        }
        return true; // il posto è libero
    }


    public void assegnaPostoBarca(String b, int n ) throws PostoOccupatoException { // PostoOccupatoException è una checked exception

        if(libero(n)){

            barche[n] = b;

        }else{ // se il posto non è libero lancio un eccezione

            throw new PostoOccupatoException("Il posto " + n + " è occupato");

        }

    }

}
