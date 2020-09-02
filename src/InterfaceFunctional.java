// Types of interface
//1. Normal
//2. Single abstract method - Functional Interface -- Lambda Express ion -- Scala
//3. Marker interface

@FunctionalInterface
interface Hello
{
	void show();
}

public class InterfaceFunctional {

	public static void main(String[] args) {
		Hello obj  = () -> System.out.println("Im the best"); // Lambda Expression
		obj.show();
	}

}
