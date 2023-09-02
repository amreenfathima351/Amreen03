package circlecomputation;
import java.util.Scanner;
public class circlecomputation {

	public static void main(String[] args) {
		double radius,diameter,circumference,area;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius : ");
		radius=in.nextDouble();
		diameter = 2.0 * radius;
		System.out.printf("Diameter is : %.2f%n",diameter);
		area =Math.PI * radius * radius;
		System.out.printf("Area is : %.2f%n",area);
		circumference = 2.0 * Math.PI * radius;
		System.out.printf("circumference is : %.2f%n",circumference);
		

	}

}
