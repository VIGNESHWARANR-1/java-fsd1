package assistproject;
class Table 
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table c = new Table();
		
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{c.increment();	}}			
		});
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();}
			}		
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		System.out.println("count " + c.count);
		

	}

}
