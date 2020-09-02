class Calc2
{
	public int add(int ...i) // {1,2,3,4,5,6} // store as  array
	{
		int sum=0;
		for(int k:i)
		{
			sum += k;
		}
		return sum;
	}
}

public class varargsDemo {
	public static void main(String[] args) {
		Calc2 obj = new Calc2();
		System.out.println(obj.add(4,5,6,7,3,1,3,8));
	}

}
