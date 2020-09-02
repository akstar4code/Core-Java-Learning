// Overriding 


// Ambiguity show in P and Q
class Q
{
	// int i = 8;
	public void show() {
		System.out.println(" In Q ");
	}
}

class P extends Q
{
	// int i = 6;
	// super.i = 15; // varibale access of parent
	@Override
	public void show() {
		// super.show(); // calling both methods
		System.out.println(" In P ");
	}
}

public class MultipleInheritance {

	public static void main(String[] args)
	{
		P obj = new P();
		obj.show();
	}

}
