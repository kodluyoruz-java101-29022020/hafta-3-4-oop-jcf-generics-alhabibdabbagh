package address;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import account.User;

public class AddressManager {
	private String addres;
	private User user;
	public AddressManager() {
		
	}
	
	//Address[] AddressListe;
	
public static User ekleAddresDizisi(User user,Address address) {
	  if (user != null) {
          if (user.getAdressList().size() == 0) {
              ArrayList<Address> addressArrayList = new ArrayList<>();
              addressArrayList.add(address);
              user.setAdressList(addressArrayList);
          } else {
              user.getAdressList();
          }
      }
      return user;
	
	
	
}
public static User cikarAddresDizisi(User user,Address address) {
	
	  if (user != null) {
          if (user.getAdressList().size() > 0) {
              user.getAdressList().remove(address);
          }
      }
      return user;
	
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
