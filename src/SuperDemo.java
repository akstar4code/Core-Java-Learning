class A2
{
	public A2() {
		System.out.println("Class A");
	}
	public A2(int j) {
		System.out.println("Class A + int");
	}
}
class B extends A2
{
	public B() {
		super(5);
		System.out.println("Class B");
	}
	public B(int j) {
		super(j);
		System.out.println("Class B + int");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		B obj = new B();
		B obj2 = new B(5);

	}

}
