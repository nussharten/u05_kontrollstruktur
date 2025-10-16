// u05_kontrollstruktur
// auf5.28

public class BreakEvenPoint2
{
   public static void main(String[] args)
      {
			int verkaufspreis    = 1500;
			int rohstoffkosten   = 600;
			int arbeitskosten    = 400;
			int fixkosten        = 5000;
    		int maxStueckzahl    = 15;
			int breakEventstueck = 0;

			System.out.println ();
			System.out.println ("Break-Event-Point");
			System.out.println ("=================");

			System.out.println ("Verkaufspreis pro Stueck:  " + verkaufspreis);
			System.out.println ("Rohstoffkosten pro Stueck: " + rohstoffkosten);
			System.out.println ("Arbeitskosten pro Stueck:  " + arbeitskosten);
			System.out.println ("Fixkosten pro Monat:       " + fixkosten);
			System.out.println ("Maximale Stueckzahl pro Monat: " + maxStueckzahl);

			for (int i = 1; i <= maxStueckzahl; i++)
			{
				int variableKosten = (rohstoffkosten + arbeitskosten) * i;
				int gesamtkosten = fixkosten + variableKosten;
				int erloes = verkaufspreis * i;
				int ueberschuss = erloes - gesamtkosten;
            int stueckkosten   = gesamtkosten / i;
            int stueckUeberschuss = ueberschuss / i;
 
				System.out.println();
				System.out.printf("Stueckzahl:%3d  Stueckkosten:%6d  Ueberschuss pro Stueck:%7d", i, stueckkosten, stueckUeberschuss);

				if(breakEventstueck == 0 && ueberschuss >= 0)
				{
					breakEventstueck = i;
				}
			 }
					System.out.println ();
					System.out.println ();
					System.out.println("Es müssen mindestens " + breakEventstueck + " Stück produziert werden.");
					
		  }
}
