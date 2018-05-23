import java.util.Scanner;

public class RemoveChar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = in.nextLine();
		System.out.println("Enter the char you would like to remove: ");
		char c = in.next().charAt(0);
		StringBuilder sb = new StringBuilder(str);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				sb.deleteCharAt(i-count);
				count++;
			}
		}
		str = sb.toString();
		System.out.println(str);
	}
}
