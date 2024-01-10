package src.it.epicode.week1.day3;

public class UsaAutomobile {

    public static void main(String[] args) {

        Automobile auto = new Automobile("Mini","Cooper","AA000AA", 1500, 5);
        /*
        auto.cilindrata = 1500;
        auto.marca = "Mini";
        auto.nome = "Cooper";
        auto.porte = 5;
        auto.targa = "AA000AA";
        */

        // auto.= TipoAutomobile.BERLINA; //attribuisco un nuovo valore (categoria) tramite l'enum creato

        auto.setMarca("Ford");
        auto.setNome("Kuga");

        System.out.println(auto.getMarca());
        System.out.println(auto.getNome());

        auto.accelera();

        auto.decelera();


        Automobile auto2 = new Automobile("BMW","Cooper","AA000AB", 1500, 3);;

        // System.out.println("cilindrata: " + auto2.cilindrata + ", marca: " + auto2.marca);

        Automobile auto3 = auto;

        // System.out.println(auto3.cilindrata);

       // auto3.cilindrata = 1200;

        // System.out.println(auto.cilindrata); // anche se la variabile è diversa se modifico la cilindrata di auto3 si modifica anche quella di auto perche auto3 ed auto sono la stessa cosaa

        System.out.println(auto == auto2); // non si usa per verificare se due oggetti hanno dati uguali

        System.out.println(auto.equals(auto2));
        System.out.println(auto.equals(auto3)); // confronta due variabili di riferimento in base ai dati che abbiamo

        System.out.println(Automobile.combaciaTarga(auto, auto2)); //richiamo il metodo associato alla classe

        auto.stampaCaratteristiche();
        auto2.stampaCaratteristiche();

    }

}
