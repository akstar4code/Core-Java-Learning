/*
class Abc
{
	
}
// only abstract method no other method(possible in abstract class)
interface Writer
{
	void write();  // by default public abstract
}
class Pen extends Abc implements Writer // any number of implements interface
{
	public void write()
	{
		System.out.println("In a pen");
	}
}

class Pencil implements Writer
{
	public void write()
	{
		System.out.println("In a Pencil");
	}
}
class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}


public class InterfaceClass {

	public static void main(String[] args) {
		Kit k = new Kit();
		//Pen p = new Pen();
		//Pencil pc = new Pencil();
		Writer p = new Pen();  // reference of interface only
		Writer pc = new Pencil();
		k.doSomething(p);
	}

}
*/

interface Abc
{
	void show();
}

class Implimentor implements Abc
{
	public void show()
	{
		System.out.println("Anything ");
	}
}

public class InterfaceClass {
	
	public static void main(String[] args) {
		Abc obj = new Implimentor();
		obj.show();
	}
}



