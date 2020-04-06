package account;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import insurance.Insurance;

public class AccountManager implements Comparable<Object>  {
Set<Insurance> accontHeasplari ;
ArrayList<Account> AccountUserindenUserler;
public void  login (String email, String password) {
	
	
	
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((accontHeasplari == null) ? 0 : accontHeasplari.hashCode());
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
	AccountManager other = (AccountManager) obj;
	if (accontHeasplari == null) {
		if (other.accontHeasplari != null)
			return false;
	} else if (!accontHeasplari.equals(other.accontHeasplari))
		return false;
	return true;
}



@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

}
