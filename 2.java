import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class program2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		 try { 
			 BufferedReader br = new BufferedReader(new FileReader("D:\\F2\\Sacramentorealestatetransactions.csv"));
			 String line;
			 while ((line = br.readLine()) != null) {
			     // use comma as separator
			     String[] cols = line.split(",");
			     System.out.println("Price=" + cols[9]);
			 }
			 br.close();
	       } 
		 catch (Exception e) { 
	            e.printStackTrace(); 
	        } 
	}
}
