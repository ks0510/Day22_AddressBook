/*
 * This java program do not take duplicate elements in address book
 */
package addressbook;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Kaif
 *
 */

public class AddressBook1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Address Book Program");

		Scanner sc = new Scanner(System.in);

		/*
		 * To create buffered reader
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * To create address book by using array list data collection with person
		 * parameter(UC1)
		 */
		ArrayList<Person> addressBook1 = new ArrayList<Person>();

		/*
		 * To declare choice
		 */
		int choice;

		/*
		 * Here we are solving to use cases by using do while loop we can add data in
		 * address book one time(as mentioned in UC2) and can add data multiple time as
		 * mentioned in UC5
		 */
		do {
			System.out.println("1 TO INSERT PERSON DATA");
			System.out.println("2 TO EDIT PERSON DATA");
			System.out.println("3 To DELETE DATA");
			System.out.println("0 To Exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				/*
				 * To take data of person to add in address book
				 */
				System.out.println("Enter first name");
				String firstName = sc.next();
				System.out.println("Enter last name");
				String lastName = sc.next();
				System.out.println("Enter address");
				String address = sc.next();
				System.out.println("Enter city");
				String city = br.readLine();
				System.out.println("Enter state");
				String state = br.readLine();
				System.out.println("Enter zip");
				int zip = br.read();
				System.out.println("Enter phone number");
				String phoneNumber = sc.next();
				System.out.println("Enter email");
				String email = sc.next();

				/*
				 * To add all information we are taken from user with creating new person object
				 * every time we add data
				 */
				boolean duplicate = false;
				for (int i = 0; i < addressBook1.size(); i++) {
					if (addressBook1.get(i).getFirstName().equals(firstName)) {
						System.out.println("Duplicate entries not allowed");
						duplicate = true;
					}
				}
				if(duplicate!=true) {
					addressBook1.add(new Person(firstName,lastName,address,city,state,zip,phoneNumber,email));
				}
				break;
			case 2:
				/*
				 * This case will check for person name in address book and update it if it
				 * found name or report that person information is not found
				 */
				System.out.println("Enter person's first name to serch it and edit the data");
				String name = br1.readLine();
				boolean status = false;
				/*
				 * To find person name in address book
				 */
				for (int i = 0; i < addressBook1.size(); i++) {
					if (addressBook1.get(i).getFirstName().equals(name)) {
						System.out.println("Person found please enter new data");
						System.out.println("Enter first name");
						String firstName1 = br1.readLine();
						System.out.println("Enter last name");
						String lastName1 = br1.readLine();
						System.out.println("Enter address");
						String address1 = br1.readLine();
						System.out.println("Enter city");
						String city1 = br1.readLine();
						System.out.println("Enter state");
						String state1 = br1.readLine();
						System.out.println("Enter zip");
						int zip1 = br1.read();
						System.out.println("Enter phone number");
						String phoneNumber1 = sc.next();
						System.out.println("Enter email");
						String email1 = sc.next();
						/*
						 * To set edited data at that position
						 */
						addressBook1.set(i,
								new Person(firstName1, lastName1, address1, city1, state1, zip1, phoneNumber1, email1));
						System.out.println("Information updated successfully");
						status = true;
					}
				}
				/*
				 * If we not found any data it will print it
				 */
				if (!status) {
					System.out.println("Person not found");
				}
				break;
			case 3:
				/*
				 * To take name from user and find if we found we will delete it
				 */
				System.out.println("Enter person's first name to serch it and delete data");
				String pname = br2.readLine();
				boolean status1 = false;
				/*
				 * To find person name in address book
				 */
				for (int i = 0; i < addressBook1.size(); i++) {
					if (addressBook1.get(i).getFirstName().equals(pname)) {
						/*
						 * To remove data
						 */
						addressBook1.remove(i);
						System.out.println("Data deleted successfully");
						status1 = true;
					}
				}
				if (!status1) {
					System.out.println("Person not found");
				}
				break;
			case 0:
				/*
				 * If you put zero as choice you will out of this loop
				 */
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice");

			}
		} while (choice != 0);

		System.out.println(addressBook1);

	}

}
