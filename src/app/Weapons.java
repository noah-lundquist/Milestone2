package app;

public class Weapons extends Product{

	public Weapons(String name, double price, String category, int quanity, int damage) {
		super(name, price, category, quanity, damage);
		
		
	}
	
	//gets name
			public String getName()
			{
				return name;
			}
			//gets price
			public double getPrice()
			{
				price = quanity * price;
				return price;
			}
			//get category
			public String getCategory()
			{
				return category;
			}
			// gets quanity
			public int getQuanity()
			{
				quanity = quanity *1;
				return quanity;
			}
			public int getDamage()
			{
				damage = damage *10;
				return damage;
			}
			
			
}
