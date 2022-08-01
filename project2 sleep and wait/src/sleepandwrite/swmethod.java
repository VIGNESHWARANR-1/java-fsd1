package sleepandwrite;

public class swmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("example program for sleep and wait method");
		swmethod.timea();
		System.out.println("By calling timea method ,it sleep for certain seconds");
		swmethod.timeb();
		System.out.println("By calling timeb method ,it wait for certain seconds");
}
	
		public static void timea() {
			try {
				Thread.sleep(2500);				
				
			}
			catch(Exception e) {
				
			}
			
		}
		public static void timeb() {
			try {
				Thread thread = new Thread();
				thread.wait(5000);				
				
			}
			catch(Exception e) {
				
			}
			
		}

	}


