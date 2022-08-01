package filehandlingdemo;

import java.io.FileReader;
import java.io.IOException;

public class fileread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				char[] data = new char[100];
				try {
					FileReader input = new FileReader("new data 1.txt");
					input.read(data);
					System.out.println("Data recived");
					System.out.println(data);
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("file read error");
				}

	}

}
