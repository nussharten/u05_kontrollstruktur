// u05_kontrollstruktur
// auf5.26

import java.io.*;

public class Zahlungsplan3
{
   public static void main(String[] args)
   throws Exception
      {
			InputStreamReader eingabeLeser;
			BufferedReader    gepufferterLeser;

		   System.out.println();
         String            eingabeText = "";
         int               kreditBetrag = 0;

			eingabeLeser      = new InputStreamReader(System.in);
			gepufferterLeser  = new BufferedReader(eingabeLeser);

			System.out.println("Geben Sie bitte den Kreditbetrag ein: ");

			eingabeText      = gepufferterLeser.readLine();
			kreditBetrag     = Integer.parseInt(eingabeText);

		   int anzahlRat = 6;
		   int rate      = kreditBetrag / anzahlRat;

		   System.out.println();
		   System.out.println("Zahlungsplan");
		   System.out.println("============");
		   for(int i = 1; i <=6; i++)

		{
			System.out.println(i + ". Rate: " + rate + " Euro");
		}		
   }
}
