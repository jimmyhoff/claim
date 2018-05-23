import java.util.Scanner;
public class Xor {
	
	
	public static boolean xorTwoBools (boolean fb, boolean sb) {
		if (fb == sb) {
				return false;
			} else {
				return true;
			}
		}

	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first boolean: ");
		boolean fb = s.nextBoolean();
		System.out.println("Enter the second boolean: ");
		boolean sb = s.nextBoolean();
		System.out.println("The two booleans xor'ed is "+xorTwoBools(fb, sb));
	}
}
