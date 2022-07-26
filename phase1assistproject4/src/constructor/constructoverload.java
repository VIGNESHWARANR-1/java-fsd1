package constructor;

public class constructoverload {
	String name;
	constructoverload(){
		this.name= "karthik";
}
	constructoverload(String name){
		this.name = name;
	}
	public void getName() {
		System.out.println("The student name is: " + this.name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructoverload name1 = new constructoverload();
		constructoverload name2 = new constructoverload("shalini");
		name1.getName();
		name2.getName();

	}

}
