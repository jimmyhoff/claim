import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = in.nextLine();
		for (int i = 0; i <= (str.length()-1)/2; i++) {
			if (str.charAt(i) == str.charAt(str.length()-1-i)) {
				if (i == (str.length()-1)/2) {
					System.out.println("Palindrome");
					break;
				}
			}
			else {
				System.out.println("Not a palindrome");
				break;				
			}
		}
	}
}
