/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {

    // TODO Ret nedenstående datatyper
    String navn= "Test Testesen";
    byte alder = 18;
    String by = "Næstved";
    int postNummer= 4700;
    String vej = "Femøvej";
    String husnummer = "3B";
    String nationalitet = "Dansk";
    String fritidsStringeresser = "Snitning, LOL, strikke";
    String smarthomeDevices = "Xbox, 3 Smartlamper, Køleskab m.m.";
    String hojde = "1.56 m";
    String vaegt = "76 kg";
    double karaktergennemsnit =5.33;
    //short eksamensKarakterer = (int) (7, 12, -3, 4,  2, 10); giver unexpected token error?
    String opdateretDato = "Sun Jan 08 00:00:00 CET 1978";


    @Override
    public String toString() {
        return "Navn: " + navn + "By" + by;
    }
    //eksempel på typecasting fra short til int
    short i = (int) 200;
    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Test Testesen";
        person.by = "Næstved";
        System.out.println();
    }

}
