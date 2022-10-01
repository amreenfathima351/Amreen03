package pensioncontributioncalculator;
import java.util.Scanner;
public class pensioncontributioncalculator {

	public static void main(String[] args) {
		int size;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size : ");
		size=in.nextInt();
		for(int row=1;row<=size;row++) {
			for(int col=1;col<=size;col++) {
				System.out.print(" # ");
			}
			System.out.println();
		}
		

	}

}
