package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class filecreration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File myfile = new File("new data 1.txt");
		
		try {
			if (myfile.createNewFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("file not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file error");
		}

	}

}
