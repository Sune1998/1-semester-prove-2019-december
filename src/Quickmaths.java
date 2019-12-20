/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */
import java.util.Scanner;
public class Quickmaths {

    public static void main(String[] args) {

        System.out.println("****QuickMaths****");

        System.out.println("tryk q for afslutte");
        //start of while loop.
        while (true) {

            System.out.println("intast to tal");

            System.out.println("tal a");
            // gets user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("tal b");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            // claculate sum and gennemsnit of user input
            int sum = a + b;
            int gennemnsnit = a + b / 2;

            // print results to console
            System.out.println("summen af de to er" + sum);
            System.out.println("------------------------------");
            System.out.println("gennennemsnitter af de to tal er" + gennemnsnit);

            //breaks out of while loop
            String quit = "" ;
            if (quit.equalsIgnoreCase("q")) {
                System.out.println("bye");
                break;
            }

        }
    }

    // Method to calculate sum
        private static int sum ( int a, int b ){
            int result = a + b;
            return a + b;
        }


        public void start() {
            return;
        }

        //method to calculate gennemsnit
        public int gennennemsnit ( int a, int b){
            int genresult = a + b / 2;

            return a + b / 2;
        }

}
