package generalised_and_specialization;
//generalization program
public class Race
{
	//this method can handle all type's of Bike
   public static void main(String[] args) 
   {
	 Bikestart(new HeroHonda());
	 Bikestart(new Duke());
	 Bikestart(new RoyalEnfield());
   }
   public static void Bikestart(Bike b)
   {
	   b.start();
   }
}
