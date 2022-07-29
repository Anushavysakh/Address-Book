package com.addressbook.bridglabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Uc5 {

	ArrayList<ArrayList<String>> contact = new ArrayList<ArrayList<String>>();
	Scanner sc = new Scanner(System.in);

	public void contactInfo() {
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
		System.out.println("Do you want to add another contact to the Address Book? (Y/N)");
		String choice = sc.next();
		if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
			contactInfo();
		} else {
			userChoice();
		}
	}
		 public void editContact() {
		        System.out.print("Please enter the First Name of the person you want to edit the contact of: ");
		        String name = sc.next();
		        for(int i = 0; i < contact.size(); i++){
		            //Check if contact exists or not
		            if(contact.get(i).contains(name)) {
		                System.out.println("What do you want to edit?");
		                for(int j = 0; j < contact.get(i).size(); j++) {
		                    System.out.println(j + ") " + contact.get(i).get(j));
		                }
		                System.out.print("Enter the Number Associated with the field you want to change: ");
		                int index = sc.nextInt();
		                System.out.print("Enter the new data for the field: ");
		                String newData = sc.next();
		                contact.get(i).set(index, newData);
		                System.out.println("Data Changed Successfully.");
		                break;
		            }
		        }
		    }


		public void userChoice() {

			int ch;
			System.out.println("Enter your choice\n 1.Add contact\n 2.Edit contact\n3.Delete contact");
			ch = sc.nextInt();
			switch (ch) {
			case 0:
				System.exit(0);
				break;
			case 1:
				contactInfo();
				break;
			case 2:
				editContact();
				break;
			case 3:
				deleteContact();
				break;
			default:
				System.out.println("Enter the valid choice:");
				userChoice();
				break;
			}
		}

		public void deleteContact() {
			System.out.println("Enter the first name of the contact you need to delete :");
			String name = sc.next();

			for (int i = 0; i < contact.size(); i++) {
				if (contact.get(i).contains(name)) {
					contact.remove(i);
					System.out.println("The contact has been deleted");
					System.out.println("Current Records in Address Book are " + contact.size());
	                break;		
	                }
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Uc5 obj = new Uc5();
			// obj.contactInfo();
			// obj.addNew();
			obj.userChoice();
		}

}

