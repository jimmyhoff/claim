import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your height in inches: ");
		double height = in.nextDouble();
		System.out.println("Enter your weight in pounds: ");
		double weight = in.nextDouble();
		
		double BMI = (weight/Math.pow(height,2))*703;
		System.out.println("Your BMI is: "+(BMI));
	}
}
