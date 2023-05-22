/*
 * This java program writes json file 
 */
package com.addressbook;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Scanner;
/**
 * 
 * @author Kaif
 *
 */
public class AddressBook15JsonWrite {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        
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
		String phoneNumber = br2.readLine();
		System.out.println("Enter email");
		String email = sc.next();

		 JSONObject person = new JSONObject();
		 
		 person.put("First Name",firstName);
		 person.put("Last Name",lastName);
		 person.put("Adderess",address);
		 person.put("City",city);
		 person.put("State",state);
		 person.put("Zip",zip);
		 person.put("Phone Number",phoneNumber);
		 person.put("Email",email);
		 
		 /*
		  * Add person to address book
		  */
	        JSONArray addressBook = new JSONArray();
	        addressBook.add(person);
	        
	      /*
	       *To  Write JSON file
	       */
	        try (FileWriter file = new FileWriter("C:\\Users\\Kaif\\Desktop\\Demo\\addressBook.json")) {
	            /*
	             * We can write any JSONArray or JSONObject instance to the file
	             */
	            file.write(addressBook.toJSONString()); 
	            System.out.println("Jason file created successfully");
	            file.flush();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 }
}
