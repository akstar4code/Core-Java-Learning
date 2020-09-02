class Outer
{
	static int a;
	public static void show()
	{
		
	}
	static class Inner
	{
		public void display() {
			System.out.println("in display");
		}
	}
}


public class InnerDemo
{

	public static void main(String[] args)
	{
		Outer obj = new Outer();
		Outer.show();
		//Outer.Inner obj2 = obj.new Inner(); // when non -static class
		Outer.Inner obj2 = new Outer.Inner(); // static class
		obj2.display();
	}

}
