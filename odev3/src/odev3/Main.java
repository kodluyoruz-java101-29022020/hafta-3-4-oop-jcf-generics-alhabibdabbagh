package odev3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import account.Account;
import account.User;
import address.Address;
import address.AddressManager;
import address.BusinessAddress;
import address.HomeAddress;
import soru2.BagliList;

public class Main {
	public static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hangi soru istiyorsunuz \n çıkmak için 3");

int question=s.nextInt();
switch (question) {

case 1:
	
	break;
	
	
case 2:
myList();

	break;
	
	
case 3:
	break;
	
	default:
		System.out.println("yanlış sayı giriniz ");
		break;



}
		
//		ArrayList<Address> habib1 =new ArrayList<Address>();
//		habib1.add(new HomeAddress());
//		habib1.add(new BusinessAddress());
//		
//			String habib =AddressManager.ekleDizisi(habib1);
//			System.out.println(habib+" ");	
 //User us =new User("e","p");
		//Account s=new User("e","p");

	
	}



public  static void myList() {
	BagliList myList=new BagliList();
//	myList.insert(0);// burda bagli list ama tek yonlu 
//	myList.insert(1);// ekleme
//	myList.insert(2);
//	myList.insertAtStart(8);// başıya ekleme
//	myList.insert(3);
//
//	myList.delete(2);// silme
//	myList.insertAt(0, 6);// istediginiz index ekleme
	
	// Çift Yönlü 
	
	System.out.println("Siz  liste doldurmak istiyormusunuz? y/n");
	s.nextLine();//String bazi hatalari var o yuzden iki kere yazdirmak lazim 
	String list=s.nextLine();

	if(list.equalsIgnoreCase("y")) {
		System.out.println("list boyutu ?");
		int size =s.nextInt();
		
		
		for (int i = 0; i < size; i++) {
			System.out.println("list eleman bekliyor");
			myList.insertDoubly(s.nextInt());
		}
		myList.show();
		
	}else {
	
	myList.insertDoubly(1);// ekleme
	myList.insertDoubly(2);
	myList.insertDoubly(3);
	myList.insertDoubly(4);
	myList.deleteDoubly(2); // silme 
	myList.insertAtDoubly(1, 9); //istediginiz index ekleme
	myList.insertAtStratDoubly(8); // başıya ekleme

	myList.show(); // yazdırma 
	
	System.out.println("List size");
	System.out.println(myList.sizeDoubly());// listenin size 
	
	System.out.println("Get The value By index");
	System.out.println(myList.getDoubly(2));// istediğimiz eleman valuesu getir
}
}
	
	
}
