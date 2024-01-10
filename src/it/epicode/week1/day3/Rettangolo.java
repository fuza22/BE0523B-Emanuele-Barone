package src.it.epicode.week1.day3;


public class Rettangolo {

    private int altezza;
    private int larghezza;
    public Rettangolo ( int altezza, int larghezza){

        this.altezza = altezza;
        this.larghezza = larghezza;

    }

    public static String stampaRettangolo(Rettangolo rett){

        int perimetro = (rett.altezza + rett.larghezza) * 2;
        int area = rett.altezza * rett.larghezza;
        return "Il perimetro è: " + perimetro + ", e l'area è: " + area;

    }


    public static String stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2){

        int perimetro1 = (rett1.altezza + rett1.larghezza) * 2;
        int area1 = rett1.altezza * rett1.larghezza;

        int perimetro2 = (rett2.altezza + rett2.larghezza) * 2;
        int area2 = rett2.altezza * rett2.larghezza;
        int sommaPerimetro = perimetro1 + perimetro2;
        int sommaArea = area1 + area2;

        return "Il perimetro del primo è: " + perimetro1 + ", e l'area del primo è: " + area1 +
                "Il perimetro del secondo è: " + perimetro2 + " , e l'area del secondo è: " + area2 +
                " , la somma dei perimetri è: " + sommaPerimetro + " , la somma delle aree è: " + sommaArea;

    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public static String getRettangolo(Rettangolo rett) {
        return "L'altezza è " + rett.altezza + " e la larghezza è: " + rett.larghezza;
    }
}
