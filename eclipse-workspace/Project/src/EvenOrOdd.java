import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to find if it is even or odd: ");
		int num = in.nextInt(); 
		if (num%2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");		}
	}
}
