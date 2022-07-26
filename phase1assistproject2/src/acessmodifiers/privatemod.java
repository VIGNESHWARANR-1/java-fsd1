package acessmodifiers;

public class privatemod {
	private void mod1() {
		System.out.println("private access modifier");
	}
	protected void mod2() {
		System.out.println("protected access modifier");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privatemod pm = new privatemod();
		pm.mod1();		

	}

}
