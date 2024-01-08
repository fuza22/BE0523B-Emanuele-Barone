package src.it.epicode.week1.day1;

import java.util.Scanner;

public class Esercizio {

    public static void main(String[] abs){

        Scanner newScanner = new Scanner(System.in);

        double x, y;

        System.out.println("Inserisci il primo valore");

        x = newScanner.nextDouble();

        System.out.println("Inserisci il secondo valore");

        y = newScanner.nextDouble();

        double res = perimetroRettangolo(x , y);

        System.out.println(res);

        int z;

        System.out.println("Inserisci qui il tuo numero");

        z = newScanner.nextInt();

        int number = pariDispari(z);

        System.out.println(number);

        double a, b, c;

        System.out.println("Inserisci lato 1");

        a = newScanner.nextDouble();

        System.out.println("Inserisci lato 2");

        b = newScanner.nextDouble();

        System.out.println("Inserisci lato 3");

        c = newScanner.nextDouble();

        double area = areaTriangolo(a,b,c);

        System.out.println(area);
    }

    public static double perimetroRettangolo(double x, double y){

        double perimetro = (x + y) * 2;
        return perimetro;

    }

    public static int pariDispari(int x){

        int numero = x % 2;
        return numero;

    }

    public static double areaTriangolo(double x, double y, double z){

        double p = x + y + z;

        double area = Math.sqrt(p * (p - x) * (p - y) * (p - z));
        return area;

    }

}
