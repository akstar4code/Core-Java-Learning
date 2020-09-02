
public class First {

	public static void main(String[] args) {
		long l = 5000000000000000l;      // 8 bytes 
		System.out.println(l);
		int num = 50_00_00_000; // 4 bytes --> 32bits
		short s = 5;       // 2bytes   --> 16bits
		byte b = 5;  /// 1 bytes --> 8 bits
		System.out.println(b);
		System.out.println(s);
		System.out.println(num);
		num = 15;
		System.out.println(num);
		float perc = 5.5f;
		System.out.println(perc);
		double per = 5.5;
		System.out.println(per);
		System.out.println("Hello World");
		
		char c = 'A';
		c = 66;
		System.out.println(c);
		
		double d1 = 5; //implicit conversion
		int k = (int)5.5; // Type casting Explicit conversion
		
	}

}
