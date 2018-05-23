
public class Asterisks {
	static public void main(String[] args) {
		
		//3 lines of *****
		for (int i = 0; i < 3; i++) {
			System.out.println("*****");
		}
		
		
		//ascending lines of asterisks
		for (int i = 0; i < 4; i++) {
			int count = 0;
			while(i>=count) {
				if(i==count) {
					System.out.println("*");
					count++;
				}
				else {
					System.out.print("*");
					count++;
				}

			}
		}
		
		//descending lines of asterisks
		for (int i = 4; i >= 0; i--) {
			int count = 0;
			while(i>=count) {
				if(i==count) {
					System.out.println("*");
					count++;
				}
				else {
					System.out.print("*");
					count++;
				}
			}
		}
		
		//5 lines of 1 2 3 4 5
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		//4 numbers ascending
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		//number ascending and growing
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.print("*");
				}
				else if (i+j == 4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
