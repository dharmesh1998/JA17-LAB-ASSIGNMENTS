import java.util.Scanner;

public class UsernamePasswordValidationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);
		UsernamePasswordValidationUsingLambdaExpression upv = (username,password)->{
			return (username.equals("dharmesh") && password.equals("soni"));
		};
		
		System.out.print("Enter the username : ");
		String username=sm.next();
		
		System.out.print("Enter the password : ");
		String password=sm.next();
		
		System.out.println("\nAuthentication Status : "+upv.validateusername_password(username, password));
		sm.close();
	}

}
