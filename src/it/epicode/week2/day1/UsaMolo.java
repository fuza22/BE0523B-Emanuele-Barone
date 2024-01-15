package src.it.epicode.week2.day1;

public class UsaMolo {

    public static void main(String[] args) throws PostoOccupatoException {

        Molo m = Molo.crea("342fr", 10);

        try {
                m.assegnaPostoBarca("Caravaggio", 2);
                m.assegnaPostoBarca("Pippo", 2);
        }
        catch(PostoOccupatoException e){

            System.out.println(e.getMessage());

        }

    }
}
