//creating public class products
public class Products {
	
	private String name;
	private double price;
	private String type;
	private int productID = 0;
	private int idCounter = 0;
	
	public Products(String name, double price, String type){
		this.name = name;
		this.price = price;
		this.type = type;
		idCounter++;
		productID = idCounter;
		
	}
	public double getRegularPrice(int quantity) {
		return 0;
		}
	public double getRegularPrice(int day, int month, int quantity) {return 0;}

}
