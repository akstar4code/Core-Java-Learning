class W
{
	public void show() {
		System.out.println(" In W");
	}
}

class E extends W
{
	public void show() {
		System.out.println(" In E");
	}
}

class R extends W
{
	public void show() {
		System.out.println(" In R");
	}
}

public class OverrideDynamicMethodDispatch {
	// compile and runtime polymerphism
	public static void main(String[] args) {
		E obj = new E(); 
		obj.show();
		// Using Super class refrence we can call the sub class
		// only accesed only those methods which are in both
		W obj2 = new E(); // runtime polymorphism
		obj2.show();
		
		obj2 = new R(); // Dynamic method Dispatch
		obj2.show();
		
	}

}
