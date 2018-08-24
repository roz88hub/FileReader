import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

/*
FileReader - reads character stream
BudderReader - needs 


 */


public class FileExample {

	public static void main(String[] args) throws IOException {

		File f  = new File("C:/Users/u81234/Desktop/pigs.txt");
		
		FileReader reader = new FileReader(f);
		//System.out.println(reader.read());  //After reading, this method reads -1
		int read;
		int counter = 0;
		/*while((read = reader.read()) != -1){
			if (read == 'h') {
				counter++;
			}
		}*/
		//System.out.println("The character h has occurred " + counter);
		reader.close();
		FileReader readerBuff = new FileReader(f);	     
		BufferedReader buff = new BufferedReader(readerBuff);
		String line;
		counter = 0;
		while((line = buff.readLine()) != null) {
			System.out.println(++counter +":" + line);

		}

		//Reading a file using Scanner
		
		/*Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		buff.close();*/
	}

}
