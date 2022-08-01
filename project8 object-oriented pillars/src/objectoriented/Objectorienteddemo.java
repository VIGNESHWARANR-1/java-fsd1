package objectoriented;

class libbook{
	String Title;
	int edition;
}

public class Objectorienteddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		libbook bookdetails = new libbook();
		bookdetails.Title ="JAVA introduction";
		bookdetails.edition=2018;
		System.out.println(bookdetails.Title);
		System.out.println(bookdetails.edition);
		

	}

}
