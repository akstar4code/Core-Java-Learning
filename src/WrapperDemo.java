// int,        float,   double
// Integer    Float    Double

public class WrapperDemo {

	public static void main(String[] args) {
		int i = 5; // Primitive datatype
		Integer i1 = new Integer(i); // Boxing - Wrapping
		// Integer i1 = Integer.valueOf(i);
		int j = i1.intValue();  //unboxing  - unwrapping
		
		Integer value = i; // Autoboxing
		int k = value;     // Autounoxing
		
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.print(n);
		
		}

}
