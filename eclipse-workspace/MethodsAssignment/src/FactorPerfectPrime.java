import java.util.Scanner;
public class FactorPerfectPrime {
	
	//method to find if an int is a factor of another
	public static boolean factor(int k, int n) {
		if (n%k == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//method to find if an int is perfect
	public static boolean perfect(int p) {
		int total = 0;
		for (int i = 1; i <= p/2; i++) {
			if (factor(i, p)) {
				total = total+i;
			}
		}
		if (total == p) {
			return true;
		} else {
			return false;
		}
	}
	
	//method to find if an int is prime
	public static boolean prime(int p) {
		for (int i = 2; i <= p/2; i++) {
			if (factor(i, p)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt(); 
		System.out.println("Enter another number to see if it is a factor of " +(n));
		int k = in.nextInt(); 
		
		if(factor(k,n)) {
			System.out.println((k)+" is a factor of "+(n));
		} else {
			System.out.println((k)+" is not a factor of "+(n));
		}

		
		System.out.println("Enter a number to see if it is perfect and/or prime ");
		int p = in.nextInt();
		if (perfect(p)) {
			System.out.println((p)+" is a perfect number.");
		} else {
			System.out.println((p)+" is not a perfect number.");
		}
		
		if (prime(p)) {
			System.out.println((p)+" is a prime number.");
		} else {
			System.out.println((p)+" is not a prime number.");
		}
	}
}
