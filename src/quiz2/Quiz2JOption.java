import javax.swing.JOptionPane;
public class Quiz2JOption {
	 static String username = "Mohamed";
	 static String password = "CSC201";
	 static String jOP_user;
	 static String jOP_password;
	 
	public static void main(String[] args) {
		JOpUser();
		JOpPassword();
		Quiz2.Authentication(username, password);
		ResultDisplay();
		
	}	
	public static String JOpUser(){
		jOP_user = JOptionPane.showInputDialog("Username:");
		return jOP_user;
	}
	public static String JOpPassword(){
		jOP_password = JOptionPane.showInputDialog("Password:");
		return jOP_password;
	}
	public static boolean ResultDisplay(){
		boolean result = false;
				if (Quiz2.Authentication(username, jOP_password)){ JOptionPane.showMessageDialog(null, "Welcome: " + username);
				result = true; }
				else {JOptionPane.showMessageDialog(null, "Wrong Username or Password! Please Try Again.");
				result = false;
				}
		return result;
	}

}
