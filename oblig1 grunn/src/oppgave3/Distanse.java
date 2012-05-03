package oppgave3;

// *************************************************************
//   Distanse.java
//
//   Beregner avstanden mellom to punkter
// *************************************************************    

import java.util.Scanner;    

public class Distanse  
{
    public static void main (String[] args)
    {
        double x1, y1, x2, y2; // koordinatene til to punkt
        double distance;       // distansen mellom punktene

        Scanner scan = new Scanner(System.in);
        
        // Lese inn de to punktene
        System.out.print ("Tast inn koordinatene til f¿rste punkt: " +
                        "(bruk mellomrom mellom dem): ");
        x1 = scan.nextDouble();    
        y1 = scan.nextDouble();
        
        System.out.print ("Tast inn koordinatene til andre punkt: \n");
        x2 = scan.nextDouble();    y2 = scan.nextDouble();
        
        // Beregne avstanden
        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        
        // Skrive ut svaret
        System.out.print( "\n\nDistansen er: \n" +  distance);
    }
} 