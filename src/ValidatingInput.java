import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatingInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;
		String userEmail;
		String userPhoneNum;
		String userDate;
		boolean prompt;
		
		System.out.println("Please enter a valid name: ");
		userName = scan.nextLine();
		prompt = isName(userName);
		
		System.out.println("Please enter a valid email address: ");
		userEmail = scan.nextLine();
		prompt = isEmail(userEmail);
		
		System.out.println("Please enter a valid phone number: ");
		userPhoneNum = scan.nextLine();
		prompt = isPhone(userPhoneNum);
		
		System.out.println("Please enter a valid date: ");
		userDate = scan.nextLine();
		prompt = isDate(userDate);
		
		
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
	       if(Pattern.matches("[A-Za-z0-9]{5,30}@[A-Za-z0-9]{5,10}.[A-Za-z0-9]{2,3}",s)) {
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
	       if(Pattern.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/([0-9]{4})/",s)) {
	          System.out.println("That is a valid date!");
	    	   return true;
	       }
	       System.out.println("Date is invalid!");
	       return false;
	   }
	
	
}
