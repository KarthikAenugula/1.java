import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class program1 {

	public static void main(String[] args) throws FileNotFoundException {
		
      BufferedReader reader1 = new BufferedReader(new FileReader("D:\\F1\\F1.txt"));
      BufferedReader reader2 = new BufferedReader(new FileReader("D:\\F2\\F2.txt"));
	   
         List<String> result=new ArrayList<String>();

             try {
          while(!(reader1.readLine().equals(reader2.readLine()))) {
               result.add(reader1.readLine());
             }
            reader1.close();
                reader2.close();
         } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }	       
       }	
}
