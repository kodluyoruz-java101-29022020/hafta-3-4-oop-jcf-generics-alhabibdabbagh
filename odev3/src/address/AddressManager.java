package address;

import java.util.ArrayList;

import account.User;

public class AddressManager {
	private String addres;
	
	public AddressManager() {
		
	}
	
	//Address[] AddressListe;
	
public static String ekleDizisi(ArrayList<Address> addressManger) {
	
	String x="";
	for(Address addressFor:addressManger) {
		
	x+=addressFor.Addresses(addressManger);
		
		
	}
		return x;
	
}
public static String cikarDizisi(ArrayList<Address> addressManger) {
	
	String x="";
	for(Address addressFor:addressManger) {
		
	x=addressFor.Addresses(addressManger);
	
		
		
	}
		return x;
	
}

public String getAddres() {
	return addres;
}

public void setAddres(String addres) {
	this.addres = addres;
}

//public static User cikarmaDizisi(User[] us1) {
//	return new User();
//}
}
