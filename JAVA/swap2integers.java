package swap2integers;
import java.util.Scanner;
public class swap2integers {

	public static void main(String[] args) {
		int x,y,temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first integer : ");
		x=in.nextInt();
		System.out.println("Enter second integer : ");
		y=in.nextInt();
		temp=x;
		x=y;
		y=temp;
		System.out.println("After the swap, first integer is:  "+ x + " second integer is: "+y);

	}

}
