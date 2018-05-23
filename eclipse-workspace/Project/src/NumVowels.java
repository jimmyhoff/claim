import java.util.Scanner;
public class NumVowels {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = in.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a'
				|| str.charAt(i) == 'e' 
				|| str.charAt(i) == 'i' 
				|| str.charAt(i) == 'o' 
				|| str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);

	}
}
