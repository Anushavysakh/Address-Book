package com.addressbook.bridglabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Uc2 {
	ArrayList<ArrayList<String>> contact = new ArrayList<ArrayList<String>>();

	public static void contactInfo() {
		ArrayList<ArrayList<String>> contact = new ArrayList<ArrayList<String>>();
		Scanner sc = new Scanner(System.in);
		ArrayList<String> addInfo = new ArrayList<String>();
		System.out.println("Enter First name : ");
		addInfo.add(sc.next());
		System.out.println("Enter Last name : ");
		addInfo.add(sc.next());
		System.out.println("Enter Address : ");
		addInfo.add(sc.next());
		System.out.println("Enter City : ");
		addInfo.add(sc.next());
		System.out.println("Enter State : ");
		addInfo.add(sc.next());
		System.out.println("Enter Zip : ");
		addInfo.add(sc.next());
		System.out.println("Enter Email address : ");
		addInfo.add(sc.next());
		System.out.println("Enter Contact number : ");
		addInfo.add(sc.next());
		contact.add(addInfo);
		System.out.println("The contact has been added to the Address Book");
		for (int i = 0; i < contact.size(); i++) {
			for (int j = 0; j < contact.get(i).size(); j++) {
				System.out.print(contact.get(i).get(j) + " ");
			}
		}
	}

	public static void addNew() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to add another contact to the Address Book? (Y/N)");
		String choice = sc.next();
		if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
			contactInfo();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uc2 obj = new Uc2();
		obj.contactInfo();
		addNew();

	}
}
