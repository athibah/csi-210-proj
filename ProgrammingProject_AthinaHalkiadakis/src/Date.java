import java.util.StringTokenizer;
//creating java util string tokenizer and public class date
public class Date {
	
	private static int month;
	private static int day;
	private static int year;
	
	public Date(String date) {
		
		StringTokenizer st = new StringTokenizer(date,"/");
		month = Integer.parseInt(st.nextToken());
		day = Integer.parseInt(st.nextToken());
		year = Integer.parseInt(st.nextToken());
		
		
		toString();
		
		
	}
	public  String toString() {
     return "Month " + month + " Day " + day + " year" ;
	}
}
