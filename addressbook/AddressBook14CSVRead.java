/*
 * This java program read csv file of person information
 */
package addressbook14;
import java.io.FileReader;
import com.opencsv.CSVReader;
/**
 * 
 * @author Kaif
 *
 */
public class AddressBook14CSVRead {

	public static void main(String[] args) {
		
		try {
			/*
			 * To give path of csv file to read
			 */
			CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Kaif\\Desktop\\Demo\\person.csv"));  
			String [] nextLine;  
			
			while ((nextLine = reader.readNext()) != null) {  
			for(String token : nextLine){
				
			System.out.print(token+" ");  
			}  
			System.out.println();  
			}  
		} catch (Exception e){  
			e.printStackTrace();  
		}  
	}
}
