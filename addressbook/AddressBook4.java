/*
 * This java program give person's information by city name.
 * This java program count number of persons in address book by city and state.
 */
package addressbook;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddressBook4 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * To create address book with city and person information
		 */
		HashMap<String,Person1> addressBook1=new HashMap<String,Person1>();
		
		/*
		 * To create address book with state and person inforamtion
		 */
		HashMap<String,Person1> addressBook2=new HashMap<String,Person1>();
		
		/*
		 * To take user input for pesron information we are making person object with different information
		 * 1)First name 2)Second name 3) Address 4)City 5)State 6)Zip code 7)Phone number 8)Email
		 */
		System.out.println("enter person1 information");
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

		Person1 p1 = new Person1(firstName,lastName,address,city,state,zip,phoneNumber,email);
		
		System.out.println("enter person2 information");
		System.out.println("Enter first name");
		String firstName1 = sc.next();
		System.out.println("Enter last name");
		String lastName1 = sc.next();
		System.out.println("Enter address");
		String address1 = sc.next();
		System.out.println("Enter city");
		String city1 = sc.next();
		System.out.println("Enter state");
		String state1 = br2.readLine();
		System.out.println("Enter zip");
		int zip1 = br1.read();
		System.out.println("Enter phone number");
		String phoneNumber1 = sc.next();
		System.out.println("Enter email");
		String email1 = sc.next();
		
		Person1 p2 = new Person1(firstName1,lastName1,address1,city1,state1,zip1,phoneNumber1,email1);
		
		System.out.println("enter person3 information");
		
		System.out.println("Enter first name");
		String firstName2 = sc.next();
		System.out.println("Enter last name");
		String lastName2 = sc.next();
		System.out.println("Enter address");
		String address2 = sc.next();
		System.out.println("Enter city");
		String city2 = sc.next();
		System.out.println("Enter state");
		String state2 = sc.next();
		System.out.println("Enter zip");
		int zip2 = br2.read();
		System.out.println("Enter phone number");
		String phoneNumber2 = sc.next();
		System.out.println("Enter email");
		String email2 = sc.next();
		
		Person1 p3 =  new Person1(firstName2, lastName2, address2, city2, state2, zip2, phoneNumber2, email2);
	
		/*
		 * Adding to address book with respect to city 
		 */
		
		addressBook1.put(p1.getCity(), p1);
		addressBook1.put(p2.getCity(), p2);
		addressBook1.put(p3.getCity(), p3);
		
		/*
		 * To display our addressbook1
		 * 
		 */
		Set<Map.Entry<String, Person1>> entries = addressBook1.entrySet();

		int count = 0;
		for (Map.Entry<String, Person1> p : entries) {
			System.out.println(p.getKey());
			Person1 person = p.getValue();
			System.out.println(person);
			if (p.getKey() == city) {
				count++;
				Person1 person1 = p.getValue();
				System.out.println(person);
			}
		}
		System.out.println(count + "are numbers of persons in address book");

		/*
		 * Adding to address book with respect to state
		 */
		
		addressBook2.put(p1.getState(), p1);
		addressBook2.put(p2.getState(), p2);
		addressBook2.put(p3.getState(), p3);
		
		 /*
		  *  To display our addressbook2 To count persons from addressbook2
		 */
		int count1=0;
		Set<Map.Entry<String, Person1>> entries2 = addressBook2.entrySet();

		for (Map.Entry<String, Person1> p : entries2) {
			System.out.println(p.getKey());
			if (p.getKey() == state) {
				count1++;
				Person1 person = p.getValue();
				System.out.println(person);
			}
		}
		System.out.println(count1 + "are numbers of persons in address book");
	}
}