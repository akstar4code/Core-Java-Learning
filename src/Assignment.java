
public class Assignment {

	public static void main(String[] args) {
		/*
		for(int i=1;i<=6;i++) {
			for(int j=1; j<=i;j ++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
		/*
		for(int i=65;i<=67;i++) {
			for(int j=65; j<= i; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		*/
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1 | i == 4)
					System.out.print("$ ");
				else {
					if (j==2 | j == 3)
						System.out.print("  ");
					else
						System.out.print("$ ");
				}
			}
			System.out.println();
		}
	}

}
