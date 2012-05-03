package oppgave2;
// ***************************************************************************
// Konvertering av Celcius til Fahrenheit
//
// ***************************************************************************
// Dato: 06.09.11
// Time: 11:26
// Av: Mikael Bendiksen
// ***************************************************************************

import java.util.Scanner;

public class tempkonvertering 
{

	public static void main(String[] args) 
	{

		// Litt pyntet Header og info
		System.out.println("\n--------------------------------------");
		System.out.println("Konvertering av Celcius til Fahrenheit");
		System.out.println("Av: Mikael Bendiksen");
		System.out.println("--------------------------------------\n");

		// Loop
		while (true) 
		{
			System.out.println("Skriv inn Celcius: ");

			// Registrering av input
			Scanner scan = new Scanner(System.in);

			// Setter input inn i en variabel
			int cTemp = scan.nextInt();

			// Utregning og legger resultatet inn i cTemp variabelen
			double fTemp = ((9.0 / 5.0) * cTemp) + 32;

			// Resultatet
			System.out.println("\nFahrenheit i Celcius: " + fTemp);

			// Kj¿r loop eller avslutte
			System.out.println("\n¯nsker du Œ skrive inn en ny konvertering? (ja/nei)");

			// Om svaret er nei sŒ kj¿res
			String svar = scan.next();
			if (svar.equals("nei")) {

				// Avslutter program og printer avsluttningsmelding
				System.out.println("\n Programmet er avsluttet.");
				System.exit(0);
			} 
			
			else 
			{
				// r¿dde opp i print
				System.out.println("\n");
			}
		}

	}
}
