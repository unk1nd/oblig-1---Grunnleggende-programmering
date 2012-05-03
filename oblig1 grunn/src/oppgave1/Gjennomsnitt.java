package oppgave1;
// ***************************************************************************
// Java script for å regne ut gjennomsnittet av 3 tall satt som variabler.
// ***************************************************************************
// Dato: 06.09.2011
// Av: Mikael Bendiksen
// ***************************************************************************

public class Gjennomsnitt {


    public static void main(String[] args)
    {

        // 3 varibeler for gjennomsnitts utregning
        double tall1 = 10.0;
    	double tall2 = 11.3;
        double tall3 = 13.4;

        // snitt variabel med tallene
        double snit = tall1 + tall2 + tall3;

        // gjennomsnitt utregning av snitt delt på antall tall
        double gsnit = snit / 3;

        // Printing i console av hvordan tall som er brukt og hva gjennomsnittet av disse tallene er
        System.out.println("Gjennomsnittet av tallene " + tall1 + ", " + tall2 + " og " + tall3 + " er: \n" + gsnit);

    }
}
