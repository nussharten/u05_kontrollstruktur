// u05_kontrollstruktur
// auf5.07a

public class Wochenblatt
{
   public static void main(String[] args)
      {
         System.out.println("Zustellung Wochenblatt");
         System.out.println();

         for(int hausNr = 5; hausNr <= 7;  hausNr++)
         {
         System.out.println("Ich betrette Nr " +  hausNr);
         

         for(int stock = 0; stock <=3; stock++)
          {         
          System.out.println("Zugestellt in Nr " + hausNr + ", " + stock + ".Stock");
          }
           System.out.println();
          }
      }  
}
