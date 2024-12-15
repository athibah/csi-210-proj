
//ICSI 201 Introduction to Computer Science
//Fall 2021
//TA Josue Ruiz
//Written by Athina Halkiadakis

	//The purpose of this program was to create an inventory enlisting types of candles, their prices, id number, and type they are varying from X, Y, and Z. Candles range
    //from prices of 4.25 or 4.50. For type X candles, the output is the price multiplied by the number of units. For type Y candles, The output depends on the number of requested units.
   //For type Z, The regular price is multiplied by the number of units outside of the promotional period. The program prompts the user for the type of candle they want,
   //whether that be pumpkin, vanilla, rose, lavender, jasmine, or mango candle and asks for the amount, and gives them the price. 

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
	//Setting the MainMethod up, with Scanner keyboard along with all my variables varying from doubles to integers. 
	public class MainMethod {
	
		public static Products products1 [] = new Products[100];

	public static void main(String args[]) throws IOException {
	Scanner keyboard = new Scanner(System.in);

	Order order;
	
	int ID; // Id number 
	int quantity; // Amount of candles
    String date;
    String userName;
	String stop;
	

	
	do {
	//Thanking the user for choosing the candle shop, introducing the promotion available if the user buys a candle between those two dates. 	
	System.out.println("Thank you for choosing our candle shop. <3");
	System.out.println("If you purchase between the dates September 15th and October 14th, you get a promotion of buy 2, get one free!");
	//Asking the user for the date of purchase: Month, day, and year.
	System.out.println("Enter the date of purchase.");
	date = keyboard.nextLine();
	System.out.println("Enter your name");
	userName = keyboard.nextLine();
	
   //Introducing the menu of candles, with types of candles, price, ID number, and type X, Y, or Z.
	System.out.println("The inventory:\n"
		+ "Candles         Price   ID   Type\n"
		+ "Pumpkin Candle  $4.50   1    Type X\n"
		+ "Vanilla Candle  $4.25   2    Type X\n"
		+ "Rose Candle     $4.25   3    Type Y\n"
		+ "Lavender Candle $4.50   4    Type Y\n"
		+ "Jasmine Candle  $4.50   5    Type Z\n"
		+ "Mango Candle    $4.50   6    Type Z"); 
	
	//Asking user for the ID of candle choice.
	System.out.println("Enter the ID for your candle choice.");
	ID = keyboard.nextInt();

	//Prompting the user for the amount of candles they'd want to purchase. 
	System.out.println("Enter the amount of candles you'd like. <3");
	quantity = keyboard.nextInt();
	order = new Order(userName, date, quantity, ID);
	

	//Asking the user if they want to stop purchasing, and using a stop.equalsIgnoreCase to end the loop if they say they want to stop purchasing.
	System.out.println("Do you want to stop?");
	keyboard.nextLine();
	stop = keyboard.nextLine();
	}while(stop.equalsIgnoreCase("No"));
	//Thanking the user for shopping with us.
	System.out.println("Thank you for shopping with us. <3");
}


	//creating array of products
	public static Products[] getArrayOfProducts() {
		return products1;
	}
	
	public static void array() throws IOException {
		//	FileReader file = new FileReader("InventoryInfo.txt");
		BufferedReader bf = new BufferedReader(new FileReader("InventoryInfo.txt"));
		int index = 1;
		
		String item;
		item = bf.readLine();
		
		while(item != null) {
		StringTokenizer st = new StringTokenizer(item, "|");
		String name = st.nextToken();
		String price = st.nextToken();;
		String id = st.nextToken();;
		String type = st.nextToken();
		
		//creating switch and case statement
		switch(type) {
		case "type x":{
			products1[index] = new TypeX(name, Double.parseDouble(price));
			index++;
			break;
		}
		case "type y":{
			products1[index] = new TypeY(name, Double.parseDouble(price));
			index++;
			break;
		}
		case "type z":{
			products1[index] = new TypeZ(name, Double.parseDouble(price));
			index++;
			break;
		}
		}
		
		
		}
	bf.close();
	}
		
	}
 	
	





