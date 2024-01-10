package src.it.epicode.week1.day3;

public class UsaRettangolo {

    public static void main(String[] args) {

        Rettangolo rett1 = new Rettangolo(5,10);
        Rettangolo rett2 = new Rettangolo(15,10);


        System.out.println(Rettangolo.stampaRettangolo(rett1));
        System.out.println(Rettangolo.stampaRettangolo(rett2));
        System.out.println(Rettangolo.stampaDueRettangoli(rett1, rett2));

        System.out.println(Rettangolo.getRettangolo(rett1));
        System.out.println(Rettangolo.getRettangolo(rett2));
    }

}
