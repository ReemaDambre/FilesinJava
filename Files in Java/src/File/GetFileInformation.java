package File;

import java.io.File;

public class GetFileInformation {

	public static void main(String[] args) {
	File myobj = new File("D:\\Java\\Reema.txt");
	if(myobj.exists()){
		System.out.println("File name: "+ myobj.getName());
		System.out.println("Absolute path:"+myobj.getAbsolutePath());
		System.out.println("Writable : "+myobj.canWrite());
		System.out.println("Readable "+myobj.canRead());
		System.out.println("File size in byte "+myobj.length());
		
	}else {
		System.out.println("The file does not exist.");
		
	}

	}

}
