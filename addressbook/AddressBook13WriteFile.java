/*
 * This java program write the address book file.
 */
package addressbook;
import java.io.*;
import java.util.Scanner;
/**
 * 
 * @author Kaif
 *
 */
public class AddressBook13WriteFile {
	/**
	 * This is main method of program and starting point of program
	 * @param args
	 * @throws IOException
	 */
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
		
		Person1 p3 = new Person1(firstName2,lastName2,address2,city2,state2,zip2,phoneNumber2,email2);
		
		try {
			/*
			 * To create file with path
			 */
			File filepath = new File("C:\\Users\\Kaif\\Desktop\\Demo\\AddressBook.txt");
			
			/*
			 * Object output stream will write object in file
			 */
			ObjectOutputStream fileWriter = new ObjectOutputStream( new FileOutputStream(filepath));
			
			/*
			 * To write object in file
			 */
			fileWriter.writeObject(p1);
			fileWriter.writeObject(p2);
			fileWriter.writeObject(p3);
		}
		catch(IOException e) {
			System.out.println("some error");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
