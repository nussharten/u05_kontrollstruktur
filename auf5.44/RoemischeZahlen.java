// u05_kontrollstruktur
// auf5.44

import java.io.*;

public class RoemischeZahlen
{
   public static void main(String[] args) throws Exception
      {
			String roemischeZahl;
			int  arabischeZahl = 0;

			InputStreamReader eingabeLeser     = new InputStreamReader(System.in);
			BufferedReader    gepufferterLeser = new BufferedReader(eingabeLeser);

			roemischeZahl = gepufferterLeser.readLine();
			System.out.println();

			for(int i = 0; i < roemischeZahl.length(); i++)
			{
				char roemischChar = roemischeZahl.charAt(i);
				char roemischCharNext = '0';

				if(roemischeZahl.length() > i + 1)
				{
					roemischCharNext = roemischeZahl.charAt(i + 1);
				}

				if(roemischChar  == 'I')
				{
					System.out.println(roemischCharNext);

				if(roemischCharNext  == 'V' || roemischCharNext == 'X')
				{
					arabischeZahl = arabischeZahl - 1;
				}
				else 
            {
					arabischeZahl = arabischeZahl + 1;
				}
			 }
				else if(roemischChar == 'V')
				{
					arabischeZahl = arabischeZahl + 5;
				}
				else if(roemischChar == 'X')
				{
					arabischeZahl = arabischeZahl + 10;
				}
				else if(roemischChar == 'L')
				{
					arabischeZahl = arabischeZahl + 50;
				}
				else if(roemischChar == 'C')
				{
					arabischeZahl = arabischeZahl + 100;
				}
				else if(roemischChar == 'D')
				{
					arabischeZahl = arabischeZahl + 500;
				}
				else if(roemischChar == 'M')
				{
					arabischeZahl = arabischeZahl + 1000;
				}
			}
		   System.out.print(arabischeZahl);
			System.out.println();
		}
}






























