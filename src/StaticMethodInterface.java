interface Demo2
{
	int num = 8;
	void abc();
	static void show()
	{
		System.out.println("Hi ");
	}
}

class DemoImp2 implements Demo2
{
	public void abc()
	{
		// num = 10; // Final field by default
	}
}


public class StaticMethodInterface
{

	public static void main(String[] args)
	{
		Demo2.show();
	}

}
