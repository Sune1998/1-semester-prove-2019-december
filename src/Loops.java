/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Loops {

    public String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere()
    {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        System.out.println("venter på et tal");
        l.waitingFor0();

    }

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.asList(brugere));
        }

    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {

        for (int i = brugere.length-1; i>= 0;i--) {
            System.out.println(Collections.singletonList(brugere[i]));
        }

    }

    public void waitingFor0() {
        ;
        while (true) {
            Scanner input = new Scanner(System.in);
            double a = input.nextDouble();
            System.out.println("venter på 0. Skriv et tal");
            if (a == 0) {
                System.out.println("nu er det slut");
                break;
            }
        }

 
    }
}
