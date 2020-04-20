package account;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import exception.InvalidAuthenticationException;
import insurance.Insurance;

public class AccountManager {
	Set<Account> accontHeasplari;
	
public AccountManager(TreeSet<Account> accountTreeSet ) {
	this.accontHeasplari = accountTreeSet;
}
public AccountManager() {
	
}
	public Account login(String email, String password) {
		for (Account account : accontHeasplari) {
            if (account != null) {
                try {
                    account.loginUser(email, password);
                } catch (InvalidAuthenticationException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        }
        return null;
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



}
