public class SelectionOperator {

	public static void main(String[] args) {
		int n = 7;
		/*
		if(n>5) {
			System.out.println("Larger");
		}
		else if(n < 5) {
			System.out.println("Smaller");
		}
		else {
			System.out.println("Equal");
		}
		*/
		// >: -> Condition?exp1:exp2   (true/false)
		int j = n > 5?1:2;
		System.out.println(j);
		// Switch 
		String t = "Ashok";
		switch(t) {
		case "a":
			System.out.println("One");
			break;
		case "g":
			System.out.println("Two");
			break;
		case "Ashok":
			System.out.println("Five");
			break;
		default:
			System.out.println("No Match");
		}
	}

}