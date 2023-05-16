package File;

import java.io.File;
import java.io.IOException;

public class CreateFileDir {

	public static void main(String[] args) {
		try {
			File myobj = new File("D:\\Java\\SDET Training.txt");
			if(myobj.createNewFile()) {
				System.out.println("File created: "+myobj.getName());
				System.out.println("Absolut path : "+myobj.getAbsolutePath());
				
			}else {
				System.out.println("File already exists.");
				
			}
			
		}catch(IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}

	}

}
