import java.util.Scanner;
public class evenODD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = in.nextLine();
		str.toLowerCase();
		for (int i = 0; i < str.length(); i++)
			if (i%2 == 1) {
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}
			else {
				System.out.print(str.charAt(i));
			}
	}
}
