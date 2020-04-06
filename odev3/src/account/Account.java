package account;

import java.util.ArrayList;

import exception.InvalidAuthenticationException;
import insurance.Insurance;

public abstract class Account {
	private User user;
	public final void showUserInfo(ArrayList<User> musterBilgieriYazdir) {
	}
	
	AuthenticationStatus authenticationStatus;
	ArrayList<Insurance> insurance; 
	User user1 =new User("e", "p");
	User user2 =new User("e1", "p1");
	User user3 =new User("e2", "p2");
   ArrayList<Account> accountList=new ArrayList<Account>(2);

	
	public void kullanciLoginDurumu()  {
		
		int durum;
		try {
		user.setEmail("e");
		user.setPassword("p");

		//	user.kullanciLoginDurumu(); nullpointerException niye ??
//			User user1 =new User("e", "p");
//			User user2 =new User("e1", "p1");
//			User user3 =new User("e2", "p2");
			
			
			durum = user1.login("e", "p");
			if (durum==0) {
				 throw new InvalidAuthenticationException("yanlis giris yapildi");
			}
			System.out.println("girdi");
		} catch (InvalidAuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("girdi");
		
	}

public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

public abstract void SigortaPolicesi(Insurance insurance);
	
	
	
public  void kullanciAdresleriEkleme () {
	
	}
	


	public  void kullanciAdresleriCikarma () {
		
	}
	
	


}
