package src.it.epicode.week1.day4;

public abstract class Cat extends Animal implements Pet {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat(){

        this("Fluffy");

    }

    public void play(){

        System.out.println(name + "likes to play");

    }

    public void eat(){

        System.out.println(name + "likes to eat");
    }

}
