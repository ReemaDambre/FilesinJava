package File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter mywriter =new FileWriter("D:\\Java\\Reema.txt");
			mywriter.write("Welcome to Wipro Technologies | All the best for leraning");
			mywriter.close();
			System.out.println("Successfully wrote the file.");
		}catch (IOException e) {
			System.out.print("An error occured.");
			e.printStackTrace();
		
		}

	}

}
