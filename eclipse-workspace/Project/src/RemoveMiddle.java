import java.util.Scanner;
public class RemoveMiddle {
	public static void main(String[] args) {
		//initialize scanner
		Scanner in = new Scanner(System.in);
		
		//ask user for string and take string
		System.out.println("Enter your string: ");
		String str = in.nextLine();
		
		//initialize stringbuilder for future manipulation
		StringBuilder sb = new StringBuilder(str);
		
		int ind = str.length()/2;
		if (str.length()%2 == 0) {
			sb.deleteCharAt(ind);
			sb.deleteCharAt(ind-1);	
		} else {
			sb.deleteCharAt(ind);
		}
		str = sb.toString();
		System.out.println(str);
	}
}
