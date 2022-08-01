package threadimplementrunnable;

public class thread  implements Runnable{
	public void run()  
	{    
	System.out.println("Thread is running ...");    
	}    

	public static void main(String[] args) {
		Runnable rn = new thread();    
		Thread t1 = new Thread(rn, "This is new thread");    
		t1.start();
		String s = t1.getName();  
		System.out.println(s);  

	}

}
