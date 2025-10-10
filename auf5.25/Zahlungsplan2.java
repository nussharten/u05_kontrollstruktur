// u05_kontrollstruktur
// auf5.25

public class Zahlungsplan2
{
   public static void main(String[] args)
   {

		int betrag    = 520;       
		int rate      = 100;
		int anzahlRat = betrag / rate;
		int lastRate  = betrag % rate;

		System.out.println();
		System.out.println("Zahlungsplan");
		System.out.println("============");
		for(int i = 1; i <=anzahlRat; i++)

		{
			System.out.println(i + ". Rate: 100 Euro");
		}	
		if(lastRate < 100);		
		{
			System.out.println((anzahlRat + 1) + ". Rate: " + lastRate + " Euro");
		}	
   }
}
