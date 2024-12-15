import java.util.StringTokenizer;
//setting public class order
public class Order {
	
	public Order(String userName, String dateEntered, int amount, int ID){
		
		StringTokenizer st = new StringTokenizer(dateEntered, "/");
		int day = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		Products products [] = MainMethod.getArrayOfProducts();
		 Date date = new Date(dateEntered);
		 double total = 0;
		  if(ID >= 1 && ID <= 4) {
			  total = products[ID -1 ].getRegularPrice(amount);
		  }
		  else if(ID >= 5 && ID <= 5) {
			  total = products[ID -1 ].getRegularPrice(day, month ,amount);
		  }
		
		//prompting user for name, id, type
		System.out.println("----------------------------------------------");
		System.out.println(date);
		System.out.println("----------------------------------------------");
		System.out.println(userName);
		System.out.println("Your item");
		System.out.println("----------------------------------------------");
		System.out.println("ID     TYPE        NAME            PRICE      ");
		System.out.println("----------------------------------------------");
		products[ID = 1].toString();
		System.out.println("you selected a number of " + amount +" of products");
		System.out.println("total is " +((int)total) + " and " +Math.round((total-(int)total)*100)+" cents"  ) ;
	}
	

}
