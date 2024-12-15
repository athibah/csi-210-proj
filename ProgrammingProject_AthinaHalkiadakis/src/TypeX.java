//introducing public class Type X, does not depend on season or quantity. The output is the price multiplied by the number of units.
public class TypeX  extends Products {
	private String productName;
	private Double regularPrice;
	private int idCounter = 0;
	private int productID = 0;
//type X consists of the variables price and quantity, and return is price * quantity

public TypeX(String productName, Double regularPrice) {
	super( productName, regularPrice, "Type x");
	this.productName = productName;
	this.regularPrice = regularPrice;
	idCounter++;
	productID = idCounter;

}
@Override
public double getRegularPrice(int quantity) {
	return regularPrice * quantity;	}


public void toString() {
	System.out.println(productID +  "Type X " + productName +" "+ regularPrice);
}

}
