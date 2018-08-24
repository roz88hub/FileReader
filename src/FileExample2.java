import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class FileExample2 {

		public static void main(String[] args) throws IOException {
			
			File f  = new File("C:/Users/u81234/Desktop/pigs.txt");
			File f2  = new File("C:/Users/u81234/Desktop/pigs2.txt");
			FileReader readerBuff = new FileReader(f);
			BufferedReader buff = new BufferedReader(readerBuff);
			
			
			
			String output = ""; 
			String line;
			
			while((line = buff.readLine()) != null) {
				
				output += line + "\n";
				
			}
		
				
				BufferedWriter write = new BufferedWriter(new FileWriter(f2));
				write.write(f2);
				
				buff.close();
				write.close();
				
			}
			
}			
			

		
		

