/*
 * This java program read the objects information from file
 */
package addressbook;
import java.io.*;

public class AddressBook13ReadFile {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			/*
			 * To create file with path
			 */
			File filepath = new File("C:\\Users\\Kaif\\Desktop\\Demo\\AddressBook.txt");
			ObjectInputStream readfile = new ObjectInputStream(new FileInputStream(filepath));
			
			Person1 p1 = (Person1)readfile.readObject(); 
			Person1 p2 = (Person1)readfile.readObject(); 
			Person1 p3 = (Person1)readfile.readObject(); 
			
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			}catch (IOException e) {
				System.out.println("some error");
				e.printStackTrace();
				throw new RuntimeException(e);
		 }
	}
}
