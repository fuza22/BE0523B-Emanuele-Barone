package src.it.epicode.week1.day4;

public class Dipendente {

    private double stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrdinarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(Livello livello, Dipartimento dipartimento, double stipendioBase, int matricola, double stipendio, double importoOrdinarioStraordinario) {

        this.stipendioBase = stipendioBase;
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrdinarioStraordinario = importoOrdinarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;

    }

    public Dipendente(int matricola, Dipartimento dipartimento){

        this.matricola = matricola;
        this.dipartimento = dipartimento;

        stipendio = stipendioBase;
        importoOrdinarioStraordinario = 30;
        livello = Livello.OPERAIO;

    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrdinarioStraordinario() {
        return importoOrdinarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrdinarioStraordinario(double importoOrdinarioStraordinario) {
        this.importoOrdinarioStraordinario = importoOrdinarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }


    public String stampaDatiDipendente() {
        return "Dipendente{" +
                "stipendioBase=" + stipendioBase +
                ", matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", importoOrdinarioStraordinario=" + importoOrdinarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public Livello promuovi(){

        switch(livello){

            case Livello.OPERAIO:
            livello = Livello.IMPIEGATO;
            stipendio = stipendioBase * 1.2;
            break;

            case Livello.IMPIEGATO:
                livello = Livello.QUADRO;
                stipendio = stipendioBase * 1.5;
                break;

            case Livello.QUADRO:
                livello = Livello.DIRIGENTE;
                stipendio = stipendioBase * 2;
                break;

            case Livello.DIRIGENTE:
                System.out.println("Errore: non si può piu avanzare");
                break;

            default:

                livello = Livello.OPERAIO;

        }

            return livello;

    }

    public static String calcolaPaga(Dipendente d, int ore){

        d.stipendio += d.stipendioBase;

        if(ore == 0){

            return "Lo stipendio del dipendente è di: " + d.stipendio;

        }else{

            d.stipendio += ore * d.importoOrdinarioStraordinario;
            return "Lo stipendio del dipendente è di: " + d.stipendio;

        }



    }

}
