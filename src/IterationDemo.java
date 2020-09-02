
public class IterationDemo {
	public static void main(String[] args) {
		// while, do while, for, for-each
		/*
		int i = 5;
		while(i<=5) {
			System.out.println("Hello");
			i++ ;
		}
		do {
			System.out.println("Hello");
			i++ ;
		}while(i<=5);
		*/
		for(int i=4;i<=5;i++) {
			System.out.println("hello");
		}
		for(int j=1; j<= 4; j++) {
			for(int k = 1; k <= 4; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
