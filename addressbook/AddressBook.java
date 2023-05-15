/*
 * This java program add multiple address books from user
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
/*
 * To define method which create array list and return it 
 */
public class AddressBook {
	
	
	public static ArrayList<Person> toAddAddressBook(){
		ArrayList<Person> list = new  ArrayList<Person>();
		return list;
	}
	
	/**
	 * This is main method of program
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of address book you want to add ");
		
	    int number = sc.nextInt();
		
		ArrayList<ArrayList> addressbooks = new ArrayList<ArrayList>();
		
		/*
		 * Creating address book and adding it to main book
		 */
		for(int i=0;i<number;i++) {
			addressbooks.add(toAddAddressBook());
		}
		}
}
