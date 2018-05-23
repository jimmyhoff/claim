import java.util.Scanner;
public class Interest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your initial investment: ");
		double investment = in.nextDouble();
		System.out.println("Enter your monthly interest rate: ");
		double rate = in.nextDouble();
		System.out.println("Enter how long your investment will be in years: ");
		double numYears = in.nextDouble();
		double interest = investment*(1+(rate/100)/12*numYears);
		System.out.println("You will receive "+(interest)+" in interest");
	}
}

