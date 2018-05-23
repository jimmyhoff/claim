import java.util.Scanner;
public class AllUnique {
	public static void main(String[] args) {
		//take in string and convert to array
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		boolean unique = true;
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					unique = false;
					break;
				}
			}
			if(!unique) {break;}
		}
		if (unique) {
			System.out.println("Unique");
		} else {
			System.out.println("Not unique");
		}
	}
}
