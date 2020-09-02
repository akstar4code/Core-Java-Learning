package com.unquie;

class Counter
{
	int count;
	public synchronized void increment() //One thread will be work
	{
		count++ ;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		//c.increment();
		Thread p1 = new Thread(new Runnable()
				{
					public void run()
					{
						for(int i=1; i<=1000;i++)
						{
							c.increment();
						}
					}
				});
		Thread p2 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1; i<=1000;i++)
				{
					c.increment();
				}
			}
		});
		p1.start();
		p2.start();
		p1.join();
		p2.join();
		System.out.println("Count "+ c.count);
	}

}
