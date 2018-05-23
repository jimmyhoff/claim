import java.util.Scanner;
public class Rounding {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to be rounded: ");
		double num = in.nextDouble();
		System.out.println("The number rounded is: "+Math.round(num));
	}
}
