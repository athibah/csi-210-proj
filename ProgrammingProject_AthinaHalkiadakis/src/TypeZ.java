//Introducing public class typeZ, with variables price, quantity, day, and month. The regular price multiplied by the number of units outside of the promotional period.
public class TypeZ  extends Products {
	
	private String productName;
	private Double regularPrice;
	private int idCounter = 0;
	private int productID = 0;
//type X consists of the variables price and quantity, and return is price * quantity

public TypeZ(String productName, Double regularPrice) {
	super( productName, regularPrice, "Type z");
	this.productName = productName;
	this.regularPrice = regularPrice;
	idCounter++;
	productID = idCounter;

}

public double getRegularPrice( int day, int month, int quantity) {
	double total = quantity * regularPrice;
	double promotion;
	
//Products of type Z are seasonable. During the 30-day period starting September 15th of each
//year, customers can buy 2 candles and get the 3rd free. 
	
if (month == 9 && day >= 15) {
	 promotion = (regularPrice * 2) / 3;
total = promotion * quantity;
}
else if(month == 10 && day<=14) {
	 promotion = (regularPrice * 2) / 3;
total = quantity * promotion; 
}
return total;
}
public void toString() {
	System.out.println(productID +  "Type Z " + productName +" "+ regularPrice);
}
}
