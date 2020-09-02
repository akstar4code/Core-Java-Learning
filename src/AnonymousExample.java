class J
{
	public void show()
	{
		System.out.println("In A Show");
	}
}

/*
class F extends J
{
	public void show()
	{
		System.out.println("I am Best");
	}
}
*/
// above can be replace as

public class AnonymousExample {

	public static void main(String[] args) {
		// One time use and want to override the class
		J obj = new J()
				{
					public void show()
					{
						System.out.println(" Im a Best");
					}
				};
		obj.show();
	}

}
