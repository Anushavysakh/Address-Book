package com.addressbook.bridglabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Uc6 {

	  static HashMap<String, ArrayList> books = new HashMap<>();
	  Scanner sc = new Scanner(System.in);

	public void contactInfo(ArrayList<ArrayList<String>> contact) {
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
		System.out.println("Do you want to add another contact to the Address Book? (Y/N)");
		String choice = sc.next();
		if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
			contactInfo(contact);
		} else {
			userChoice();
		}
	}
	
	  public void displayContact(ArrayList<ArrayList<String>> contact) {
	        for(int i = 0; i < contact.size(); i++) {
	            for (int j = 0; j < contact.get(i).size(); j++) {
	                System.out.print(contact.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	    }
		 public void editContact(ArrayList<ArrayList<String>> contact) {
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


		  public ArrayList<ArrayList<String>> userChoice() {
		        ArrayList<ArrayList<String>> contact = new ArrayList<ArrayList<String>>();
		        System.out.println("Current Records present in the Address Book are " + contact.size());
		        System.out.println("Please select your choice, do you want to\n " +
		                            "0) Exit the Program\n" +
		                            "1) Add New Contact\n" +
		                            "2) Edit Existing Contact\n" +
		                            "3) Delete a Contact\n" +
		                            "4) Display All Contacts\n" +
		                            "5) Add New Address Book");
		        int choice = sc.nextInt();
		        switch (choice) {
		            case 0:
		                return contact;
		            case 1:
		                contactInfo(contact);
		                return contact;

		            case 2:
		                editContact(contact);
		                return contact;

		            case 3:
		                deleteContact(contact);
		                return contact;

		            case 4:
		                displayContact(contact);
		                return contact;

		            case 5:
		                addBooks();
		                return contact;

		            default:
		                System.out.println("Please enter the Number associated with the choice");
		                userChoice();
		                break;
		        }
		        return contact;
		    }

		public void deleteContact(ArrayList<ArrayList<String>> contact) {
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
		
		public void addBooks() {
	        System.out.println("Current Number of Address Books in the Database are: " + books.size());
	        System.out.print("Enter the Address Books Name: ");
	        books.put(sc.next(), userChoice());
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Uc6 obj = new Uc6();
			// obj.contactInfo();
			// obj.addNew();
			obj.userChoice();
			obj.addBooks();
			
		}

}

