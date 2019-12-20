/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */


public class Main {


    //prints out hello world to the console
    /*prints out the empty hello method
    * And the hallo method*/
    public static void main(String[] args) {
        System.out.println("hello world!");

        // calls the hallo method
        String hallo = helloAndras("");

        System.out.println(hallo);

        //calls the hello method and sets the Empty String to "Hello World
        String hello = hello("");

        //print the hello method call to console
        System.out.println(hello);



    }

    //This Method prints out hello andras when called in the psvm.
    public static String helloAndras(String András) {

        return "Hello András!";
    }

        //This Method calls hello world in the psvm
        public static String hello(String navn){
            return "Hello World!";
        }

}
