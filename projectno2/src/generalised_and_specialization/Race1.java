package generalised_and_specialization;
//specialized program
public class Race1 
{
	public static void main(String[] args) 
	   {
		 Bikestart(new HeroHonda());
		 Bikestart(new Duke());
		 Bikestart(new RoyalEnfield());
	   }
	   public static void Bikestart(HeroHonda h)
	   {
		   h.start();
	   }
	   public static void Bikestart(Duke d)
	   {
		   d.start();
	   }
	   public static void Bikestart(RoyalEnfield r)
	   {
		   r.start();
	   }
}
