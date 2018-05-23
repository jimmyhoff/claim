import java.util.Arrays;

public class TwoToOne {
	
	public static String removeDupes(String s) {
		StringBuilder noDupes = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
	        String si = s.substring(i, i+1);
	        if (noDupes.indexOf(si) == -1) {
	            noDupes.append(si);
	        }
	    }
		return noDupes.toString();
	}
	
	public static String longest(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb.append(s2);
		String s = sb.toString();
		s = removeDupes(s);
		char[] arr = s.toCharArray();
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while (j >= 0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			char c = (char)key;
			arr[j+1] = c;
		}
		String str = new String(arr);
		return str;
	}
	public static void main(String[] args) {
		String s1 = "aertwzmnabaaabbc";
		String s2 = "ddaabb";
		
		System.out.print(longest(s1, s2));
		
	}
}


