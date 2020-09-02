class A
{
	int i;
	int j;
	public A() {
		i = 5;
		j = 10;
		System.out.println("Non Paramaterized");
	}
	public A(int i,int j) {
		this.i = i; // current object or instance
		this.j = j;
		System.out.print("Paramaterized");
	}
}
public class ConstructorAndClass {

	public static void main(String[] args) {
		A obj = new A();
		A obj2 = new A(6,6);
	}

}
