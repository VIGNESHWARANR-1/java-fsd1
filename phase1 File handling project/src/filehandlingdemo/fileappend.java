package filehandlingdemo;

import java.io.FileWriter;
import java.io.IOException;

public class fileappend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data = "this data is appended";
		
		
		try {
			FileWriter output = new FileWriter("new data 1.txt",true);
			output.write(data);
			System.out.println("data appended");
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file error");
		}


	}

}
