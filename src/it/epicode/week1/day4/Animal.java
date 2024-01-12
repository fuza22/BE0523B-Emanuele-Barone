package src.it.epicode.week1.day4;


// classe astratta con metodo astratto all'interno
public abstract class Animal {

    protected int legs;

    protected Animal(int legs) {

        this.legs = legs;

    }

    public void walk(){

        System.out.println("Sta camminando");

    }

    public abstract void eat();

}
