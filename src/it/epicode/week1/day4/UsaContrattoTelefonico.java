package src.it.epicode.week1.day4;

public class UsaContrattoTelefonico {

    public static void main(String[] args) {

        ContrattoMobile cm = new ContrattoMobile(358291934,"Emanuele",0.01, 0.1);

        ContrattoTelefonico cm2 = new ContrattoTelefonico(358291934,"Emanuele",0.01);

        // ContrattoMobile cm3 = (ContrattoMobile) cm2; cerco di cambiare ContrattoTelefonico in ContrattoMobile ma non va a buon fine
        ContrattoMobile cm3 = (ContrattoMobile) cm; // se casto cm e gli cambio il tipo statico, funziona


        System.out.println(cm3.getCOSTO_ALLA_RISPOSTA());

        System.out.println(cm.getCostoTelefonate());
        System.out.println(cm.getNumeroTelefonate());


        cm.aggiornaBolletta(60);

        System.out.println(cm.getCostoTelefonate());
        System.out.println(cm.getNumeroTelefonate());

        cm.aggiornaBolletta(60);


        System.out.println(cm.getCostoTelefonate());
        System.out.println(cm.getNumeroTelefonate());


        System.out.println(cm);

        System.out.println(cm2.stessoCostoAlSecondo(cm3));


        ContrattoTelefonico[] contratti = new ContrattoTelefonico[4]; // creo un solo array che conterrà anche le sottoclassi

        contratti[0] = cm;
        contratti[1] = cm2;
        contratti[2] = cm3;

        for(int i = 0; i < contratti.length; i++){

         contratti[i].aggiornaBolletta(10);

        }

    }

}
