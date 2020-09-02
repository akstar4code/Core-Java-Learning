// abstract class may or may not have abstract method but a 
// abstract method should be inside a abstract class
/*
abstract class Human
{
	public abstract void eat();
	public void walk()
	{
		
	}
}

class Man extends Human  // Concrete class
{
	public void eat()
	{
		
	}
}

public class Abstract {

	public static void main(String[] args) {
		Human obj = new Man();
	}

}
*/
class Printer
{
	public void show(Number i)
	{
		System.out.println(i);
	}
}
public class Abstract {
	int i;
	public static void main(String[] args) {
		Printer obj = new Printer();
		obj.show(5);
	}

}





