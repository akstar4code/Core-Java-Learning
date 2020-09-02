// IS-A(extends) , HAS-A (object creation)

class Calculator{  //super
	public int add(int i, int j) {
		return i+j;
	}
}

class CalcAdv extends Calculator{ //sub
	public int sub(int i, int j) {
		return i-j;
	}
}
class CalcVAdv extends CalcAdv{
	public int multi(int i, int j) {
		return i*j;
	}
}


public class InheritanceDemo
{

	public static void main(String[] args)
	{
		CalcVAdv c1 = new CalcVAdv();
		int result1 = c1.add(5, 4);
		int result2 = c1.sub(5, 4);
		int result3 = c1.multi(5, 4);
		System.out.println(result1+" "+result2+" "+result3);

	}

}
