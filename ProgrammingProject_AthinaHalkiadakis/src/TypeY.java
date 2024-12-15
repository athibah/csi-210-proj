//introducing public class Type Y, with variables price and quantity. The output depends on the number of requested units.
public class TypeY  extends Products {
	private String productName;
	private Double regularPrice;
	private int idCounter = 0;
	private int productID = 0;
//type X consists of the variables price and quantity, and return is price * quantity
public static double typeX(double price, int quantity) {
return price *  quantity;	
}

public TypeY(String productName, Double regularPrice) {
	super( productName, regularPrice, "Type y");
	this.productName = productName;
	this.regularPrice = regularPrice;
	idCounter++;
	productID = idCounter;

}

public double getRegularPrice(int quantity) {
	double total = regularPrice * quantity;
//Creating a if else if statement which entails if a customer buys 100 or more units but less than 500, then a 5% discount will apply; 500 or more units but less than 1500
// a 15% discount will apply; 1500 or more units – 25% discount will apply.
if (quantity >=100 && quantity <500) {
total = total * 0.95;
}
else if (quantity >=500 && quantity <1500) {
total =  total *0.85;
}
else if (quantity >=1500) {
total = total *0.75;

}
return total;

}
public void toString() {
	System.out.println(productID +  "Type y " + productName +" "+ regularPrice);
}
}
