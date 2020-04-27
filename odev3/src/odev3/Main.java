package odev3;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import account.Account;
import account.AccountManager;
import account.AuthenticationStatus;
import account.User;
import address.Address;
import address.AddressManager;
import address.BusinessAddress;
import address.HomeAddress;
import insurance.CarInsurance;
import insurance.Insurance;
import soru2.bagliList.BagliList;
import userAccount.Enterprise;
import userAccount.Individual;

public class Main {
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int question=0;
		// TODO Auto-generated method stub
		while (question!=3) {
			System.out.println(" which questions do you want \n 1.Insurance\n 2.GenericList\n exit 3");

			 question = s.nextInt();
			switch (question) {

			case 1:
				login();
				break;

			case 2:
				myList();
				break;

			case 3:
				System.out.println("log out");
				break;

			default:
				System.out.println("yanlış sayı giriniz ");
				break;

			}
		}

//		ArrayList<Address> habib1 =new ArrayList<Address>();
//		habib1.add(new HomeAddress());
//		habib1.add(new BusinessAddress());
//		
//			String habib =AddressManager.ekleDizisi(habib1);
//			System.out.println(habib+" ");	
		// User us =new User("e","p");
		// Account s=new User("e","p");

	}

	private static void yazdirAccount(TreeSet<Account> accountDizi) {
		for (Account arr : accountDizi) {
			System.out.print(arr.getUser().getName() + " " + arr.getAccountList().size() + " ");
			System.out.println(arr.getInsurance() + " " + arr.getAuthenticationStatus().name());
		}
	}

	private static void yazdirUser(User userBilgileri) {

		System.out.print(userBilgileri.getAge() + " " + userBilgileri.getEmail() + " ");
		System.out.println(userBilgileri.getName() + " " + userBilgileri.getSurname());
	}

	private static ArrayList<Address> createAddress(String type) {
		ArrayList<Address> addresses = new ArrayList<>();
		if (type.equals("kurumsal")) {
			addresses.add(new HomeAddress());

		} else if (type.equals("bireysel")) {
			addresses.add(new BusinessAddress());
			addresses.add(new HomeAddress());

		}
		return addresses;
	}

	private static User newUser(String type) {
		User newUser = new User();

		if (type.equals("kurumsal")) {
			newUser.setAdressList(createAddress(type));
			newUser.setEmail("habibdbbagh@live.com");
			newUser.setSurname("dabbagh");
			newUser.setName("habib");
			newUser.setAge(55);

		} else if (type.equals("bireysel")) {
			// currentUser.setAdressList(createAddress(type));
			newUser.setAdressList(createAddress(type));
			newUser.setName("habib1");
			newUser.setEmail("habibdbbagh@live.com");
			newUser.setAge(14);
			newUser.setSurname("bireysel");

		}
		yazdirUser(newUser);
		return newUser;
	}

	public static TreeSet<Account> fillAccount() {
		TreeSet<Account> accounts = new TreeSet<>();

		Account enterpriseAccount = new Enterprise();
		enterpriseAccount.setAuthenticationStatus(AuthenticationStatus.FAIL);

		enterpriseAccount.setUser(newUser("kurumsal"));

		Account individualAccount = new Individual();
		individualAccount.setAuthenticationStatus(AuthenticationStatus.FAIL);

		individualAccount.setUser(newUser("bireysel"));

		/*
		 * TODO baslangıc ıcın 2 adet kullanıcı olusturuldu login olma durumu bu ıkı
		 * kullanıcı uzerınden devam edicek
		 */
		accounts.add(enterpriseAccount);
		accounts.add(individualAccount);
		yazdirAccount(accounts);
		return accounts;
	}

	private static void login() {

		System.out.print("email :");
		String email = s.nextLine();
		s.nextLine();
		System.out.print(" password :");
		String password = s.nextLine();
		AccountManager accountManager = new AccountManager(fillAccount());
		Account account = accountManager.login("habibdbbagh@live.com", password);
//		if (email.equals(account.getUser().getEmail())) {
//			System.out.println("user login");
//		}else {
//			System.out.println("user Fail  ");
//		}

	}

	public static void myList() {
		BagliList myList = new BagliList();
//	myList.insert(0);// burda bagli list ama tek yonlu 
//	myList.insert(1);// ekleme
//	myList.insert(2);
//	myList.insertAtStart(8);// başıya ekleme
//	myList.insert(3);
//
//	myList.delete(2);// silme
//	myList.insertAt(0, 6);// istediginiz index ekleme

		// Çift Yönlü

		System.out.println("Do you want put  the variable in myList? y/n");
		s.nextLine();// String bazi hatalari var o yuzden iki kere yazdirmak lazim
		String list = s.nextLine();

		if (list.equalsIgnoreCase("y")) {
			System.out.println("MyList size?");
			int size = s.nextInt();

			for (int i = 0; i < size; i++) {
				System.out.println("myList wait elements");
				myList.insertDoubly(s.nextInt());
			}
			myList.show();

		} else {

			myList.insertDoubly(1);// ekleme
			myList.insertDoubly(2);
			myList.insertDoubly(3);
			myList.insertDoubly(4);
			myList.deleteDoubly(2); // silme
			myList.insertAtDoubly(1, 9); // istediginiz index ekleme
			myList.insertAtStratDoubly(8); // başıya ekleme

			myList.show(); // yazdırma

			
		}
		
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("List size ");
		stringBuilder.append(" \n");
		stringBuilder.append(myList.sizeDoubly());
		stringBuilder.append(" \n");
		stringBuilder.append("Get The value By index {1}");
		stringBuilder.append(" ");
		stringBuilder.append(" \n");
		stringBuilder.append(myList.getDoubly(1));
		stringBuilder.append(" \n");
		stringBuilder.append("you can do also insertAtDoubly(index, value )");
		
		stringBuilder.append(" ");
		System.out.println(stringBuilder.toString());
//		System.out.println("List size");
//		System.out.println(myList.sizeDoubly());// listenin size
//
//		System.out.println("Get The value By index {1}");
//		System.out.println(myList.getDoubly(1));// istediğimiz eleman valuesu getir
//		System.out.println("you can do also insertAtDoubly(index, value )");
//		System.out.println();
	}

}
