/*
 * This java program create csv file of person data
 */
package addressbook14;
import com.opencsv.CSVWriter;
import addressbook.Person1;
import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Kaif
 *
 */
public class AddressBook14CSVWrite {

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
		String  zip = br.readLine();
		System.out.println("Enter phone number");
		String phoneNumber = br1.readLine();
		System.out.println("Enter email");
		String email = br2.readLine();

		String [] person1 = {firstName,lastName,address,city,state,zip,phoneNumber,email};
		
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
		String zip1 = br1.readLine();
		System.out.println("Enter phone number");
		String phoneNumber1 = sc.next();
		System.out.println("Enter email");
		String email1 = sc.next();
		
		String[] person2 = {firstName1,lastName1,address1,city1,state1,zip1,phoneNumber1,email1};
		
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
		String zip2 = br2.readLine();
		System.out.println("Enter phone number");
		String phoneNumber2 = sc.next();
		System.out.println("Enter email");
		String email2 = sc.next();
		
		String[] person3 = {firstName2,lastName2,address2,city2,state2,zip2,phoneNumber2,email2};
		
		/*
		 * To create csv file from the path
		 */
		String filepath = "C:\\Users\\Kaif\\Desktop\\Demo\\person.csv";
		
		try (CSVWriter csvWriter = new CSVWriter(new FileWriter(filepath))) {
			
			String[] header = {"First Name","Last Name","Address","City","State","Zip","Phone Number","Email"};
			
			csvWriter.writeNext(header);
			csvWriter.writeNext(person1);
			csvWriter.writeNext(person2);
			csvWriter.writeNext(person3);
			System.out.println("CSV file created successfully");
		}catch (IOException e){
		System.out.println("some error");
		e.printStackTrace();
		}
	}
}
