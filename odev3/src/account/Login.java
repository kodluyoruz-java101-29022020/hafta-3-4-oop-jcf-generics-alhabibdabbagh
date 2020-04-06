package account;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	
	String email;
	String Password;
	Scanner s=new Scanner(System.in);
	
	public void loginIslemi() {
		System.out.println("email ve password girin");
		this.email=s.nextLine();
		this.Password=s.nextLine();
AccountManager accountmanager=new AccountManager();
accountmanager.login(this.email, this.Password);
		
	}
	
	
	
	
	
	
	

}
