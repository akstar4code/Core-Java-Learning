// Abstract class -> Define and Declare
// Interface -> declare -> 1.7
// 1.8 can be define methods in Interface


//One abstract method, we can any number of default method
// default can be override to

@FunctionalInterface
interface Demo
{
	void abc();
	default void show()
	{
		System.out.println(" In Show");
	}
}
class DemoImp implements Demo
{
	public void abc()
	{
		System.out.println(" In abc");
	}
}

public class DefaultMethodInterface {

	public static void main(String[] args) {
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();
	}

}

// Multiple implementation problem solved by defining method in function



