package app;

import java.util.Scanner;


public class Product {
	// variables
	public String name;
	public double price;
	public String category;
	public int quanity;
	public int damage;
	
	
		
		// asseigns variables
		public Product(String name, double price, String category, int quanity, int damage)
		{
			super();
			this.name = name;
			this.price = price;
			this.category = category;
			this.quanity = quanity;
			this.damage = damage;
			
			
				
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
			
			return damage;
		}
		
		
			
			
			

}

	


