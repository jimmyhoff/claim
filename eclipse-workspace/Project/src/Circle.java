import java.util.Scanner;
public class Circle {
	public static void main(String[]  args)  {
		Scanner in = new Scanner(System.in); 
		double r;
		System.out.println("Enter the radius of the circle: \n");
		r = in.nextFloat();
		double circum = 2*Math.PI*r;
		double area = Math.PI*Math.pow(r, 2);
		System.out.println("The circumference is "+(circum)+". The area is "+(area));
		
		
		
		
	}
}
