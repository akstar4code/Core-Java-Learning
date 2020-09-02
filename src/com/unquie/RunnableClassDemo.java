package com.unquie;
public class RunnableClassDemo {

	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(() ->
						{
							for(int i=1; i<=5; i++)
							{
								System.out.println("Hii " + Thread.currentThread().getPriority());
								try { Thread.sleep(1000);} catch (Exception e) {}
							}
						}," Hi Thead");
		Thread t2 = new Thread(() ->
						{
							for(int i=1; i<=5; i++)
							{
								System.out.println("Helloo");
								try { Thread.sleep(1000);} catch (Exception e) {}
							}
						}, " Hello Thread ");
		
		//t1.setName("Hi Thead");
		//t2.setName("Hello Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.setPriority(1); // MIN_PRIORITY
		t2.setPriority(10); // MAX_PRIORITY
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try { Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		System.out.println(t1.isAlive()); // detect thread is running or not
		
		t1.join();
		t2.join();
		
		System.out.println("Bye");

	}

}
