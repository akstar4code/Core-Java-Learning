class Calc
{
	// knows something
	int num1;
	int num2;
	int result;
	// does the something
	public void perform(){
		System.out.println(result); // default value 0 for int
		result = num1+num2;
		System.out.print(result);
	}
	
	
}

public class ClassAndObject {

	public static void main(String[] args) {
		// Calc obj; //Reference
		Calc obj = new Calc();  //knows something and does something
		obj.num1 = 25;
		obj.num2 = 25;
		obj.perform();
		
	}

}
