package src.it.epicode.week1.day4;

public class GestioneDipendenti {

    public static void main(String[] args) {

        Dipendente d1 = new Dipendente(Livello.OPERAIO, Dipartimento.PRODUZIONE, 1000,1,0,10);
        Dipendente d2 = new Dipendente(Livello.OPERAIO, Dipartimento.PRODUZIONE, 1000,2,0,10);
        Dipendente d3 = new Dipendente(Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE, 1000, 3, 0, 20);
        Dipendente d4 = new Dipendente(Livello.DIRIGENTE, Dipartimento.VENDITE, 1000, 4, 0, 30);

        d1.promuovi();
        d3.promuovi();

        System.out.println(d1.stampaDatiDipendente());
        System.out.println(d2.stampaDatiDipendente());
        System.out.println(d3.stampaDatiDipendente());
        System.out.println(d4.stampaDatiDipendente());


        System.out.println(Dipendente.calcolaPaga(d1, 5));
        System.out.println(Dipendente.calcolaPaga(d2, 5));
        System.out.println(Dipendente.calcolaPaga(d3, 5));
        System.out.println(Dipendente.calcolaPaga(d4, 5));


    }

}
