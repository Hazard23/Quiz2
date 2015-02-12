import java.util.Scanner;

public class Quiz2 {
	//Declared All the variables I need, that can be used in all methods. 
	static Scanner keyboard = new Scanner(System.in); 
	 static String username; static String password;
	static String right_username = "Mohamed"; 
	  static String right_password = "CSC201";
	 
	 public static void main(String[] args) {
		
		Display();
		Authentication(username, password);
	 }
	//Display Method
	 public static void Display(){
	
		System.out.println("User Name:");
		User( );
		System.out.println("Password:");
		Password();
	}
   //Username input method
	 public static String User(){
	 username = keyboard.next();
	 return username;
   }
   //Password input method
	 public static String Password(){
	 password = keyboard.next();
	 return password;
   }
   //Authentication usable across all platforms
	 public static boolean Authentication(String username, String password){
	   
	   boolean result = false;
	   if (right_username.equalsIgnoreCase(username) && right_password.equals(password)){ 
		   System.out.println("Welcome: " +username +"!");
		 result = true;
	}  else  {                                                                                                                                                                  
		System.out.println("Wrong Username or Password! Please try again.");
			result = false;}
	   return result;
   }
}