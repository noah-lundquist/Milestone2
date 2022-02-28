package app;

import java.util.Scanner;

public class Store {
	int input;
	int mult;
	double time;
	int proceed;
	
	
	public static void welcome()
	{
		double time;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Welcome to the store front our hours are between 900 and 1700(military time)");
		System.out.print("What Time is it(military time)? ");
		time = keyboard.nextInt();
		//if between 9 and 5 military time store is closed upon closed program exits
		if(time>=900 && time<=1700) {
			System.out.println("The store is open please proceed");
		}
		else {
			System.out.println("the store is closed");
			System.exit(0);
		}
	}
	
	static void continuePurchase()
	{
		
		int proceed;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 1 if you would like to proceed, enter another number if not");
		proceed = keyboard.nextInt();
		
		//the first if statement will remove the cost of the product from the person's bank once we set up that clsass
		
		if(proceed == 1)
		{
			System.out.println("thank you for your purchase");
		}
		else {
			System.out.println("Don't want to purchase? please come back later for more deals");
		}
	}
	
	static void purchase()
	{
		int input;
		int mult;
		//Sets objects
		Weapons Shotgun = new Weapons("Shotgun", 150, "Weapon", 1, 1);
		Weapons Sword = new Weapons("Sword", 220, "Weapon", 1, 4);
		Armor Shield = new Armor("Shield", 300, "Armor", 2, 35);
		Armor Helmet = new Armor("Helmet", 400, "Armor", 1, 20);
		Heals health = new Heals("Health", 600, "Health", 1, 100);
		
		//Scsanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter product name ");
		
		input = keyboard.nextInt();
		System.out.println("Enter product quanity  ");
		mult = keyboard.nextInt();
		
		//Based on input, prints the product selected and quanity ordered, price is multipled by quanity
		if(input == 1 && input !=2 && input !=3 && input !=4 && input !=5)
		{
			System.out.println("you ordered " +Shotgun.getQuanity()*mult+ " "+Shotgun.getName());
			System.out.println("That will be " +Shotgun.getPrice()*mult);
		}
		else if(input == 2 && input !=1 && input !=3 && input !=4 && input !=5)
		{
			System.out.println("you ordered " +Sword.getQuanity()*mult+ " "+Sword.getName());
			System.out.println("That will be " +Sword.getPrice()*mult);
		}
		else if(input == 3 && input !=1 && input !=2 && input !=4 && input !=5)
		{
			System.out.println("you ordered " +Shield.getQuanity()+ " "+Shield.getName());
			System.out.println("That will be " +Shield.getPrice());
		}
		else if(input == 4 && input !=1 && input !=3 && input !=2 && input !=5)
		{
			System.out.println("you ordered " +Helmet.getQuanity()*mult+ " "+Helmet.getName());
			System.out.println("That will be " +Helmet.getPrice()*mult);
		}
		else if(input== 5 && input !=1 && input !=3 && input !=4 && input !=2)
		{
			System.out.println("you ordered " +health.getQuanity()*mult+ " "+health.getName());
			System.out.println("That will be " +health.getPrice()*mult);
		}
		else
		{
			System.out.println("Product not avaialble");
		}
		
		
		
	}
	static void showallInventory()
	{
		//Gets current objects
		Weapons Shotgun = new Weapons("Shotgun", 150, "Weapon", 1, 1);
		Weapons Sword = new Weapons("Sword", 220, "Weapon", 1, 4);
		Armor Shield = new Armor("Shield", 300, "Armor", 2, 35);
		Armor Helmet = new Armor("Helmet", 400, "Armor", 1, 20);
		Heals health = new Heals("Health", 600, "Health", 1, 100);
	
		//Shows Current inventory
		System.out.println("Current Inventory: \n");
		System.out.println(Shotgun.name + " price: " + Double.toString(Shotgun.price)+ " Damage: " + Integer.toString(Shotgun.damage)+ " Product Number 1");
		System.out.println(Sword.name + " price: " + Double.toString(Sword.price) + " Damage: " + Integer.toString(Sword.damage)+  " Product Number 2");
		System.out.println(Shield.name + " price: " + Double.toString(Shield.price) + " addition to health: " + Integer.toString(Shield.damage)+  " Product Number 3");
		System.out.println(Helmet.name + " price: " + Double.toString(Helmet.price) + " addition to health: " + Integer.toString(Helmet.damage)+ " Product Number 4");
		System.out.println(health.name + " price: " + Double.toString(health.price) + " addition to health: " + Integer.toString(health.damage)+ " Product Number 5");
	}
	
}
