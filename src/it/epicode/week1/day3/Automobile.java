package src.it.epicode.week1.day3;

public class Automobile {

    int cilindrata;
    private String marca;
    private String nome;
    private String targa;
    private int porte;

    private TipoAutomobile categoria;

    //COSTRUTTORE CLASSE
    public Automobile( String marca, String nome, String targa, int cilindrata, int porte ){

        this.marca = marca;
        this.nome = nome;
        this.targa = targa;
        this.cilindrata = cilindrata;
        this.porte = porte;

    }

    // per avere più costrutori (overloading) all'interno di una classe, i costruttori devono avere la lista di parametri diversa
    public Automobile( String marca, String nome, String targa, int cilindrata ){

        this.marca = marca;
        this.nome = nome;
        this.targa = targa;
        this.cilindrata = cilindrata;

    }




    public void accelera(){

        System.out.println("Sto accellerando");

    }

    public void decelera(){

        System.out.println("Sto rallentando");

    }

    public void stampaCaratteristiche(){

        System.out.println("cilindrata: " + cilindrata + ", marca: " + marca + " categoria:" + categoria);

    }

    public String getMarca(){

        return marca;

    }

    public String getTarga(){

        return targa;

    }

    public String getNome(){

        return nome;

    }

    public int getCilindrata(){

        return cilindrata;

    }

    public int getPorte(){

        return porte;

    }

    public void setCategoria(TipoAutomobile categoria) {
        this.categoria = categoria;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static boolean combaciaTarga(Automobile a1, Automobile a2){

        if(a1 != null && a2 != null){

            if(a1.getTarga().equals(a2.getTarga())){

                return true;

            }
        }
            return false;
    }

}
