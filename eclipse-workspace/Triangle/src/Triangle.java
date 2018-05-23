import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter the base of the triangle: ");
		float base = in.nextFloat();
		System.out.println("Enter the height of the triangle: ");
		float height = in.nextFloat();
		float area = 1/2*base*height;
		System.out.println("The area of the triangle is: "+(area));
	}
}
