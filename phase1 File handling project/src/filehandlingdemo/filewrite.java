package filehandlingdemo;

import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data = "107,v.shalini,Krct,Trichy,Tamilnadu";
		
		try {
			FileWriter output = new FileWriter("new data 1.txt");
			output.write(data);
			System.out.println("data is written sucessfully");
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file write error");;
		}

	}

}
