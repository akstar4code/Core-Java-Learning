class Emp
{
	int eid;
	int salary;
	static String ceo;
	static
	{
		ceo = "Ram Chandra";
	}
	public Emp()
	{
		eid = 1;
		salary = 3000;
	}
	public void show() {
		System.out.println(eid + " : " + salary + " : "+ceo);
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		Emp ashok = new Emp();
		ashok.eid = 8;
		ashok.salary = 4000;
		//Emp.ceo = "Ram";
		
		Emp kumar = new Emp();
		kumar.eid = 81;
		kumar.salary = 40000;
		//Emp.ceo = "Chandra"; // Object or class name, class is prefred
		
		ashok.show();
		kumar.show();
		
	}

}
