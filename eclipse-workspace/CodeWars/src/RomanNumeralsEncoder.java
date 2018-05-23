import java.util.*;
public class RomanNumeralsEncoder {
	public static void Roman(int n) {
		//convert number to array of digits
		String nStr = Integer.toString(n);
		int[] nArray = new int[nStr.length()];
		for (int i = 0; i < nStr.length(); i++) {
			nArray[i] = Character.getNumericValue(nStr.charAt(i));
		}		
		

		
		//convert each digit into corresponding letters
		ArrayList<Character> romanChars = new ArrayList<Character>();
		for (int i = 0; i < nArray.length; i++) {
			if(nArray.length-i-1 == 0) {
				for (int j = 0; j < nArray[i]; j++){
					romanChars.add('I');
				}
			}
			else if(nArray.length-i-1 == 1) {
				for (int j = 0; j < nArray[i]; j++){
					romanChars.add('X');
				}
			}
			else if(nArray.length-i-1 == 2) {
				for (int j = 0; j < nArray[i]; j++) {
					romanChars.add('C');
				}
			}
			else if(nArray.length-i-1 == 3 ) {
				for (int j = 0; j < nArray[i]; j++) {
					romanChars.add('M');
				}
			}
		}
		
		for (int i = 0; i < nArray.length; i++) {
			if 
		}
		
		
		System.out.println(str);
		
		
		
	}
	
	public static void main(String[] args) {
		int n = 1234;
		Roman(n);
	}
}
