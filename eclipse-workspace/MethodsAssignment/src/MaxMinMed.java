import java.text.DecimalFormat;
import java.util.Scanner;
public class MaxMinMed {
	
	//method for taking in array of numbers
	public static int [] readNumsFromCommandLine() {
		
		//initialize scanner
        Scanner s = new Scanner(System.in);
        
        //find how many integers to be taken in
        System.out.println("Enter the amount of integers you want to take in: ");
        int count = s.nextInt();
        s.nextLine();
        
        //start taking in integers
        System.out.println("Enter your integers: ");
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
    
	//finds max value in array of ints
	public static int max(int[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	//finds min value in array of ints
	public static int min(int[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	//finds median value in array of ints
	public static float median(int[] numbers) {
		if (numbers.length%2 == 1) {
			return Math.round(numbers[numbers.length/2]);
		} else {
			float m1 = numbers[numbers.length/2];
			float m2 = numbers[numbers.length/2-1];
			return (m1+m2)/2;
		}
	}	
	
	
	
	public static void main(String[] args) {
		//get array of ints
		int[] numbers = readNumsFromCommandLine();
		
		//print max, min, and median values
		System.out.println("Max number is: "+(max(numbers)));
		System.out.println("Min number is: "+(min(numbers)));
		System.out.println("Median is: "+(median(numbers)));
	}
}

