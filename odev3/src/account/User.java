package account;

import java.util.ArrayList;
import java.util.Date;

import address.Address;
import exception.InvalidAuthenticationException;

public class User {

	
private	String name;
private	String surname;
private	String email;
private String password;
private String profession;
private int age;
private ArrayList<Address> adressList;
private Date lastLoginToSystem;
	
	
	public User() {
		
	}
	public User(String Name,String Surname,String Email, String Password,String Profession,int Age) {
		this.name=Name;
		this.surname=Surname;
		this.email=Email;
		this.password=Password;
		this.profession=Profession;
		this.age=Age;
		
	}
	
	public User(String email ,String password) {
		this.email=email;
		this.password=password;
	}
	
	
	public  int login(String email  , String password)throws InvalidAuthenticationException  {
		if (this.email.equals(email) && this.password.equals(password)) {
			AuthenticationStatus stat =  AuthenticationStatus.SUCCESS;
			  return 1;
		}
		AuthenticationStatus stat =  AuthenticationStatus.FAIL;
		System.out.println(stat);
		return 0;
	}
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<?> getAdressList() {
		return adressList;
	}
	public void setAdressList(ArrayList<Address> adressList) {
		this.adressList = adressList;
	}
	public Date getLastLoginToSystem() {
		return lastLoginToSystem;
	}
	public void setLastLoginToSystem(Date lastLoginToSystem) {
		this.lastLoginToSystem = lastLoginToSystem;
	}
	
	
}
