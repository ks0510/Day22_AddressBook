/*
 * This java program give person's information by city name.
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

public class AddressBook3 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * To create address book with city and person information
		 */
		HashMap<String,Person> addressBook1=new HashMap<String,Person>();
		
		/*
		 * To create address book with state and person inforamtion
		 */
		HashMap<String,Person> addressBook2=new HashMap<String,Person>();
		
		/*
		 * To take user input for pesron information we are making person object with different information
		 * 1)First name 2)Second name 3) Address 4)City 5)State 6)Zip code 7)Phone number 8)Email
		 */
		System.out.println("enter person1 information");
		Person p1 = new Person(br.readLine(),br.readLine(),br.readLine(),br.readLine(),br.readLine(), br.read(),br.readLine(),br2.readLine());
		System.out.println("enter person2 information");
		Person p2 = new Person(br1.readLine(),br1.readLine(),br1.readLine(),br1.readLine(),br1.readLine(), br1.read(),br1.readLine(),br1.readLine());
		System.out.println("enter person3 information");
		Person p3 = new Person(br2.readLine(),br2.readLine(),br2.readLine(),br2.readLine(),br2.readLine(), br2.read(),br2.readLine(),br2.readLine());
	
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
		Set<Map.Entry<String,Person>> entries = addressBook1.entrySet();
		
		for(Map.Entry<String,Person> p : entries) {
			System.out.println(p.getKey());
			Person person = p.getValue();
			System.out.println(person);
		}
		
		/*
		 * Adding to address book with respect to state
		 */
		
		addressBook2.put(p1.getState(), p1);
		addressBook2.put(p2.getState(), p2);
		addressBook2.put(p3.getState(), p3);
		
		/*
		 * To display our addressbook2
		 * 
		 */
		Set<Map.Entry<String,Person>> entries2 = addressBook2.entrySet();
		
		for(Map.Entry<String,Person> p : entries2) {
			System.out.println(p.getKey());
			Person person = p.getValue();
			System.out.println(person);
		}
		}
	}

