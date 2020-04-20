package account;

import java.util.ArrayList;

import exception.InvalidAuthenticationException;
import insurance.Insurance;

public abstract class Account implements Comparable<Account> {
	private User user;
	private AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;
	private ArrayList<Insurance> insurance;

	public Account(User user, ArrayList<Insurance> insurancesList, AuthenticationStatus autherAuthenticationStatus) {
		this.user = user;
		this.insurance = insurancesList;
		this.authenticationStatus = autherAuthenticationStatus;
	}

	public Account() {

	}

	public final void showUserInfo() {
		if (this.user != null) {
			System.out.print("Name " + this.user.getName() + "LastName " + this.user.getSurname() + " ");
			System.out.println("Age " + this.user.getAge() + "Email " + this.user.getEmail());
		} else {
			System.out.println("no user in list ");
		}

	}

	public AuthenticationStatus getAuthenticationStatus() {
		return authenticationStatus;
	}

	public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}

	public ArrayList<Insurance> getInsurance() {
		return insurance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountList == null) ? 0 : accountList.hashCode());
		result = prime * result + ((authenticationStatus == null) ? 0 : authenticationStatus.hashCode());
		result = prime * result + ((insurance == null) ? 0 : insurance.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountList == null) {
			if (other.accountList != null)
				return false;
		} else if (!accountList.equals(other.accountList))
			return false;
		if (authenticationStatus != other.authenticationStatus)
			return false;
		if (insurance == null) {
			if (other.insurance != null)
				return false;
		} else if (!insurance.equals(other.insurance))
			return false;
		return true;
	}

	public void setInsurance(ArrayList<Insurance> insurance) {
		this.insurance = insurance;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	User user1 = new User("e", "p");
	User user2 = new User("e1", "p1");
	User user3 = new User("e2", "p2");
	ArrayList<Account> accountList = new ArrayList<Account>(2);

	public void kullanciLoginDurumu() {

		int durum;
		try {
			user.setEmail("e");
			user.setPassword("p");

			// user.kullanciLoginDurumu(); nullpointerException niye ??
//			User user1 =new User("e", "p");
//			User user2 =new User("e1", "p1");
//			User user3 =new User("e2", "p2");

			durum = user1.login("e", "p");
			if (durum == 0) {
				throw new InvalidAuthenticationException("yanlis giris yapildi");
			}
			System.out.println("girdi");
		} catch (InvalidAuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("girdi");

	}

	public static AuthenticationStatus returnLoginDetail(String email, String password) {
		if (email == null) {
			return AuthenticationStatus.FAIL;
		} else if (password == null) {
			return AuthenticationStatus.FAIL;
		}
		return AuthenticationStatus.SUCCESS;
	}

	public void loginUser(String email, String password) throws InvalidAuthenticationException {
		if (returnLoginDetail(email, password) == AuthenticationStatus.SUCCESS) {
			if (user != null) {
				if (user.getEmail() != null) {
					if (email.equals(user.getEmail())) {
						authenticationStatus = AuthenticationStatus.SUCCESS;
					}
				}
			}
		} else {
			authenticationStatus = AuthenticationStatus.FAIL;
		}
		authenticationStatus = AuthenticationStatus.FAIL;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public abstract void  ekleSigortaPolicesi(Insurance insurance);

	public void kullanciAdresleriEkleme() {

	}

	public void kullanciAdresleriCikarma() {

	}

}
