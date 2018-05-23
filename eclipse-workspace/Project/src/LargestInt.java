import java.util.Scanner;
import java.util.Arrays;
public class LargestInt {
	public static int [] readNumsFromCommandLine() {

        Scanner s = new Scanner(System.in);
        
        int count = s.nextInt();
        s.nextLine();
        
        int [] numbers = new int[count];
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }
        return numbers;
    }
	
	public static void main(String[] args) {
		int[] numbers = readNumsFromCommandLine();
		int largest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.print(largest);		
	}
}

