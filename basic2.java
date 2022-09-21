package basic2;
import java.util.Scanner;
public class basic2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for i..");
		int i=scan.nextInt();
		System.out.println("Enter value for j...");
		int j=scan.nextInt();
		int mul=i*j;
		System.out.println("The multiplication of i and j is..."+mul);

	}

}
