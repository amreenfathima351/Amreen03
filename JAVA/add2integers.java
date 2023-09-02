package add2integers;
import java.util.Scanner;

public class add2integers {

	public static void main(String[] args) {
		int number1,number2,sum;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first integer : ");
		number1=in.nextInt();
		System.out.println("Enter the second integer : ");
		number2=in.nextInt();
		in.close();
		sum=number1+number2;
		System.out.println("The sum is : "+sum);
		System.out.println();
		

	}

}
