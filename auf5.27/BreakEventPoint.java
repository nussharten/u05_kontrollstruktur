// u05_kontrollstruktur
// auf5.27


public class BreakEventPoint
{
   public static void main(String[] args)
      {
			int verkaufspreis  = 1500;
			int rohstoffkosten = 600;
			int arbeitskosten  = 400;
			int fixkosten      = 5000;
    		int maxStueckzahl  = 15;

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

				//System.out.println ("Stueckzahl: | Gesamtkosten: | Erloes: | Ueberschuss:"); 
				System.out.println ();
				System.out.printf ("Stueckzahl:%3d  Gesamtkosten:%6d  Erloes:%6d  Ueberschuss:%7d", i, gesamtkosten, erloes, ueberschuss);
			} 
		}
}
