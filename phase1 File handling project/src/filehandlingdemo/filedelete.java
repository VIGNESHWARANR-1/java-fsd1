package filehandlingdemo;

import java.io.File;

public class filedelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myfile = new File("new data.txt");
		if(myfile.delete()) {
			System.out.println("sucessfully deleted");
		}else {
			System.out.println("fail to delete");
		}

	}

}
