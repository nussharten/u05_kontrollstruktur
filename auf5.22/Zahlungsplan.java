// u05_kontrollstruktur
// auf5.22


public class Zahlungsplan
{
   public static void main(String[] args)
   {
		int betrag    = 300;
		int anzahlRat = 6;
		int rate      = betrag / anzahlRat;

		System.out.println();
		System.out.println("Zahlungsplan");
		System.out.println("============");
		for(int i = 1; i <=6; i++)

		{
			System.out.println(i + ". Rate: " + rate + " Euro");
		}			
   }
}
