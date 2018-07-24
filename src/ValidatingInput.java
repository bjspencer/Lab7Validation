import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatingInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;
		String userEmail;
		String userPhoneNum;
		String userDate;
				
		System.out.println("Please enter a valid name: ");
		userName = scan.nextLine();
		isName(userName);
		
		System.out.println("Please enter a valid email address: ");
		userEmail = scan.nextLine();
		isEmail(userEmail);
		
		System.out.println("Please enter a valid phone number: ");
		userPhoneNum = scan.nextLine();
		isPhone(userPhoneNum);
		
		System.out.println("Please enter a valid date: ");
		userDate = scan.nextLine();
		isDate(userDate);
		
		
		scan.close();
	}

	 public static boolean isName(String s) {
	       if(Pattern.matches("[A-Z][a-z]{0,29}",s)) {
	          
	    	   System.out.println("That is a valid name!");
	    	   return true;
	       }
	       System.out.println("Name is invalid!");
	       return false;
	   }
	  
	   public static boolean isEmail(String s) {
	       if(Pattern.matches("[A-Za-z0-9]{5,30}\\w+@[A-Za-z0-9]{5,10}\\.[A-Za-z]{2,3}",s)) {
	          System.out.println("That is a valid email address!");
	    	   return true;
	       }
	       System.out.println("Email address is invalid!");
	       return false;
	   }


	   public static boolean isPhone(String s) {
	       if(Pattern.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}",s)) {
	          System.out.println("That is a valid phone number!");
	    	   return true;
	       }
	       System.out.println("Phone number is invalid!");
	       return false;
	   }
	  
	   public static boolean isDate(String s) {
	       if(Pattern.matches("\\d{2}.\\d{2} .\\d{4}",s)) {
	          System.out.println("That is a valid date!");
	    	   return true;
	       }
	       System.out.println("Date is invalid!");
	       return false;
	   }
	
	
}
