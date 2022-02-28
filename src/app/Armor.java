package app;

public class Armor extends Product {

	public Armor(String name, double price, String category, int quanity, int damage) {
		super(name, price, category, quanity, damage);
		// TODO Auto-generated constructor stub
	}
	
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
		damage = damage -50;
		return damage;
	}


}
