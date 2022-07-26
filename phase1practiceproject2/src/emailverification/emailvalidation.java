package emailverification;
import java.util.Scanner;
import java.util.regex.Pattern;
public class emailvalidation {

	public static void main(String[] args) {
		String email1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter email:");
			email1 = sc.next();
		}
		System.out.println(validatEmail(email1));

	}
	public static String validatEmail (String email) {
		if (email == null || email.isEmpty()) {
			return "invalid";
		}
		String emailRegex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(emailRegex);
		
		if (pattern.matcher(email).matches()){
			
			return "valid";
		}
		else {
			return "invalid";
		}
		 
		
	}

}
