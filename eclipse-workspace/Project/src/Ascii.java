import java.util.Scanner;
public class Ascii {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter to find its ASCII value: ");
		char c = in.next().charAt(0);
		int asciiVal = c;
		System.out.println("The ASCII value is "+(asciiVal));
	}
}
