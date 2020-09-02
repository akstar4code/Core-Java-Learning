final class D  // final class limit the extends and can't extend anymore
{
	final int i; // constant
	public D()
	{
		i = 10;
		// i = 20; // can't be initited again.
	}
	public final void show()  // No one can override the methods
	{
		System.out.println("Hello");
	}
}

class N
{
	
}

public class FinalDemo {

	public static void main(String[] args) {
		D obj = new D();
		System.out.println(obj.i);

	}

}
