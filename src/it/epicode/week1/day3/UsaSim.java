package src.it.epicode.week1.day3;

import java.util.Arrays;

public class UsaSim {

    public static void main(String[] args) {

        Sim sim1 = new Sim("3332221100", 0.15,0);

        System.out.println(sim1.getCredito());

        sim1.ricarica(50);

        System.out.println(sim1.getCredito());

        System.out.println(sim1.chiamata(1.0, "4444564543"));

        System.out.println(sim1.getCredito());

        System.out.println(Arrays.toString(sim1.getListaChiamate()));

        System.out.println(sim1.chiamata(1.0, "11111111"));

        System.out.println(sim1.getCredito());

        System.out.println(Arrays.toString(sim1.getListaChiamate()));

    }


}
